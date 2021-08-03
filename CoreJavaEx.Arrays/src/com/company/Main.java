package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Solution {

    public void pone(){
        //Write a program that creates an array of integers with a length of 3.
        // Assign the values 1, 2, and 3 to the indexes. Print out each array element.
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public void ptwo(){
        // Write a program that returns the middle element in an array.
        // Give the following values to the integer array: {13, 5, 7, 68, 2}
        // and produce the following output:
        int[] arr = {13, 5, 7, 68, 2};
        System.out.println(arr[(arr.length /2)]);
    }

    public void pthree(){
        // Write a program that creates an array of String type and initializes
        // it with the strings “red”, “green”, “blue” and “yellow”. Print out the
        // array length. Make a copy using the clone( ) method. Use the Arrays.toString( )
        // method on the new array to verify that the original array was copied.
        String[] arr = {"red", "green", "blue", "yellow"};
        System.out.println(arr.length);
        String[] copy = arr.clone();
        System.out.println(Arrays.toString(copy));
    }

    public void pfour(){
        //Write a program that creates an integer array with 5 elements (i.e., numbers).
        // The numbers can be any integers.  Print out the value at the first index and
        // the last index using length - 1 as the index. Now try printing the value at
        // index = length ( e.g., myArray[myArray.length ] ).  Notice the type of exception
        // which is produced. Now try to assign a value to the array index 5. You should get
        // the same type of exception
        int[] arr = {5, 10, 15, 20, 25};
        System.out.println("First value is: " + arr[0] + ". Last value is: " + arr[arr.length -1]);
        // System.out.println(arr[arr.length]);
        // System.out.println(arr[5]);
    }

    public void pfive(){
        //Write a program where you create an integer array with a length of 5.
        // Loop through the array and assign the value of the loop control variable
        // (e.g., i) to the corresponding index in the array.
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void psix(){
        //Write a program where you create an integer array of 5 numbers.
        // Loop through the array and assign the value of the loop control
        // variable multiplied by 2 to the corresponding index in the array.
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i * 2;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void pseven(){
        //Write a program where you create an array of 5 elements.
        // Loop through the array and print the value of each element,
        // except for the middle (index 2) element.
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            if (i != 2) {
                arr[i] = i;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public void peight(){
        //Write a program that creates a String array of 5 elements
        // and swaps the first element with the middle element without
        // creating a new array.
        String[] arr = {"My", "Very", "Educated", "Mother", "Just"};
        String tmp = arr[0];
        arr[0] = arr[2];
        arr[2] = tmp;
        System.out.println(Arrays.toString(arr));
    }

    public void pnine(){
        //Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
        // Print the array in ascending order, print the smallest and the largest element of the array.
        // The output will look like the following:
        // Array in ascending order: 0, 1, 2, 4, 9, 13 | The smallest number is 0 The biggest number is 13
        int[] arr = {4, 2, 9, 13, 1, 0};
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void pten(){
        //Create an array that includes an integer, 3 strings, and 1 double. Print the array.
        Object[] arr = new Object[5];
        arr[0] = 1;
        arr[1] = "Hello";
        arr[2] = "World";
        arr[3] = "!!!";
        arr[4] = 123456789d;
        // System.out.println((int) arr[0] + (double) arr[4]);
        System.out.println(Arrays.toString(arr));

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
        solution.pseven();
        solution.peight();
        solution.pnine();
        solution.pten();

    }
}
