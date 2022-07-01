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
public class PartTimeEmployee extends Employee {
  
  private double payRatePerDay;
  private int workedDays;
  
  public PartTimeEmployee(int id, String name, String category, 
          String department, double payRatePerDay, int workedDays) {
    super(id, name, category, department);
    
    this.payRatePerDay = payRatePerDay;
    this.workedDays = workedDays;
  }
  
  @Override
  public void calculateGrossSalary() {
    super.grossSalary = payRatePerDay * workedDays;
  }
  
  @Override
  public String toString() {
    return super.toString() + 
            "\nRate Per Day = " + payRatePerDay + 
            "\nWorked Days = " + workedDays + 
            "\nGross Salary = " + super.getGrossSalary() + 
            "\nEPF = " + super.getEPF() + 
            "\nNet Salary = " + super.getNetSalary();
  }
}
