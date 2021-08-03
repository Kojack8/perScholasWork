package com.company;

import java.util.Scanner;

class Solution {

    public void pone() {
        //Write a program that declares 1 integer variable x, and then assigns 7 to it.
        // Write an if statement to print out “Less than 10” if x is less than 10.
        // Change x to equal 15 and notice the result (console should not display anything).
        int x = 7;
        if (x < 10) {
            System.out.println("Less then 10");
        }
        int y = 15;
        if (y < 15){
            System.out.println("Less then 10");
        }
    }

    public void ptwo(){
        //Write a program that declares 1 integer variable x, and then assigns 7 to it.
        // Write an if-else statement that prints out “Less than 10” if x is less than 10
        // and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.
        // THIS QUESTION DOES NOT ACCOUNT FOR THE NUMBER 10.
        int x = 7;
        if (x < 10){
            System.out.println("Less than 10");
        } else if (x > 10) {
            System.out.println("Greater than 10");
        }
        x = 15;
        if (x < 10){
            System.out.println("Less than 10");
        } else if (x > 10) {
            System.out.println("Greater than 10");
        }
    }
    public void pthree(){
        //Write a program that declares 1 integer variable x, and then assigns 15 to it.
        // Write an “if-else-if” statement that prints out “Less than 10” if x is less than 10,
        // “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or
        // equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.
        // STILL DOES NOT ACCOUNT FOR THE NUMBER 10 BUT I'M GOING TO PRETEND IT DOES
        //int x = 15;
        int x = 50;
        if (x < 10){
            System.out.println("Less than ten");
        } else if (x > 9 && x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }
    }

    public void pfour(){
        //Write a program that declares 1 integer variable x, and then assigns
        // 15 to it. Write an if-else statement that prints “Out of range” if
        // the number is less than 10 or greater than 20 and prints “In range”
        // if between 10 and 20 (including equal to 10 or 20). Change x to 5 and
        // notice the result.
        //int x = 15;
        int x = 5;
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }
    }

    public void pfive(){
        //Write a program that uses if-else-if statements to print out grades
        // A, B, C, D, F according to the following criteria: A: 90-100 B: 80-89
        //C: 70-79 D: 60-69 F: <60 Use the Scanner class to accept a number score
        // from the user to determine the letter grade. Print out “Score out of range.”
        // if the score is less than 0 or greater than 100.

        System.out.println("Please input your score");
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();

        if (grade > 89 && grade < 101) {
            System.out.println("A");
        } else if (grade > 79 && grade < 90){
            System.out.println("B");
        } else if (grade > 69 && grade < 80){
            System.out.println("C");
        } else if (grade > 59 && grade < 70){
            System.out.println("D");
        } else if (grade < 60 && grade > -1){
            System.out.println("F");
        } else {
            System.out.println("Score Out of Range");
        }
    }

    public void psix(){
        //Write a program that accepts an integer between 1 and 7 from the user.
        // Use a switch statement to print out the corresponding weekday. Print
        // “Out of range” if the number is less than 1 or greater than 7. Don’t
        // forget to include “break” statements in each of your cases.
        System.out.println("Please input a number between 1 & 7");
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();

        switch(day){
            case 1: System.out.println("Monday");
            break;

            case 2: System.out.println("Tuesday");
            break;

            case 3: System.out.println("Wednesday");
            break;

            case 4: System.out.println("Thursday");
            break;

            case 5: System.out.println("Friday");
            break;

            case 6: System.out.println("Saturday");
            break;

            case 7: System.out.println("Sunday");
            break;

            default: System.out.println("Out of range");
            break;
        }

    }
}


public class Main {


    public static void main(String[] args) {
	Solution solution = new Solution();
	solution.pone();
	solution.ptwo();
	solution.pthree();
	solution.pfour();
	solution.pfive();
	solution.psix();
    }
}
