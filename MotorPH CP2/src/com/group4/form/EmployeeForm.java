package com.group4.form;

import com.group4.main.TableData;
import java.io.File;
import java.net.URL;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;

public class EmployeeForm extends javax.swing.JPanel {

    private TableData tableData;

    public EmployeeForm() {
        initComponents();
        initializeTable();

        tableData = new TableData(EmployeeData);
        String filePath = "C:\\Users\\PotChi\\Documents\\NetBeansProjects\\MotorPH-App\\MotorPH CP2\\src\\com\\group4\\csv\\employeedata1.csv";
        tableData.loadEmployeeData(filePath);

    }

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

    private void loadEmployeeData(String filePath) {
        try {
            // Use getResource to find the file in the package
            URL resource = getClass().getClassLoader().getResource(filePath);
            if (resource == null) {
                throw new IllegalArgumentException("File not found: " + filePath);
            }
            File file = new File(resource.toURI());
            tableData.loadEmployeeData(file.getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundCornerPanel1 = new com.group4.components.RoundCornerPanel();
        btnView = new com.group4.resources.Button();
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

        btnView.setBackground(new java.awt.Color(249, 130, 14));
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText(" View");
        btnView.setToolTipText("");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
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
                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfAddress, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundCornerPanel1Layout.createSequentialGroup()
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(tfPosition))
                                .addGap(18, 18, 18)
                                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                        .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                        .addComponent(tfSss, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPhilhealth))
                                    .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                            .addComponent(tfGrossSemi, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tfHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                            .addComponent(tfBasic, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfRiceSubsidy, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(30, 30, 30)
                                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                        .addComponent(tfPhoneAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfClothing, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundCornerPanel1Layout.createSequentialGroup()
                                        .addComponent(tfTin, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPagibig, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundCornerPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfStatus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPagibig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPhilhealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfClothing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPhoneAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRiceSubsidy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBasic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfGrossSemi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1)
                    .addComponent(roundCornerPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundCornerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        ViewEmployeeForm employeeForm = new ViewEmployeeForm();
        JDialog dialog = new JDialog();
        dialog.setTitle("View Employee");
        dialog.getContentPane().add(employeeForm);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);

    }//GEN-LAST:event_btnViewActionPerformed

    private void EmployeeDataAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_EmployeeDataAncestorAdded

    }//GEN-LAST:event_EmployeeDataAncestorAdded

    private void EmployeeDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeDataMouseClicked
        // Get the selected row index
        int rowIndex = EmployeeData.getSelectedRow();
        // Ensure a row is selected and it's a single click
        if (rowIndex >= 0 && evt.getClickCount() == 1) {
            // Retrieve data from the JTable
            String enumber = EmployeeData.getValueAt(rowIndex, 0).toString();
            String elname = EmployeeData.getValueAt(rowIndex, 1).toString();
            String efname = EmployeeData.getValueAt(rowIndex, 2).toString();
            String bday = EmployeeData.getValueAt(rowIndex, 3).toString();
            String address = EmployeeData.getValueAt(rowIndex, 4).toString();
            String phone = EmployeeData.getValueAt(rowIndex, 5).toString();
            String sss = EmployeeData.getValueAt(rowIndex, 6).toString();
            String philhealth = EmployeeData.getValueAt(rowIndex, 7).toString();
            String tin = EmployeeData.getValueAt(rowIndex, 8).toString();
            String pagibig = EmployeeData.getValueAt(rowIndex, 9).toString();
            String status = EmployeeData.getValueAt(rowIndex, 10).toString();
            String position = EmployeeData.getValueAt(rowIndex, 11).toString();
            String supervisor = EmployeeData.getValueAt(rowIndex, 12).toString();
            String basic = EmployeeData.getValueAt(rowIndex, 13).toString();
            String rice = EmployeeData.getValueAt(rowIndex, 14).toString();
            String phoneAllowance = EmployeeData.getValueAt(rowIndex, 15).toString();
            String clothing = EmployeeData.getValueAt(rowIndex, 16).toString();
            String grossSemi = EmployeeData.getValueAt(rowIndex, 17).toString();
            String hourly = EmployeeData.getValueAt(rowIndex, 18).toString();

            // Set the retrieved data to text fields
            tfEnum.setText(enumber);
            tfLastName.setText(elname);
            tfFirstName.setText(efname);
            tfBirthday.setText(bday);
            tfAddress.setText(address);
            tfPhone.setText(phone);
            tfSss.setText(sss);
            tfPhilhealth.setText(philhealth);
            tfTin.setText(tin);
            tfPagibig.setText(pagibig);
            tfStatus.setText(status);
            tfPosition.setText(position);
            tfSupervisor.setText(supervisor);
            tfBasic.setText(basic);
            tfRiceSubsidy.setText(rice);
            tfPhoneAllowance.setText(phoneAllowance);
            tfClothing.setText(clothing);
            tfGrossSemi.setText(grossSemi);
            tfHourlyRate.setText(hourly);
        }
    }//GEN-LAST:event_EmployeeDataMouseClicked
    private String getValueAsString(Object value) {
        // Check if the value is null
        if (value != null) {
            return value.toString();
        } else {
            return ""; // Return an empty string if the value is null
        }
    }
    private void tfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddressActionPerformed

    private void tfBirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBirthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBirthdayActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AddEmployeeForm employeeForm = new AddEmployeeForm();
        JDialog dialog = new JDialog();
        dialog.setTitle("View Employee");
        dialog.getContentPane().add(employeeForm);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmployeeData;
    private com.group4.resources.Button btnAdd;
    private com.group4.resources.Button btnDelete;
    private com.group4.resources.Button btnUpdate;
    private com.group4.resources.Button btnView;
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
