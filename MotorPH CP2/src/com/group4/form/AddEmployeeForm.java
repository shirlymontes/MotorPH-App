/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.group4.form;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author PotChi
 */
public class AddEmployeeForm extends javax.swing.JPanel {

    /**
     * Creates new form AddEmployeeForm
     */
    public AddEmployeeForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddBtn = new com.group4.resources.Button();
        tfSss = new javax.swing.JTextField();
        tfClothing = new javax.swing.JTextField();
        tfTin = new javax.swing.JTextField();
        tfGrossSemi = new javax.swing.JTextField();
        tfSupervisor = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        tfPagibig = new javax.swing.JTextField();
        tfEnum = new javax.swing.JTextField();
        tfPhilhealth = new javax.swing.JTextField();
        tfPosition = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        tfHourlyRate = new javax.swing.JTextField();
        tfFirstName = new javax.swing.JTextField();
        tfBirthday = new javax.swing.JTextField();
        tfBasic = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        tfRiceSubsidy = new javax.swing.JTextField();
        tfPhoneAllowance = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        AddBtn.setBackground(new java.awt.Color(255, 255, 204));
        AddBtn.setText("ADD");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        tfSss.setBorder(javax.swing.BorderFactory.createTitledBorder("SSS"));

        tfClothing.setBorder(javax.swing.BorderFactory.createTitledBorder("Clothing Allowance"));

        tfTin.setBorder(javax.swing.BorderFactory.createTitledBorder("TIN"));

        tfGrossSemi.setBorder(javax.swing.BorderFactory.createTitledBorder("Gross Semi-Monthly Rate"));

        tfSupervisor.setBorder(javax.swing.BorderFactory.createTitledBorder("Supervisor"));
        tfSupervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSupervisorActionPerformed(evt);
            }
        });

        tfLastName.setBorder(javax.swing.BorderFactory.createTitledBorder("Last Name"));

        tfPagibig.setBorder(javax.swing.BorderFactory.createTitledBorder("PAGIBIG"));

        tfEnum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEnum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Number", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        tfEnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEnumActionPerformed(evt);
            }
        });

        tfPhilhealth.setBorder(javax.swing.BorderFactory.createTitledBorder("PhilHealth"));

        tfPosition.setBorder(javax.swing.BorderFactory.createTitledBorder("Position"));

        tfPhone.setBorder(javax.swing.BorderFactory.createTitledBorder("Phone Number"));
        tfPhone.setMinimumSize(new java.awt.Dimension(50, 40));

        tfStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        tfHourlyRate.setBorder(javax.swing.BorderFactory.createTitledBorder("Hourly Rate"));

        tfFirstName.setBorder(javax.swing.BorderFactory.createTitledBorder("First Name"));

        tfBirthday.setBorder(javax.swing.BorderFactory.createTitledBorder("Birthday"));
        tfBirthday.setMinimumSize(new java.awt.Dimension(50, 40));

        tfBasic.setBorder(javax.swing.BorderFactory.createTitledBorder("Basic Salary"));
        tfBasic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBasicActionPerformed(evt);
            }
        });

        tfAddress.setBorder(javax.swing.BorderFactory.createTitledBorder("Address"));

        tfRiceSubsidy.setBorder(javax.swing.BorderFactory.createTitledBorder("Rice Subsidy"));
        tfRiceSubsidy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRiceSubsidyActionPerformed(evt);
            }
        });

        tfPhoneAllowance.setBorder(javax.swing.BorderFactory.createTitledBorder("Phone Allowance"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfSss, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfPhilhealth, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEnum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfPosition, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(tfBirthday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfFirstName, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(tfPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfLastName)
                                    .addComponent(tfSupervisor)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfClothing, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(tfBasic, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTin, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfGrossSemi))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPagibig, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfHourlyRate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(tfPhoneAllowance, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfRiceSubsidy, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPhilhealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPagibig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfRiceSubsidy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBasic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPhoneAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfClothing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfGrossSemi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfEnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEnumActionPerformed

    private void tfRiceSubsidyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRiceSubsidyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRiceSubsidyActionPerformed

    private void tfBasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBasicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBasicActionPerformed

    private void tfSupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSupervisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSupervisorActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // Retrieve data from text fields
        String enumber = tfEnum.getText();
        String elname = tfLastName.getText();
        String efname = tfFirstName.getText();
        String bday = tfBirthday.getText();
        String add = tfAddress.getText();
        String phone = tfPhone.getText();
        String sss = tfSss.getText();
        String philhealth = tfPhilhealth.getText();
        String tin = tfTin.getText();
        String pagibig = tfPagibig.getText();
        String status = tfStatus.getText();
        String supervisor = tfSupervisor.getText();
        String basic = tfBasic.getText();
        String rice = tfRiceSubsidy.getText();
        String clothing = tfClothing.getText();
        String grossSemi = tfGrossSemi.getText();
        String hourly = tfHourlyRate.getText();
        String phoneAllowance = tfPhoneAllowance.getText();
        String position = tfPosition.getText();

        
        String newEntry = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",
                enumber, elname, efname, bday, add, phone, sss, philhealth, tin, pagibig,
                status, supervisor, basic, rice, clothing, grossSemi, hourly, phoneAllowance, position);

        try (PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\PotChi\\Documents\\NetBeansProjects\\MotorPH-App\\MotorPH CP2\\src\\com\\group4\\csv\\employeedata1.csv", true))) {
            writer.println(newEntry);
            writer.flush();
            System.out.println("Employee Added Successfully!");
        } catch (IOException e) {
            System.err.println("Adding Employee Failed " + e.getMessage());
        }
    }//GEN-LAST:event_AddBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.group4.resources.Button AddBtn;
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
