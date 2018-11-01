package ProductionCountLog.controller;

import ProductionCountLog.entity.Shift;
import ProductionCountLog.persistence.ShiftDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;


/**
 * A simple servlet to welcome the user.
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/searchUser"}
)

public class AdminServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Shift shift = new Shift();
        ShiftDao dao = new ShiftDao();
        if (req.getParameter("submit").equals("search")) {
                req.setAttribute("users", dao.getUserByEmployeeId(req.getParameter("searchTerm")));
        }
        else{
        req.setAttribute("users", dao.getAllUsers());
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/AdminResults.jsp");
        dispatcher.forward(req, resp);
        }
        }