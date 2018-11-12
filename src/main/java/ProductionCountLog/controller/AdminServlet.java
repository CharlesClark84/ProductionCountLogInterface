package ProductionCountLog.controller;

import ProductionCountLog.entity.Shift;
import ProductionCountLog.persistence.ShiftDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
        urlPatterns = {"/search"}
)

public class AdminServlet extends HttpServlet {
        private final Logger logger = LogManager.getLogger(this.getClass());

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

                Shift shift = new Shift();
                ShiftDao dao = new ShiftDao();

                req.setAttribute("shifts", dao.getAllUsers());
                logger.debug("all shift " + dao.getAllUsers());

                RequestDispatcher dispatcher = req.getRequestDispatcher("/adminResults.jsp");
                dispatcher.forward(req, resp);

        }
}