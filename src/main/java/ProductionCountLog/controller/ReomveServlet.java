package ProductionCountLog.controller;

import ProductionCountLog.entity.Shift;
import ProductionCountLog.persistence.GenericDao;
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


@WebServlet(
        urlPatterns = {"/Remove"}
)

public class ReomveServlet extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Shift shift = new Shift();
        GenericDao dao = new GenericDao(Shift.class);

        String id = req.getParameter("id");

            Shift shitToDelete = (Shift)dao.getById(Integer.parseInt(id));

           dao.delete(shitToDelete);
           logger.debug("Remove by id = " + shitToDelete);


        RequestDispatcher dispatcher = req.getRequestDispatcher("/adminResults.jsp");
        dispatcher.forward(req, resp);

    }
}