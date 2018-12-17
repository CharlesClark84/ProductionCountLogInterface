package ProductionCountLog.controller;
import java.io.File;
import java.io.FileOutputStream;

import java.sql.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellDatabase {
    public void exportData() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
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

        Statement statement = connect.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from shift");
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

        while(resultSet.next()) {
            row = spreadsheet.createRow(i);
            cell = row.createCell(1);
            cell.setCellValue(resultSet.getInt("shift_id"));
            cell = row.createCell(2);
            cell.setCellValue(resultSet.getString("employee_id"));
            cell = row.createCell(3);
            cell.setCellValue(resultSet.getString("date"));
            cell = row.createCell(4);
            cell.setCellValue(resultSet.getString("shift"));
            cell = row.createCell(5);
            cell.setCellValue(resultSet.getString("product_name"));
            i++;
        }

        FileOutputStream out = new FileOutputStream(new File("exceldatabase.xlsx"));
        workbook.write(out);
        out.close();
        System.out.println("exceldatabase.xlsx written successfully");
    }
}