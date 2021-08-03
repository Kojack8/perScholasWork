package com.company;

public class rectangle extends shape{
    private double area;

    public rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double findarea(){
        double area = width * height;
        return area;
    }

}
