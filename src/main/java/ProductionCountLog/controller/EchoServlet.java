package ProductionCountLog.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import ProductionCountLog.entity.Shift;
import ProductionCountLog.persistence.GenericDao;
import ProductionCountLog.persistence.ShiftDao;
import ProductionCountLog.persistence.UserDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet(
        urlPatterns = {"/echo"}
)

public class EchoServlet extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());
    Shift shift = new Shift();
    GenericDao shiftDao = new GenericDao(Shift.class);

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // Set the response message's MIME type
        response.setContentType("text/html; charset=UTF-8");

        //Get values from form and insert into user
        String date = request.getParameter("date");

        DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
        if (date != null) {
            try {
                Date startDate = df.parse(date);
            } catch (ParseException e) {
               logger.debug("parse exception");
            }
        }


        shift.setDate(date);


        int shiftI = Integer.parseInt(request.getParameter("shift"));
        shift.setShift(shiftI);
        logger.debug("shift = " + shift);

        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        shift.setEmployeeId(employeeId);
        logger.debug("Employee id = " + employeeId);

        String productName = request.getParameter("productName");
        shift.setProductName(productName);
        logger.debug("product name " + productName);

        int machineNumber = Integer.parseInt(request.getParameter("machineNumber"));
        shift.setMachineNumber(machineNumber);
        logger.debug("Machine number = " + machineNumber);

        double hoursWorked = Double.parseDouble(request.getParameter("hoursWorked"));
        shift.setHoursWorked(hoursWorked);
        logger.debug("hours worked = " + hoursWorked);

        double productRate = shift.getProductRate();
        shift.setProductRate(productRate);
        logger.debug("product rate = " + productRate);

        double totalParts = Double.parseDouble(request.getParameter("totalParts"));
        shift.setTotalParts(totalParts);
        logger.debug("Total parts = " + totalParts);

        double downtime = Double.parseDouble(request.getParameter("downtime"));
        shift.setDowntime(downtime);
        logger.debug("downtime = " + downtime);

        double badParts = Double.parseDouble(request.getParameter("badParts"));
        shift.setBadParts(badParts);
        logger.debug("Bad Parts = " + badParts);

        double ribbonChange = Double.parseDouble(request.getParameter("ribbonChange"));
        shift.setRibbonChange(ribbonChange);
        logger.debug("Ribbon Change = " + ribbonChange);

        double glueTest = Double.parseDouble(request.getParameter("glueTest"));
        shift.setGlueTest(glueTest);
        logger.debug("Glue Test = " + glueTest);

        double fullSkid = Double.parseDouble(request.getParameter("fullSkid"));
        shift.setFullSkid(fullSkid);
        logger.debug("Full Skid = " + fullSkid);

        double trash = Double.parseDouble(request.getParameter("trash"));
        shift.setTrash(trash);
        logger.debug("Trash = " + trash);

        double credits = ((badParts * 0.002) + (ribbonChange * 0.2) + (glueTest * 0.1) + (fullSkid * 0.15) + (trash * 0.01));
        shift.setCredits(Math.round(credits));
        logger.debug("Credits = " + credits);

        String comments = request.getParameter("comment");
        shift.setComment(comments);
        logger.debug("Comment = " + comments);



        //Set Attributes to forward to jsp
        request.setAttribute("Date", date);
        request.setAttribute("Shift", shiftI);
        request.setAttribute("id", employeeId);
        request.setAttribute("product", productName);
        request.setAttribute("machine", machineNumber);
        request.setAttribute("hours", hoursWorked);
        request.setAttribute("parts", totalParts);
        request.setAttribute("down", downtime);
        request.setAttribute("bad", badParts);
        request.setAttribute("ribbon", ribbonChange);
        request.setAttribute("glue", glueTest);
        request.setAttribute("full", fullSkid);
        request.setAttribute("waste", trash);
        request.setAttribute("comment", comments);
        request.setAttribute("credit", credits);


        double baseRate = shift.getBaseRate();
        request.setAttribute("baserate", baseRate);
        logger.debug("base rate = " + baseRate);

        double percentage = shift.getPercentage();
        request.setAttribute("percentage", percentage);
        logger.debug("percentage = " + percentage);

        double hoursEarned = shift.getHoursEarned();
        request.setAttribute("hoursE", hoursEarned);
        logger.debug("Hours Earned = " + hoursEarned);

        double total = shift.getTotalHours();
        request.setAttribute("totalHours", total);
        logger.debug("Total Hours = " + total);

        double day = shift.getDay$();
        request.setAttribute("day$", day);
        logger.debug("Day $ = " + day);

        double hourly = shift.getHourly$();
        request.setAttribute("hourly$", hourly);
        logger.debug("Hourly $ = " + hourly);

        request.setAttribute("users", shiftDao.getAll());

        //Insert user values into database
        shiftDao.insert(shift);
        logger.debug("inserted user " + shift);

        //Forward result to jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("/results.jsp");
        dispatcher.forward(request, response);

    }


    // Filter the string for special HTML characters to prevent
    // command injection attack
    private static String htmlFilter(String message) {
        if (message == null) return null;
        int len = message.length();
        StringBuffer result = new StringBuffer(len + 20);
        char aChar;

        for (int i = 0; i < len; ++i) {
            aChar = message.charAt(i);
            switch (aChar) {
                case '<': result.append("&lt;"); break;
                case '>': result.append("&gt;"); break;
                case '&': result.append("&amp;"); break;
                case '"': result.append("&quot;"); break;
                default: result.append(aChar);
            }
        }
        return (result.toString());

    }
}