package com.company;

class Solution{

    public void pone(){
        //Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.
        for (int i = 0; i < 10; i++){
            System.out.println(i + 1);
        }
    }

    public void ptwo() {
        //Write a program that uses a while loop to loop through the numbers 0-100 in increments
        // of 10 and prints out each number.
        int counter = 0;
        while (counter <= 100){
            System.out.println(counter);
            counter += 10;
        }
    }

    public void pthree() {
        int i = 1;
        do {
            System.out.println(i++);
        } while ( i < 11);
    }

    public void pfour(){
        for (int i = 1; i < 101; i++){
            if (i > 24 && i < 76){
                continue;
            }
            if (i % 5 == 0){
                System.out.println(i);
            }
        }
    }

    public void pfive(){
        //Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number
        // if is a multiple of 5, but do not print out any numbers greater than 50. Use the “break” keyword
        // to accomplish this.
        for (int i = 1; i < 101; i++){
            if (i > 50){
                break;
            }
            if (i % 5 == 0){
                System.out.println(i);
            }
        }
    }
    public void psix(){
        for (int i = 0; i < 2; i++){
            System.out.println("Week " + (i + 1));
            for (int j = 0; j < 5; j++){
                System.out.println("Day " + (j + 1));
            }
        }
    }

    public void pseven(){
        for (int i = 10; i < 201; i++){
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); j++){
                int end = s.length() - j;
                if (s.charAt(j) != s.charAt(end - 1)){
                    break;
                }
                if (j == end || j == end - 1){
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }

    public void peight(){
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " " + num2 + " ");
        while ((num1 + num2) < 50){
            System.out.print((num1 + num2) + " ");
            int tmp = num1 + num2;
            num1 = num2;
            num2 = tmp;
        }
        System.out.println();
    }

    public void pnine(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                System.out.println("Inner loop i: " + i + ", j " + j);
            }
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
        solution.pseven();
        solution.peight();
        solution.pnine();
    }
}
