package ProductionCountLog.controller;

import ProductionCountLog.entity.Shift;
import ProductionCountLog.entity.User;
import ProductionCountLog.persistence.GenericDao;
import ProductionCountLog.persistence.ShiftDao;
import ProductionCountLog.persistence.UserDao;
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
        urlPatterns = {"/newEmployee"}
)

public class NewEmployeeServlet extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());
    User user = new User();
    GenericDao userDao = new GenericDao(User.class);

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // Set the response message's MIME type
        response.setContentType("text/html; charset=UTF-8");

        //Get values from form and insert into user
        String firstName = request.getParameter("firstName");
        user.setFirstName(firstName);

        String lastName = request.getParameter("lastName");
        user.setLastName(lastName);

        String address = request.getParameter("address");
        user.setAddress(address);

        String city = request.getParameter("city");
        user.setCity(city);

        String state = request.getParameter("state");
        user.setState(state);

        int zip = Integer.parseInt(request.getParameter("zip"));
        user.setZip(zip);

        String password = request.getParameter("password");
        user.setUserPassword(password);

        userDao.insert(user);

        //Set Attributes to forward to jsp
        request.setAttribute("first", firstName);
        request.setAttribute("last", lastName);
        request.setAttribute("Address", address);
        request.setAttribute("City", city);
        request.setAttribute("State", state);
        request.setAttribute("Zip", lastName);
        request.setAttribute("pass", password);




        //Forward result to jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("/newEmployeeResults.jsp");
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