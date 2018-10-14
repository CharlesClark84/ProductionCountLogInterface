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
        // Allocate a output writer to write the response message into the network socket
        PrintWriter out = response.getWriter();

        /**
        // Write the response message, in an HTML page
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html><head>");

            out.println("<body><h2>You have entered</h2>");


            String date = request.getParameter("date");
            user.setDate(date);
            if (date == null) {
                out.println("<p>Date: MISSING</p>");
            } else {
                out.println("<p>Date: " + date + "</p>");
            }

            String shift = request.getParameter("shift");
            user.setShift(shift);
            if (shift == null) {
                out.println("<p>Shift: MISSING</p>");
            } else {
                out.println("<p>Shift: " + shift + "</p>");
            }


            String employeeId = request.getParameter("employeeId");
            if (employeeId == null) {
                out.println("<p>EmployeeId: MISSING</p>");
            } else {
                out.println("<p>EmployeeId: " + employeeId + "</p>");
            }


            // Retrieve the value of the query parameter "username" (from text field)
            String firstName = request.getParameter("firstName");
            user.setFirstName(firstName);
            String lastName = request.getParameter("lastName");
            user.setLastName(lastName);
            // Get null if the parameter is missing from query string.
            // Get empty string or string of white spaces if user did not fill in
            if ((firstName == null
                    || (firstName = htmlFilter(firstName.trim())).length() == 0) || (lastName == null
                    || (lastName = htmlFilter(lastName.trim())).length() == 0)) {
                out.println("<p>Name: MISSING</p>");
            } else {
                out.println("<p>Name: " + firstName + " " + lastName + "</p>");
            }

            // Retrieve the value of the query parameter "productName" (from pull-down menu)
            String productName = request.getParameter("productName");
            user.setProductName(productName);
            if (productName == null) {
                out.println("<p>Product Name: MISSING</p>");
            } else if (productName.equals("1")) {
                out.println("<p>Product Name: 213 Air filter</p>");
            } else if (productName.equals("2")) {
                out.println("<p>Product Name: 410 Air filter</p>");
            } else if (productName.equals("3")) {
                out.println("<p>Product Name: 413 Air filter</p>");
            } else if (productName.equals("4")) {
                out.println("<p>Product Name: 501 Air filter</p>");
            } else if (productName.equals("5")) {
                out.println("<p>Product Name: 513 Air filter</p>");
            }


            String machineNumber = request.getParameter("machineNumber");
            if (machineNumber == null) {
                out.println("<p>Machine Number: MISSING</p>");
            } else {
                out.println("<p>Machine Number: " + machineNumber + "</p>");
            }

            String hoursWorked = request.getParameter("hoursWorked");
            if (hoursWorked == null) {
                out.println("<p>Hours Worked: MISSING</p>");
            } else {
                out.println("<p>Hours Worked: " + hoursWorked + "</p>");
            }

            String totalParts = request.getParameter("totalParts");
            if (totalParts == null) {
                out.println("<p>Total Parts: MISSING</p>");
            } else {
                out.println("<p>Total Parts: " + totalParts + "</p>");
            }

            String downtime = request.getParameter("downtime");
            if (downtime == null) {
                out.println("<p>Downtime: MISSING</p>");
            } else {
                out.println("<p>Downtime: " + downtime + "</p>");
            }


            // Retrieve the value of the query parameter "instruction" (from text area)
            String instruction = request.getParameter("instruction");

            // Get null if the parameter is missing from query string.
            if (instruction == null
                    || (instruction = htmlFilter(instruction.trim())).length() == 0
                    || instruction.equals("Enter your instruction here...")) {
                out.println("<p>Comments: MISSING</p>");
            } else {
                out.println("<p>Comments: " + instruction + "</p>");
            }

            out.println("<p>Percentage: " + user.getPercentage() + "</p>");

            // Hyperlink "BACK" to input page
            out.println("<a href='index.jsp'>BACK</a>");

            out.println("</body></html>");
        } finally {
            out.close();  // Always close the output writer
        }

*/

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



        request.setAttribute("users", userDao.insert(user));

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