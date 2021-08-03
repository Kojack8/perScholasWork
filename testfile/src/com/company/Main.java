package com.company;

public class Main {

    public static void main(String[] args) {
        // Write a program that declares 2 integer variables, x, and y, and
        // assign 5 to x and 6 to y. Declare a variable q and assign y/x to it and print q.
        // Now, cast y to a double and assign to q. Print q again.

        int x = 5;
        int y = 6;
        int q = y/x;
        System.out.println(q);
        double z = (double) 6;
        System.out.println(q);
    }
}


