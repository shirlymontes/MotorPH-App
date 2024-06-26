package com.group4.main;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.TableColumnModel;

public class EmployeeTableManager {

    private JTable EmployeeData; // the JTable instance for EmployeeData Table

    public EmployeeTableManager(JTable EmployeeData) {
        this.EmployeeData = EmployeeData;
        initializeTable(); // initialize the table with column headers
    }

    //methos to initialize the table with column headers
    private void initializeTable() {
        EmployeeData.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Employee #", "Last Name", "First Name",
                    "Birthday", "Address", "Phone Number", "SSS #", "Philhealth #", "TIN #", "Pag-ibig #", "Status",
                    "Position", "Immediate Supervisor", "Basic Salary", "Rice Subsidy", "Phone Allowance",
                    "Clothing Allowance", "Gross Semi-monthly Rate", "Hourly Rate"
                }
        ));
        // Set row height dynamically
        EmployeeData.setRowHeight(0, EmployeeData.getRowHeight());
    }

        //to load employee data from CSV file into the Table
    public void loadEmployeeData(String filePath) {
        DefaultTableModel employeeTableModel = (DefaultTableModel) EmployeeData.getModel();
        employeeTableModel.setRowCount(0); // Clear existing rows

        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] data = parseCSVLine(line); // parse each line of CSV data
                employeeTableModel.addRow(data); // Add parsed data as a new row
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        resizeColumnWidth(); //resize columns after the content after loading data
    }

    //method to parse a line of CSV data 
    private String[] parseCSVLine(String line) {
        // Regex pattern to match fields enclosed in double quotes and separated by commas
        Pattern pattern = Pattern.compile("\"([^\"]*)\"|(?<=,|^)([^,]*)(?:,|$)");

        Matcher matcher = pattern.matcher(line);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        String[] data = new String[count];
        matcher.reset();

        int index = 0;
        while (matcher.find()) {
            String fieldValue = matcher.group(1); // Group 1 contains the value inside double quotes, if any
            if (fieldValue == null) {
                fieldValue = matcher.group(2); // Group 2 contains the value without quotes
            }
            data[index++] = fieldValue;
        }

        return data;
    }

    //to calculate the width of column based on its content
    private int getColumnTextWidth(String text) {
        // Check if the text is null or empty
        if (text == null || text.isEmpty()) {
            return 0;
        }
        // Get the width of the text using font metrics
        return EmployeeData.getFontMetrics(EmployeeData.getFont()).stringWidth(text);
    }

    //to resize table columns based on content width
    private void resizeColumnWidth() {
        TableColumnModel columnModel = EmployeeData.getColumnModel();
        for (int col = 0; col < EmployeeData.getColumnCount(); col++) {
            int maxWidth = 0;
            for (int row = 0; row < EmployeeData.getRowCount(); row++) {
                Object value = EmployeeData.getValueAt(row, col);
                if (value != null) {
                    maxWidth = Math.max(maxWidth, getColumnTextWidth(value.toString()));
                }
            }
            columnModel.getColumn(col).setPreferredWidth(maxWidth + 20); // Add padding
        }
    }
}
