package com.company;

public class Main {

    public static void main(String[] args) {
	Manager peter = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
	System.out.println("Peter earns $" + peter.calculateSalary());

	Trainee jack = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
    System.out.println("Jack earns $" + jack.calculateSalary());

    System.out.println("Peter's transport allowance is $" + peter.calculateTransportAllowance());
    System.out.println("Jack's transport allowance is $" + jack.calculateTransportAllowance());
    }
}
