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
public class FullTimeEmployee extends Employee {
  
  private double basicSalary;
  private double houseAllowance;

  public FullTimeEmployee(int id, String name, String category, 
          String department, double basicSalary, double houseAllowance) {
    super(id, name, category, department);
    
    this.basicSalary = basicSalary;
    this.houseAllowance = houseAllowance;
  }
  
  @Override
  public void calculateGrossSalary() {
    super.grossSalary = basicSalary + houseAllowance;
  }
  
  @Override
  public String toString() {
    return super.toString() + 
            "\nBasic Salary = " + basicSalary + 
            "\nHouse Allowance = " + houseAllowance +
            "\nGross Salary = " + super.getGrossSalary() +
            "\nEPF = " + super.getEPF() + 
            "\nNet Salary = " + super.getNetSalary();
  }
}
