package ExcelHandling;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelWriteExample {
    public static void main(String[] args) {
        // List of Employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jeevanantham M", 21, "Full Stack"));
        employees.add(new Employee("Pranav Anand V", 21, "Tech Support"));
        employees.add(new Employee("Siddharth", 22, "Full Stack"));
        employees.add(new Employee("Sree", 22, "Full Stack"));
        employees.add(new Employee("Syed", 26, "Full Stack"));
        employees.add(new Employee("Selva", 27, "Deployment"));
        employees.add(new Employee("Hari", 25, "Full Stack"));
        employees.add(new Employee("Vicky", 91, "Testing"));
        employees.add(new Employee("Glad", 99, "IT"));

        // Create a workbook
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Employees");

        // Create a row (header)
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Name");
        headerRow.createCell(1).setCellValue("Age");
        headerRow.createCell(2).setCellValue("Department");

        int rowNum = 1;
        for (Employee emp : employees) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(emp.getName());
            row.createCell(1).setCellValue(emp.getAge());
            row.createCell(2).setCellValue(emp.getDepartment());
        }

        // Write the data
        try (FileOutputStream fos = new FileOutputStream("employees.xlsx")) {
            workbook.write(fos);
            System.out.println("Excel file written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
