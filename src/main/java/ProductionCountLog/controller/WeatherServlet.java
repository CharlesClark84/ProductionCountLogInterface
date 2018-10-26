package ProductionCountLog.controller;

import ProductionCountLog.entity.WeatherConfirm;
import ProductionCountLog.entity.User;
import ProductionCountLog.persistence.ShiftDao;
import ProductionCountLog.persistence.UserDao;
import ProductionCountLog.persistence.WeatherDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(
        urlPatterns = {"/weather"}
)

public class WeatherServlet extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());
    WeatherConfirm weather = new WeatherConfirm();
    WeatherDao weatherDao = new WeatherDao();

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // Set the response message's MIME type
        response.setContentType("text/html; charset=UTF-8");

        //Get values from form and insert into user
        int employeeId = Integer.parseInt(request.getParameter("employeeNumber"));
        weather.setEmployeeId(employeeId);

        String confirm = request.getParameter("confirm");
        weather.setConfirm(confirm);

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
        weather.setDate(date);


        weatherDao.insert(weather);

        //Set Attributes to forward to jsp
        request.setAttribute("number", employeeId);
        request.setAttribute("con", confirm);
        request.setAttribute("Date", date);


        //Forward result to jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("/weatherResults.jsp");
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