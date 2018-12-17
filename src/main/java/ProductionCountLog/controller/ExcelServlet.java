package ProductionCountLog.controller;

import ProductionCountLog.entity.Shift;
import ProductionCountLog.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

@WebServlet(
        urlPatterns = {"/Excel"}
)

public class ExcelServlet extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            Connection connect = null;
            try {
                connect = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/indieProject" ,
                        "root" ,
                        "student"
                );
            } catch (SQLException e) {
                e.printStackTrace();
            }

        Statement statement = null;
        try {
            statement = connect.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery("select * from shift");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("shift results data");

            XSSFRow row = spreadsheet.createRow(1);
            XSSFCell cell;
            cell = row.createCell(1);
            cell.setCellValue("Id");
            cell = row.createCell(2);
            cell.setCellValue("Employee Id");
            cell = row.createCell(3);
            cell.setCellValue("Date");
            cell = row.createCell(4);
            cell.setCellValue("Shift");
            cell = row.createCell(5);
            cell.setCellValue("Product Name");
            int i = 2;

            while(resultSet != null) {
                row = spreadsheet.createRow(i);
                cell = row.createCell(1);
                try {
                    cell.setCellValue(resultSet.getInt("shift_id"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                cell = row.createCell(2);
                try {
                    cell.setCellValue(resultSet.getString("employee_id"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                cell = row.createCell(3);
                try {
                    cell.setCellValue(resultSet.getString("date"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                cell = row.createCell(4);
                try {
                    cell.setCellValue(resultSet.getString("shift"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                cell = row.createCell(5);
                try {
                    cell.setCellValue(resultSet.getString("product_name"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                i++;
            }

            FileOutputStream out = new FileOutputStream(new File("exceldatabase.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("exceldatabase.xlsx written successfully");

        req.setAttribute("message", "Successful export of data");


        RequestDispatcher dispatcher = req.getRequestDispatcher("/export.jsp");
        dispatcher.forward(req, resp);

    }
}
