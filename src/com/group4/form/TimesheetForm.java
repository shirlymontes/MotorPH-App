package com.group4.form;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.DefaultCellEditor;
import javax.swing.border.LineBorder;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class TimesheetForm extends JPanel {

    //path to the CSV file containing leave requests
    private static final String filePath = "C:\\Users\\PotChi\\Documents\\NetBeansProjects\\MotorPH CP2\\src\\com\\group4\\csv\\LeaveRequest.csv";
    private DefaultTableModel tableModel;

    public TimesheetForm() {
        initComponents();
        loadLeaveRequests(); // Load leave requests from the CSV file
        addButtonsToTable(); // Add approve/reject buttons to the table
        setOpaque(false); // Make the panel transparent
    }

    // Method to load leave requests from the CSV file into the table model
    private void loadLeaveRequests() {
        tableModel = (DefaultTableModel) LeaveRequestTable.getModel(); // Get the table model
        tableModel.setRowCount(0); //// Clear any existing rows

        // Read the CSV file and add rows to the table model
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // Split the line into data fields
                tableModel.addRow(data); // Add the data as a new row in the table model
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to add approve/reject buttons to the "Action" column of the table
    private void addButtonsToTable() {
        TableColumn actionColumn = LeaveRequestTable.getColumn("Action");
        actionColumn.setCellRenderer(new ButtonRenderer());
        actionColumn.setCellEditor(new ButtonEditor(new JCheckBox()));
        actionColumn.setPreferredWidth(150); // Adjust column width as needed
    }

    // Custom cell renderer to display approve/reject buttons
    class ButtonRenderer extends JPanel implements TableCellRenderer {

        private final JButton approveButton;
        private final JButton rejectButton;

        // Constructor to create and add buttons to the panel
        public ButtonRenderer() {
            setLayout(new GridLayout(1, 2, 5, 0)); // Adjust grid layout for smaller buttons
            approveButton = createButton("Approve", Color.decode("#FF8C32"));
            rejectButton = createButton("Reject", Color.decode("#FF9898"));
            add(approveButton);
            add(rejectButton);
        }

        // Method to create a button with specified text and color       
        private JButton createButton(String text, Color color) {
            JButton button = new JButton(text);
            button.setBackground(color);
            button.setForeground(Color.WHITE);
            button.setOpaque(true);
            button.setBorder(BorderFactory.createCompoundBorder(
                    new LineBorder(Color.BLACK),
                    BorderFactory.createEmptyBorder(5, 10, 5, 10) // Adjust padding for smaller buttons
            ));
            button.setFocusPainted(false);
            button.setFont(new Font("Arial", Font.BOLD, 10)); // Adjust font size for smaller buttons
            return button;
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            return this;
        }
    }

    // Custom cell editor to handle button clicks
    class ButtonEditor extends DefaultCellEditor {

        private final JPanel panel;
        private final JButton approveButton;
        private final JButton rejectButton;
        private JButton currentButton = null;

        // Constructor to create and add buttons to the panel
        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            panel = new JPanel(new GridLayout(1, 2, 5, 0)); // Adjust grid layout for smaller buttons
            approveButton = createButton("Approve", Color.decode("#FF8C32"));
            rejectButton = createButton("Reject", Color.decode("#FF9898"));

            panel.add(approveButton); // Add approve button to panel
            panel.add(rejectButton); // Add reject button to panel

            // Add action listeners to handle button clicks
            approveButton.addActionListener(e -> handleButtonClick(approveButton));
            rejectButton.addActionListener(e -> handleButtonClick(rejectButton));
        }

        // Method to return the panel as the cell editor component
        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            return panel;
        }

        // Method to return the value of the cell editor (not used here)
        @Override
        public Object getCellEditorValue() {
            return "";
        }

        // Method to create a button with specified text and color     
        private JButton createButton(String text, Color color) {
            JButton button = new JButton(text);
            button.setBackground(color);
            button.setForeground(Color.WHITE);
            button.setOpaque(true);
            button.setBorder(BorderFactory.createCompoundBorder(
                    new LineBorder(Color.BLACK),
                    BorderFactory.createEmptyBorder(5, 10, 5, 10) // Adjust padding for smaller buttons
            ));
            button.setFocusPainted(false);
            button.setFont(new Font("Arial", Font.BOLD, 10)); // Adjust font size for smaller buttons
            return button;
        }

        // Method to handle button clicks
        private void handleButtonClick(JButton button) {
            int row = LeaveRequestTable.convertRowIndexToModel(LeaveRequestTable.getEditingRow());
            String status = button.getText().equals("Approve") ? "Approved" : "Rejected";
            updateLeaveRequestStatus(row, status);
        }
        
        
    }

    // Method to update the leave request status in the table and CSV file
    private void updateLeaveRequestStatus(int row, String status) {
              DefaultTableModel model = (DefaultTableModel) LeaveRequestTable.getModel();
        model.setValueAt(status, row, 4); // Assuming the status column is the 5th column

        try (FileWriter fw = new FileWriter(filePath)) {
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    if (j != 5) { // Skip the Action column
                        fw.write(model.getValueAt(i, j).toString() + (j == model.getColumnCount() - 1 ? "" : ","));
                    }
                }
                fw.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LeaveRequestTable = new javax.swing.JTable();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 140, 50));
        jLabel1.setText("Timesheet");

        LeaveRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Name", "Leave Date", "Reason", "Status", "Action"
            }
        ));
        LeaveRequestTable.setRowHeight(30);
        jScrollPane1.setViewportView(LeaveRequestTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable LeaveRequestTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
