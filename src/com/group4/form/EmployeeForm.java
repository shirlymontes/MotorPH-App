package com.group4.form;

import com.group4.main.EmployeeTableManager;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmployeeForm extends javax.swing.JPanel {

    private EmployeeTableManager tableData; //manage data for the Jtable
    private JTable table; // table components for displaying employee data
    private AddEmployeeForm addEmployeeForm; // for for adding new employee

    //contructor
    public EmployeeForm() {
        initComponents();
        initializeTable(); // set up the table for displaying employee data

        table = new JTable(); // create a new Jtable instance

        //initialize the tabledata instance to manage employee data
        tableData = new EmployeeTableManager(EmployeeData);
        //path to the csv file
        String filePath = "C:\\Users\\PotChi\\Documents\\NetBeansProjects\\MotorPH CP2\\src\\com\\group4\\csv\\employeedata1.csv";
        //load employee data from csv
        tableData.loadEmployeeData(filePath);

    }
    //set up the table with apprpriate column headers

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

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundCornerPanel1 = new com.group4.components.RoundCornerPanel();
        btnGenerate = new com.group4.resources.Button();
        tfLastName = new javax.swing.JTextField();
        tfEnum = new javax.swing.JTextField();
        tfPosition = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        tfBirthday = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfSss = new javax.swing.JTextField();
        tfTin = new javax.swing.JTextField();
        tfSupervisor = new javax.swing.JTextField();
        tfPagibig = new javax.swing.JTextField();
        tfPhilhealth = new javax.swing.JTextField();
        btnUpdate = new com.group4.resources.Button();
        btnDelete = new com.group4.resources.Button();
        tfFirstName = new javax.swing.JTextField();
        tfBasic = new javax.swing.JTextField();
        tfRiceSubsidy = new javax.swing.JTextField();
        tfPhoneAllowance = new javax.swing.JTextField();
        tfClothing = new javax.swing.JTextField();
        tfGrossSemi = new javax.swing.JTextField();
        tfHourlyRate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new com.group4.resources.Button();

        setOpaque(false);

        btnGenerate.setBackground(new java.awt.Color(249, 130, 14));
        btnGenerate.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerate.setText("Generate Salary");
        btnGenerate.setToolTipText("");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        tfLastName.setBorder(javax.swing.BorderFactory.createTitledBorder("Last Name"));

        tfEnum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEnum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Number", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tfPosition.setBorder(javax.swing.BorderFactory.createTitledBorder("Position"));

        tfPhone.setBorder(javax.swing.BorderFactory.createTitledBorder("Phone Number"));
        tfPhone.setMinimumSize(new java.awt.Dimension(50, 40));

        tfStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        tfBirthday.setBorder(javax.swing.BorderFactory.createTitledBorder("Birthday"));
        tfBirthday.setMinimumSize(new java.awt.Dimension(50, 40));
        tfBirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBirthdayActionPerformed(evt);
            }
        });

        tfAddress.setBorder(javax.swing.BorderFactory.createTitledBorder("Address"));
        tfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAddressActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group4/images/icons8-avatar-94.png"))); // NOI18N

        tfSss.setBorder(javax.swing.BorderFactory.createTitledBorder("SSS"));

        tfTin.setBorder(javax.swing.BorderFactory.createTitledBorder("TIN"));

        tfSupervisor.setBorder(javax.swing.BorderFactory.createTitledBorder("Supervisor"));

        tfPagibig.setBorder(javax.swing.BorderFactory.createTitledBorder("PAGIBIG"));

        tfPhilhealth.setBorder(javax.swing.BorderFactory.createTitledBorder("PhilHealth"));

        btnUpdate.setBackground(new java.awt.Color(51, 204, 255));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 153, 153));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tfFirstName.setBorder(javax.swing.BorderFactory.createTitledBorder("First Name"));

        tfBasic.setBorder(javax.swing.BorderFactory.createTitledBorder("Basic Salary"));

        tfRiceSubsidy.setBorder(javax.swing.BorderFactory.createTitledBorder("Rice Subsidy"));

        tfPhoneAllowance.setBorder(javax.swing.BorderFactory.createTitledBorder("Phone Allowance"));

        tfClothing.setBorder(javax.swing.BorderFactory.createTitledBorder("Clothing Allowance"));

        tfGrossSemi.setBorder(javax.swing.BorderFactory.createTitledBorder("Gross Semi-Monthly Rate"));

        tfHourlyRate.setBorder(javax.swing.BorderFactory.createTitledBorder("Hourly Rate"));

        javax.swing.GroupLayout roundCornerPanel1Layout = new javax.swing.GroupLayout(roundCornerPanel1);
        roundCornerPanel1.setLayout(roundCornerPanel1Layout);
        roundCornerPanel1Layout.setHorizontalGroup(
            roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(tfEnum, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundCornerPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)))
                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfAddress)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundCornerPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                .addComponent(tfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                .addComponent(tfPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                .addComponent(tfSss, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(tfPhilhealth, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                    .addComponent(tfGrossSemi, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                    .addComponent(tfBasic, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfRiceSubsidy, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6)
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                        .addComponent(tfTin, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPagibig))
                                    .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                        .addComponent(tfPhoneAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfClothing)))))))
                .addContainerGap())
        );
        roundCornerPanel1Layout.setVerticalGroup(
            roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundCornerPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfEnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfStatus))
                        .addGap(12, 12, 12)
                        .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPagibig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPhilhealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfBasic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRiceSubsidy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPhoneAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfClothing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfGrossSemi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(52, 52, 52))))
        );

        EmployeeData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        EmployeeData.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                EmployeeDataAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        EmployeeData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EmployeeData);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(249, 130, 14));
        jLabel1.setText("Employees");

        btnAdd.setBackground(new java.awt.Color(255, 204, 0));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group4/images/Plus.png"))); // NOI18N
        btnAdd.setText("Add Employee");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(roundCornerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(816, 816, 816))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundCornerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // method when the btnGenerate is clicked
    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        //get data from text fields
        String enumber = tfEnum.getText();
        String elname = tfLastName.getText();
        String efname = tfFirstName.getText();
        String position = tfPosition.getText();
        String status = tfStatus.getText();
        String basic = tfBasic.getText();
        String rice = tfRiceSubsidy.getText();
        String phoneAllowance = tfPhoneAllowance.getText();
        String clothing = tfClothing.getText();
        String hourly = tfHourlyRate.getText();

        //create a new GeneratePayslipForm instance with the provided data
        GeneratePayslipForm employeeForm = new GeneratePayslipForm(enumber, elname, efname, position, status, basic, rice, phoneAllowance, clothing, hourly);
        JDialog dialog = new JDialog(); // create a dialog to the display the GeneratePayslipForm
        dialog.setTitle("Generate Payslip");
        dialog.getContentPane().add(employeeForm); // add the dialog content pane
        dialog.pack(); //pack the dialog to fit in the preferred size
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);

    }//GEN-LAST:event_btnGenerateActionPerformed

    private void EmployeeDataAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_EmployeeDataAncestorAdded

    }//GEN-LAST:event_EmployeeDataAncestorAdded

    private void EmployeeDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeDataMouseClicked
        // Get the selected row index
        int rowIndex = EmployeeData.getSelectedRow();
        if (rowIndex != -1) { //check if a row is clicked
            //cast the table model to defaultTableModel
            DefaultTableModel model = (DefaultTableModel) EmployeeData.getModel();

            //set text fields with data from clicked row.
            tfEnum.setText(getValueAsString(model.getValueAt(rowIndex, 0)));
            tfLastName.setText(getValueAsString(model.getValueAt(rowIndex, 1)));
            tfFirstName.setText(getValueAsString(model.getValueAt(rowIndex, 2)));
            tfBirthday.setText(getValueAsString(model.getValueAt(rowIndex, 3)));
            tfAddress.setText(getValueAsString(model.getValueAt(rowIndex, 4)));
            tfPhone.setText(getValueAsString(model.getValueAt(rowIndex, 5)));
            tfSss.setText(getValueAsString(model.getValueAt(rowIndex, 6)));
            tfPhilhealth.setText(getValueAsString(model.getValueAt(rowIndex, 7)));
            tfTin.setText(getValueAsString(model.getValueAt(rowIndex, 8)));
            tfPagibig.setText(getValueAsString(model.getValueAt(rowIndex, 9)));
            tfStatus.setText(getValueAsString(model.getValueAt(rowIndex, 10)));
            tfPosition.setText(getValueAsString(model.getValueAt(rowIndex, 11)));
            tfSupervisor.setText(getValueAsString(model.getValueAt(rowIndex, 12)));
            tfBasic.setText(getValueAsString(model.getValueAt(rowIndex, 13)));
            tfRiceSubsidy.setText(getValueAsString(model.getValueAt(rowIndex, 14)));
            tfPhoneAllowance.setText(getValueAsString(model.getValueAt(rowIndex, 15)));
            tfClothing.setText(getValueAsString(model.getValueAt(rowIndex, 16)));
            tfGrossSemi.setText(getValueAsString(model.getValueAt(rowIndex, 17)));
            tfHourlyRate.setText(getValueAsString(model.getValueAt(rowIndex, 18)));
        }
    }//GEN-LAST:event_EmployeeDataMouseClicked

    private String getValueAsString(Object value) {
        //this method is for the null values, it will ensure that any data that is null will displayed empty in the textfields
        return value == null ? "" : value.toString();
    }


    private void tfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddressActionPerformed

    private void tfBirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBirthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBirthdayActionPerformed

    /**
     * Handles the action performed when the update button is clicked retrieves
     * the selected row and update the corresponding data in the table with the
     * values from the text fields, calls the UpdateCSVFile method to update the
     * data and display a message dialog
     */
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        int rowIndex = EmployeeData.getSelectedRow();
        if (rowIndex >= 0) {
            DefaultTableModel model = (DefaultTableModel) EmployeeData.getModel();
            model.setValueAt(tfEnum.getText(), rowIndex, 0);
            model.setValueAt(tfLastName.getText(), rowIndex, 1);
            model.setValueAt(tfFirstName.getText(), rowIndex, 2);
            model.setValueAt(tfBirthday.getText(), rowIndex, 3);
            model.setValueAt(tfAddress.getText(), rowIndex, 4);
            model.setValueAt(tfPhone.getText(), rowIndex, 5);
            model.setValueAt(tfSss.getText(), rowIndex, 6);
            model.setValueAt(tfPhilhealth.getText(), rowIndex, 7);
            model.setValueAt(tfTin.getText(), rowIndex, 8);
            model.setValueAt(tfPagibig.getText(), rowIndex, 9);
            model.setValueAt(tfStatus.getText(), rowIndex, 10);
            model.setValueAt(tfPosition.getText(), rowIndex, 11);
            model.setValueAt(tfSupervisor.getText(), rowIndex, 12);
            model.setValueAt(tfBasic.getText(), rowIndex, 13);
            model.setValueAt(tfRiceSubsidy.getText(), rowIndex, 14);
            model.setValueAt(tfPhoneAllowance.getText(), rowIndex, 15);
            model.setValueAt(tfClothing.getText(), rowIndex, 16);
            model.setValueAt(tfGrossSemi.getText(), rowIndex, 17);
            model.setValueAt(tfHourlyRate.getText(), rowIndex, 18);

            updateCSVFile("C:\\Users\\PotChi\\Documents\\NetBeansProjects\\MotorPH CP2\\src\\com\\group4\\csv\\employeedata1.csv", model);

            JOptionPane.showMessageDialog(this, "Employee information updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Please select an employee to update.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btnUpdateActionPerformed
    //method when the add button is clicked
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addEmployeeForm = new AddEmployeeForm(this);
        JDialog dialog = new JDialog();
        dialog.setTitle("Add Employee");
        dialog.getContentPane().add(addEmployeeForm);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);

    
    }//GEN-LAST:event_btnAddActionPerformed
    
