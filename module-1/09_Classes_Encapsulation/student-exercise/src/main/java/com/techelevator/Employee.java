package com.techelevator;

public class Employee {

	private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;

   
    public Employee(int employeeId, String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = salary;
    }

   
    public int getEmployeeId() {
        return employeeId;
    }

    
    public String FirstName() {
        return firstName;
    }

    
    public String LastName() {
        return lastName;        
    }

    
    public String FullName() {
        return lastName + ", " + firstName;
    }

    public String getDepartment() {
        return department;
    }

    
    public void setDepartment(String department) {
    	this.department = department;
    }
    
    public double getAnnualSalary() {
        return annualSalary;        
    }

  
    public void RaiseSalary(double percentage) {
        double raiseAmount = annualSalary * percentage/100;
        annualSalary += raiseAmount;
    }

}
