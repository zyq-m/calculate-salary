/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeForm;

import java.util.ArrayList;

/**
 *
 * @author haziq musa
 */
public class EmployeeForm extends javax.swing.JFrame {

  private ArrayList<Employee> employees = new ArrayList<Employee>();
  private int index = 0;
  private boolean partTime = false;
  private boolean fullTime = false;
  
  /**
   * Creates new form EmployeeForm
   */
  public EmployeeForm() {
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

    buttonGroup1 = new javax.swing.ButtonGroup();
    idLabel = new javax.swing.JLabel();
    idTF = new javax.swing.JTextField();
    nameLabel = new javax.swing.JLabel();
    nameTF = new javax.swing.JTextField();
    departmentLabel = new javax.swing.JLabel();
    statusLabel = new javax.swing.JLabel();
    departmentCB = new javax.swing.JComboBox();
    payRateLabel = new javax.swing.JLabel();
    payRateTF = new javax.swing.JTextField();
    partTimeRB = new javax.swing.JRadioButton();
    fullTimeRB = new javax.swing.JRadioButton();
    dayWorkTF = new javax.swing.JTextField();
    dayWorkLabel = new javax.swing.JLabel();
    basicSalaryLabel = new javax.swing.JLabel();
    basicSalaryTF = new javax.swing.JTextField();
    allowanceLabel = new javax.swing.JLabel();
    allowanceTF = new javax.swing.JTextField();
    grossSalaryTF = new javax.swing.JTextField();
    grossSalaryLabel = new javax.swing.JLabel();
    epfTF = new javax.swing.JTextField();
    epfLabel = new javax.swing.JLabel();
    netSalaryTF = new javax.swing.JTextField();
    netSalaryLabel = new javax.swing.JLabel();
    calculateBtn = new javax.swing.JButton();
    displayBtn = new javax.swing.JButton();
    resetBtn = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    outputTA = new javax.swing.JTextArea();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    idLabel.setText("Employee ID");

    idTF.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        idTFActionPerformed(evt);
      }
    });

    nameLabel.setText("Employee Name");

    nameTF.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        nameTFActionPerformed(evt);
      }
    });

    departmentLabel.setText("Department");

    statusLabel.setText("Employee Status");

    departmentCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please Select ...", "School of Accounting", "School of Computing", "School of Quantitative", "School of Economic" }));
    departmentCB.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        departmentCBActionPerformed(evt);
      }
    });

    payRateLabel.setText("Pay Rate Per Day");

    payRateTF.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        payRateTFActionPerformed(evt);
      }
    });

    buttonGroup1.add(partTimeRB);
    partTimeRB.setText("Part Time");
    partTimeRB.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        partTimeRBActionPerformed(evt);
      }
    });

    buttonGroup1.add(fullTimeRB);
    fullTimeRB.setText("Full Time");
    fullTimeRB.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        fullTimeRBActionPerformed(evt);
      }
    });

    dayWorkTF.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        dayWorkTFActionPerformed(evt);
      }
    });

    dayWorkLabel.setText("Number of Days Worked");

    basicSalaryLabel.setText("Basic Salary");

    basicSalaryTF.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        basicSalaryTFActionPerformed(evt);
      }
    });

    allowanceLabel.setText("House Allowance");

    allowanceTF.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        allowanceTFActionPerformed(evt);
      }
    });

    grossSalaryTF.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        grossSalaryTFActionPerformed(evt);
      }
    });

    grossSalaryLabel.setText("Gross Salary");

    epfTF.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        epfTFActionPerformed(evt);
      }
    });

    epfLabel.setText("EPF @ KWSP");

    netSalaryTF.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        netSalaryTFActionPerformed(evt);
      }
    });

    netSalaryLabel.setText("Net Salary");

    calculateBtn.setText("Calculate Salary and Save");
    calculateBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        calculateBtnActionPerformed(evt);
      }
    });

    displayBtn.setText("Display All Employees");
    displayBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        displayBtnActionPerformed(evt);
      }
    });

    resetBtn.setText("Reset");
    resetBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        resetBtnActionPerformed(evt);
      }
    });

    outputTA.setColumns(20);
    outputTA.setRows(5);
    jScrollPane1.setViewportView(outputTA);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(idLabel)
          .addComponent(nameLabel)
          .addComponent(departmentLabel)
          .addComponent(statusLabel)
          .addComponent(payRateLabel)
          .addComponent(dayWorkLabel)
          .addComponent(basicSalaryLabel)
          .addComponent(allowanceLabel)
          .addComponent(grossSalaryLabel)
          .addComponent(epfLabel)
          .addComponent(netSalaryLabel)
          .addComponent(calculateBtn))
        .addGap(38, 38, 38)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(grossSalaryTF, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(epfTF, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(netSalaryTF, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(displayBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(34, 34, 34)
            .addComponent(resetBtn))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
              .addComponent(partTimeRB)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
              .addComponent(fullTimeRB))
            .addComponent(idTF, javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameTF, javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(departmentCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(allowanceTF, javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basicSalaryTF, javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dayWorkTF, javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(payRateTF, javax.swing.GroupLayout.Alignment.LEADING)))
        .addGap(1, 1, 1)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(idLabel)
              .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(nameLabel)
              .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(departmentLabel)
              .addComponent(departmentCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(statusLabel)
              .addComponent(partTimeRB)
              .addComponent(fullTimeRB))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(payRateLabel)
              .addComponent(payRateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(dayWorkLabel)
              .addComponent(dayWorkTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(basicSalaryLabel)
              .addComponent(basicSalaryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(allowanceLabel)
              .addComponent(allowanceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(grossSalaryLabel)
              .addComponent(grossSalaryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(epfLabel)
              .addComponent(epfTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(netSalaryLabel)
              .addComponent(netSalaryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(calculateBtn)
          .addComponent(displayBtn)
          .addComponent(resetBtn))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTFActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_idTFActionPerformed

  private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_nameTFActionPerformed

  private void payRateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payRateTFActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_payRateTFActionPerformed

  private void fullTimeRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullTimeRBActionPerformed
    // TODO add your handling code here:
    // disable pay rate & day worked
    payRateTF.setEnabled(false);
    dayWorkTF.setEnabled(false);
    fullTime = true;
    
    // enable basic salary and allowance text field
    basicSalaryTF.setEnabled(true);
    allowanceTF.setEnabled(true);
    partTime = false;
    
  }//GEN-LAST:event_fullTimeRBActionPerformed

  private void dayWorkTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayWorkTFActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_dayWorkTFActionPerformed

  private void basicSalaryTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basicSalaryTFActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_basicSalaryTFActionPerformed

  private void allowanceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allowanceTFActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_allowanceTFActionPerformed

  private void grossSalaryTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grossSalaryTFActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_grossSalaryTFActionPerformed

  private void epfTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epfTFActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_epfTFActionPerformed

  private void netSalaryTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netSalaryTFActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_netSalaryTFActionPerformed
  
  private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
  
    String empId = idTF.getText();
    String empName = nameTF.getText();
    String[] category = {fullTimeRB.getText(), partTimeRB.getText()}; 
    String department = departmentCB.getSelectedItem().toString();
    
    // FULL TIME EMPLOYEE
    String basicSalary = basicSalaryTF.getText();
    String allowance = allowanceTF.getText();

    // PART TIME EMPLOYEE
    String payRate = payRateTF.getText(); 
    String workedDay = dayWorkTF.getText(); 
    
    // FULL TIME EMPLOYEE ACTION
    if (fullTime) {
      
      // assign into employees[]
      FullTimeEmployee fullTime = new FullTimeEmployee(toInt(empId), empName, 
              category[0], department, toDouble(basicSalary), 
              toDouble(allowance));
      employees.add(fullTime);
      
      // calculate salary
      calculateSalary(index);
      
      index++;
    }
    
    // PART TIME EMPLOYEE ACTION
    if (partTime) {
      
      // assign into employees[]
      PartTimeEmployee partTime = new PartTimeEmployee(toInt(empId), empName, 
              category[1], department, toDouble(payRate), toInt(workedDay));
      employees.add(partTime);
      
      // calculate salary
      calculateSalary(index);
      
      index++;
    }
      
  }//GEN-LAST:event_calculateBtnActionPerformed

  private void partTimeRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partTimeRBActionPerformed
    
    // disable basic salary and allowance text field
    basicSalaryTF.setEnabled(false);
    allowanceTF.setEnabled(false);
    partTime = true;
    
    // enable pay rate and day work text field
    payRateTF.setEnabled(true);
    dayWorkTF.setEnabled(true);
    fullTime = false;
    
  }//GEN-LAST:event_partTimeRBActionPerformed

  private void departmentCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentCBActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_departmentCBActionPerformed

  private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
    
    // get all employees data
    String output = "A list of Employees\n\n";
    int countPartTime = 0;
    int countFullTime = 0;
    
    for (int i = 0; i < employees.size(); i++) {
      output += employees.get(i).toString() + "\n\n";
      // count part time, full time, no of employee
      if (employees.get(i) instanceof PartTimeEmployee) {
        countPartTime++;
      } else {
        countFullTime++;
      }
    }
    
    // concate number of employees
    output += "\nThe number of Part Time Employees = " + countPartTime +
            "\nThe number of Full Time Employees = " + countFullTime + 
            "\nThen number of Available employees = " + (employees.size());
    
    outputTA.setText(output);
  }//GEN-LAST:event_displayBtnActionPerformed

  private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
    
    // set all text field to initial state
    idTF.setText("");
    nameTF.setText("");
    departmentCB.setSelectedIndex(0);
    // clear selected employee status radio button
    buttonGroup1.clearSelection();
    payRateTF.setText("");
    dayWorkTF.setText("");
    basicSalaryTF.setText("");
    allowanceTF.setText("");
    epfTF.setText("");
    netSalaryTF.setText("");
    outputTA.setText("");
    
  }//GEN-LAST:event_resetBtnActionPerformed

  int toInt(String value) {
    if (!value.equals("")) {
      return Integer.parseInt(value);
    } else {
      return 0;
    }
  }
  
  double toDouble(String value) {
    if (!value.equals("")) {
      return Double.parseDouble(value);
    } else {
      return 0;
    }
  }
  
  void calculateSalary(int i) {
    employees.get(i).calculateGrossSalary();
    employees.get(i).calculateEPFContribution();
    employees.get(i).calculateNetSalary();
  }
  
  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new EmployeeForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel allowanceLabel;
  private javax.swing.JTextField allowanceTF;
  private javax.swing.JLabel basicSalaryLabel;
  private javax.swing.JTextField basicSalaryTF;
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JButton calculateBtn;
  private javax.swing.JLabel dayWorkLabel;
  private javax.swing.JTextField dayWorkTF;
  private javax.swing.JComboBox departmentCB;
  private javax.swing.JLabel departmentLabel;
  private javax.swing.JButton displayBtn;
  private javax.swing.JLabel epfLabel;
  private javax.swing.JTextField epfTF;
  private javax.swing.JRadioButton fullTimeRB;
  private javax.swing.JLabel grossSalaryLabel;
  private javax.swing.JTextField grossSalaryTF;
  private javax.swing.JLabel idLabel;
  private javax.swing.JTextField idTF;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel nameLabel;
  private javax.swing.JTextField nameTF;
  private javax.swing.JLabel netSalaryLabel;
  private javax.swing.JTextField netSalaryTF;
  private javax.swing.JTextArea outputTA;
  private javax.swing.JRadioButton partTimeRB;
  private javax.swing.JLabel payRateLabel;
  private javax.swing.JTextField payRateTF;
  private javax.swing.JButton resetBtn;
  private javax.swing.JLabel statusLabel;
  // End of variables declaration//GEN-END:variables
}
