/*
Name - Usha sree alekhya siddi

Roll no - 1961

Div - A

Batch - C
*/





package com.company;

import java.util.Scanner;

abstract class shape{
    private double height;
    private double base;
    Scanner s= new Scanner(System.in);

    public void setHeight(){
        System.out.println("Enter the value of height :");
        height=s.nextInt();
    }
    public double getHeight(){
        return height;
    }

    public void setBase(){
        System.out.println("Enter the value of Base :");
        base=s.nextInt();
    }
    public double getBase(){
        return base;
    }

    public abstract void compute_area();
}

class Triangle extends shape{

    @Override
    public void compute_area() {
        System.out.println("Area of triangle is :" +(getBase()*getHeight())/2);

    }
}

class Rectanglee extends shape{
    @Override
    public void compute_area(){
        System.out.println("Area of rectangle is :" +getBase()*getHeight());

    }
}

public class ass4 {
    public static void main(String[] args) {
        shape T1= new Triangle();
        T1.setHeight();
        T1.setBase();
        T1.compute_area();

        shape R1=new Rectanglee();
        R1.setHeight();
        R1.setBase();
        R1.compute_area();

    }
}


/*
output:
Enter the value of height :
3
Enter the value of Base :
4
Area of triangle is :6.0
Enter the value of height :
3
Enter the value of Base :
4
Area of rectangle is :12.0
*/
