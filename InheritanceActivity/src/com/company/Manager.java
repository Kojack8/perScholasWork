package com.company;

import java.text.DecimalFormat;

public class Manager extends Employee {
    long employeeID;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;

    public Manager(){

    }

    protected Manager(long employeeID, String employeeName, String employeeAddress, long employeePhone, double basicSalary){
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
        double transportAllowance = (15.0/100) * this.basicSalary;
        return transportAllowance;
    }



}
