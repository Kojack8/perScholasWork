package com.company;

public class Trainee extends Employee {
    long employeeID;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;

    public Trainee(){

    }

    protected Trainee(long employeeID, String employeeName, String employeeAddress, long employeePhone, double basicSalary){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }

    public String calculateSalary(){
        String salary = super.calculateSalary(this.basicSalary);
        return salary;
    }

    protected double calculateTransportAllowance(){
        double transportAllowance = super.calculateTransportAllowance(this.basicSalary);
        return transportAllowance;
    }
}
