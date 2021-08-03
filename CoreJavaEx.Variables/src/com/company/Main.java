package com.company;

import java.text.DecimalFormat;

class Answer {
    public void pone(){
        // Write a program that declares 2 integer variables,
        // assigns an integer to each, and adds them together. Assign the sum to a variable. Print out the result.
        int x = 5;
        int y = 7;
        int z = x + y;
        System.out.println("Number one is: " + z);
    }

    public void ptwo(){
        // Write a program that declares 2 double variables, assigns a number to each,
        // and adds them together. Assign the sum to a variable. Print out the result.
        double x = 100;
        double y = 20000000;
        double z = x + y;
        System.out.println("Number two is: " + z);
    }

    public void pthree(){
        // Write a program that declares an integer variable and a double variable, assigns numbers to each,
        // and adds them together. Assign the sum to a variable. Print out the result.
        // What variable type must the sum be?
        int x = 5;
        double y = 200;
        double z = x + y;
        System.out.println("Number three is: " + z);
    }

    public void pfour(){
        //Write a program that declares 2 integer variables, assigns an integer to each,
        // and divides the larger number by the smaller number. Assign the result to a variable.
        // Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
        int x = 5;
        float y = 10.0f;
        float z = y/x;
        System.out.println("Number four is: " + z);
    }

    public void pfive(){
        //Write a program that declares 2 double variables, assigns a number to each,
        // and divides the larger by the smaller. Assign the result to a variable.
        // Print out the result. Now, cast the result to an integer. Print out the result again.
        double x = 1000;
        double y = 5000;
        double z = y/x;
        System.out.println("Number five is: " + z);
        int zz = (int) z;
        System.out.println("Number five recast as an int is: " + zz);
    }

    public void psix(){
        //Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
        // Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign to q.
        // Print q again.
        int x = 5;
        int y = 6;
        double q = y/x;
        System.out.println("Number six is: " + q);
        q = (double) y;
        System.out.println("Number six is: " + q);
    }

    public void pseven(){
        //Write a program that declares a named constant and uses it in a calculation. Print the result.
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        final float AVG = 93.70f;
        float diff = 100 - AVG;
        System.out.println("Number seven is " + df.format(diff));
    }

    public void peight(){
        //Write a program where you create 3 variables that represent products at a cafe.
        // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product. Create 2 more variables called subtotal and totalSale
        // and complete an “order” for 3 items of the first product, 4 items of the second product,
        // and 2 items of the third product. Add them all together to calculate the subtotal. Create
        // a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        // Be sure to format the results to 2 decimal places.
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        float coffee = 2.50f;
        float tea = 0.99f;
        float water = 1.5f;
        float subtotal;
        subtotal = (coffee * 3) + (tea * 4) + (water * 2);
        final float SalesTax = 0.08f;
        float totalSale = subtotal + (subtotal * SalesTax);
        System.out.println("The subtotal for number eight is $" + df.format(subtotal));
        System.out.println("The final sale price for number eight is $" + df.format(totalSale));

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
