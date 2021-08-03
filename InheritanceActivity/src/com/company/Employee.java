package com.company;

import java.text.DecimalFormat;

public class Employee {
    long employeeID;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.8;
    double hra = 1000.5;

    public Employee(){

    }

    protected Employee(long employeeID, String employeeName, String employeeAddress, long employeePhone){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
    }


    protected String calculateSalary(double basicSalary){
        DecimalFormat df = new DecimalFormat(("#.00"));
        double salary = basicSalary + (basicSalary * (this.specialAllowance / 100)) + (basicSalary * (this.hra / 100));
        return df.format(salary);
    }

    protected double calculateTransportAllowance(double basicSalary){
        double transportAllowance = (10.0/100) * basicSalary;
        return transportAllowance;
    }

}
