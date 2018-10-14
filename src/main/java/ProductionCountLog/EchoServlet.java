package ProductionCountLog;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import ProductionCountLog.User;

@WebServlet(
        urlPatterns = {"/echo"}
)

public class EchoServlet extends HttpServlet {


    User user = new User();
    UserDao userDao = new UserDao();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
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
                e.printStackTrace();
            }
        }


        user.setDate(date);


        int shift = Integer.parseInt(request.getParameter("shift"));
        user.setShift(shift);

        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        user.setEmployeeId(employeeId);

        String firstName = request.getParameter("firstName");
        user.setFirstName(firstName);

        String lastName = request.getParameter("lastName");
        user.setLastName(lastName);

        String productName = request.getParameter("productName");
        user.setProductName(productName);

        int machineNumber = Integer.parseInt(request.getParameter("machineNumber"));
        user.setMachineNumber(machineNumber);

        double hoursWorked = Double.parseDouble(request.getParameter("hoursWorked"));
        user.setHoursWorked(hoursWorked);

        double totalParts = Double.parseDouble(request.getParameter("totalParts"));
        user.setTotalParts(totalParts);

        double downtime = Double.parseDouble(request.getParameter("downtime"));
        user.setDowntime(downtime);

        double badParts = Double.parseDouble(request.getParameter("badParts"));
        user.setBadParts(badParts);

        double ribbonChange = Double.parseDouble(request.getParameter("ribbonChange"));
        user.setRibbonChange(ribbonChange);

        double glueTest = Double.parseDouble(request.getParameter("glueTest"));
        user.setGlueTest(glueTest);

        double fullSkid = Double.parseDouble(request.getParameter("fullSkid"));
        user.setFullSkid(fullSkid);

        double trash = Double.parseDouble(request.getParameter("trash"));
        user.setTrash(trash);

        double credits = ((badParts * 0.002) + (ribbonChange * 0.2) + (glueTest * 0.1) + (fullSkid * 0.15) + (trash * 0.01));
        user.setCredits(credits);

        String comments = request.getParameter("comment");
        user.setComment(comments);


        //Insert user values into database
        userDao.insert(user);

        //Set Attributes to forward to jsp
        request.setAttribute("Date", date);
        request.setAttribute("Shift", shift);
        request.setAttribute("id", employeeId);
        request.setAttribute("first", firstName);
        request.setAttribute("last", lastName);
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

        double percentage = user.getPercentage();

        request.setAttribute("percentage", percentage);



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