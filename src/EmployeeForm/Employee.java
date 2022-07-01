/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeForm;

/**
 *
 * @author haziq musa
 */
public class Employee {
  
  private int empID;
  private String empName;
  private String category;
  private String department;
  protected double grossSalary;
  protected double netSalary;
  private double EPF;
  
  public Employee(int id, String name, String category, String department) {
    this.empID = id;
    this.empName = name;
    this.category = category;
    this.department = department;
  }
  
  public double getGrossSalary() {
    return grossSalary;
  }
  
  public double getNetSalary() {
    return netSalary;
  }
  
  public double getEPF() {
    return EPF;
  }
  
  public void calculateGrossSalary() {
   grossSalary = netSalary + EPF;
  }
  
  public void calculateNetSalary() {
    netSalary = grossSalary - EPF;
  }
  
  public void calculateEPFContribution() {
    EPF = grossSalary * 0.09;
  }
  
  public String toString() {
    return "Employee Number = " + empID + 
            "\nEmployee Name = " + empName + 
            "\nEmployee Status = " + category + 
            "\nDepartment = " + department;
  }
}
