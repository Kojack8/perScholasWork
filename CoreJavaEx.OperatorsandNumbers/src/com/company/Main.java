package com.company;

import java.lang.String;

class Answer{

    public void pone(){
    System.out.println("1 in binary (as bytes) is 0001");
    System.out.println("8 in binary is 1000");
    System.out.println("33 in binary is 0010 0001");
    System.out.println("78 in binary is 0100 1110");
    System.out.println("787 in binary is 0011 0001 0011");
    System.out.println("33,987 in binary is 1000 0100 1100 0011");
    }

    public void ptwo(){
    System.out.println("0010 in decimal is 2");
    System.out.println("1001 in decimal is 9");
    System.out.println("0011 0100 in decimal is 52");
    System.out.println("0111 0010 in decimal is 114");
    System.out.println("0010 0001 1111 in decimal is 543");
    System.out.println("0010 1100 0110 0111 in decimal is 11367");
    }

    public void pthree(){
        int x = 2;
        System.out.println("3A) Initial decimal is " + x);
        System.out.println("3A) Initial binary is: " + Integer.toBinaryString(x));
        x = (x << 1);
        // 100 & 4
        System.out.println("3A) Shifted binary is: " + Integer.toBinaryString(x));
        System.out.println("3A) Shifted decimal is " + x);

        x = 9;
        System.out.println("3B) Initial decimal is " + x);
        System.out.println("3B) Initial binary is: " + Integer.toBinaryString(x));
        x = (x << 1);
        // 10010 & 18
        System.out.println("3B) Shifted binary is: " + Integer.toBinaryString(x));
        System.out.println("3B) Shifted decimal is " + x);

        x = 17;
        System.out.println("3C) Initial decimal is " + x);
        System.out.println("3C) Initial binary is: " + Integer.toBinaryString(x));
        x = (x << 1);
        // 100010 & 34
        System.out.println("3C) Shifted binary is: " + Integer.toBinaryString(x));
        System.out.println("3C) Shifted decimal is " + x);

        x = 88;
        System.out.println("3D) Initial decimal is " + x);
        System.out.println("3D) Initial binary is: " + Integer.toBinaryString(x));
        x = (x << 1);
        // 10110000 & 176
        System.out.println("3D) Shifted binary is: " + Integer.toBinaryString(x));
        System.out.println("3D) Shifted decimal is " + x);
    }

    public void pfour() {
        int x = 150;
        System.out.println("4A) Initial decimal is " + x);
        System.out.println("4A) Initial binary is: " + Integer.toBinaryString(x));
        x = (x >> 2);
        // 100101 & 37
        System.out.println("4A) Shifted binary is: " + Integer.toBinaryString(x));
        System.out.println("4A) Shifted decimal is " + x);

        x = 225;
        System.out.println("4B) Initial decimal is " + x);
        System.out.println("4B) Initial binary is: " + Integer.toBinaryString(x));
        x = (x >> 2);
        // 111000 & 56
        System.out.println("4B) Shifted binary is: " + Integer.toBinaryString(x));
        System.out.println("4B) Shifted decimal is " + x);

        x = 1555;
        System.out.println("4C) Initial decimal is " + x);
        System.out.println("4C) Initial binary is: " + Integer.toBinaryString(x));
        x = (x >> 2);
        // 110000100 & 388
        System.out.println("4C) Shifted binary is: " + Integer.toBinaryString(x));
        System.out.println("4C) Shifted decimal is " + x);

        x = 32456;
        System.out.println("4D) Initial decimal is " + x);
        System.out.println("4D) Initial binary is: " + Integer.toBinaryString(x));
        x = (x >> 2);
        // 1111110110010 & 8114
        System.out.println("4D) Shifted binary is: " + Integer.toBinaryString(x));
        System.out.println("4D) Shifted decimal is " + x);
    }

    public void pfive() {
        int x = 7; //  0000 0111
        int y = 17; // 0001 0001
        int z = x & y; // 0000 0001 = 1
        System.out.print("5A) Bit operator results is " + z);
        System.out.println(". Which in binary is " + Integer.toBinaryString(z));

        z = x | y; // 0001 0111 = 23
        System.out.print("5B) Bit operator results is " + z);
        System.out.println(". Which in binary is " + Integer.toBinaryString(z));
    }

    public void psix() {
        int x = 5;
        System.out.println("6) Initial number is: " + x++ + " but the postfix inc. makes it " + x);
    }
    public void pseven() {
        int x = 5;
        int y = 1;
        System.out.println("6) Initial number is: " + x++ + " but the postfix inc. makes it " + x
                + " and this prefix inc. makes it " + ++x + " or I can add it with a variable assigned 1 to make "
                + (x + y));
    }
    public void peight() {
        // Write a program that declares 2 integer variables, x, and y, and then assigns
        // 5 to x and 8 to y. Create another variable sum and assign the value of ++x added
        // to y and print the result. Notice the value of the sum (should be 14). Now change the
        // increment operator to postfix (x++) and re-run the program. Notice what the value of sum
        // is. The first configuration incremented x and then calculated the sum while the second
        // configuration calculated the sum and then incremented x.
        int x = 5;
        int y = 8;
        int sum = ++x + y;
        System.out.println("7) The first result with a prefix is " + sum);

        x = 5;
        y = 8;
        sum = x++ + y;
        System.out.println("7) The first result with a postfix is " + sum);
    }

}

public class Main {

    public static void main(String[] args) {
	Answer answer = new Answer();
	answer.pone();
	answer.ptwo();
	answer.pthree();
    answer.pfour();
    answer.pfive();
    answer.psix();
    answer.pseven();
    answer.peight();

    }
}