// Method to handle updating EmployeeData table from AddEmployeeForm
    public void updateEmployeeData(Object[] rowData) {
        DefaultTableModel model = (DefaultTableModel) EmployeeData.getModel();
        model.addRow(rowData); // Add new row to the table
        updateCSVFile("C:\\Users\\PotChi\\Documents\\NetBeansProjects\\MotorPH CP2\\src\\com\\group4\\csv\\employeedata1.csv", model); // Update CSV file
    }
    
    //method for btnDelete when the button is clicked
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //get the selected row index
        int selectedRow = EmployeeData.getSelectedRow();
        if (selectedRow != -1) {

            DefaultTableModel model = (DefaultTableModel) EmployeeData.getModel();
            model.removeRow(selectedRow);
            updateCSVFile("C:\\Users\\PotChi\\Documents\\NetBeansProjects\\MotorPH CP2\\src\\com\\group4\\csv\\employeedata1.csv", model);

            JOptionPane.showMessageDialog(this, "Employee Deleted", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Please select an employee to delete.", "Error", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void updateTableModel(int rowIndex, DefaultTableModel model) {
    }

    private void updateCSVFile(String filePath, DefaultTableModel model) {
        try (FileWriter csvWriter = new FileWriter(filePath)) {
            int columnCount = model.getColumnCount();
            writeColumnHeaders(csvWriter, model, columnCount);
            int rowCount = model.getRowCount(); // Get rowCount
            writeRowData(csvWriter, model, rowCount, columnCount); // Pass rowCount to writeRowData
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

// Method to write row data to the CSV file
    private void writeRowData(FileWriter csvWriter, DefaultTableModel model, int rowCount, int columnCount) throws IOException {
        // Write the row data to the CSV file
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                String value = getValueAsString(model.getValueAt(i, j));
                //check if the calue needs to be enclosed in ""
                if (value.contains(",") || value.contains("\n") || value.contains("\"")) {
                    csvWriter.append("\"").append(value.replace("\"", "\"\"")).append("\"");
                } else {
                    csvWriter.append(value);
                }
                if (j < columnCount - 1) {
                    csvWriter.append(",");

                }
            }
            csvWriter.append("\n");
        }
    }

// Method to write column headers to the CSV file
    private void writeColumnHeaders(FileWriter csvWriter, DefaultTableModel model, int columnCount) throws IOException {
        // Write the column headers to the CSV file
        for (int i = 0; i < columnCount; i++) {
            csvWriter.append(model.getColumnName(i));
            if (i < columnCount - 1) {
                csvWriter.append(",");
            }
        }
        csvWriter.append("\n");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmployeeData;
    private com.group4.resources.Button btnAdd;
    private com.group4.resources.Button btnDelete;
    private com.group4.resources.Button btnGenerate;
    private com.group4.resources.Button btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.group4.components.RoundCornerPanel roundCornerPanel1;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfBasic;
    private javax.swing.JTextField tfBirthday;
    private javax.swing.JTextField tfClothing;
    private javax.swing.JTextField tfEnum;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfGrossSemi;
    private javax.swing.JTextField tfHourlyRate;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfPagibig;
    private javax.swing.JTextField tfPhilhealth;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfPhoneAllowance;
    private javax.swing.JTextField tfPosition;
    private javax.swing.JTextField tfRiceSubsidy;
    private javax.swing.JTextField tfSss;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JTextField tfSupervisor;
    private javax.swing.JTextField tfTin;
    // End of variables declaration//GEN-END:variables

}
