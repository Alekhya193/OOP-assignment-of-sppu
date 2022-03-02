/*
Name - Usha sree alekhya siddi

Roll no - 1961

Div - A

Batch - C
*/


package com.company;

interface Vehicle{
    public void speed(int min_speed, int max_speed);
    public void gear();
    public void apply_break();

}

class Car implements Vehicle{
public void speed(int min_speed,int max_speed ){
    System.out.println("Speed range for car is "+min_speed+"--"+max_speed);
}
public void gear(){
    System.out.println("Their are 5 gears in car");
}
public void apply_break(){
    System.out.println("Their are 2 types of break in car drum break and disc break");
}
}


class Bike implements Vehicle{
    public void speed(int min_speed,int max_speed){
        System.out.println("Speed range for bike is" +min_speed+"--"+max_speed);
    }
    public void gear(){
        System.out.println("Depends on speed");
    }
    public void apply_break(){
        System.out.println("Types of break in bike are disc break,drum break,foot break,regenerative break and electronic break");
    }

}


class bicyclee implements Vehicle{
    public void speed(int min_speed,int max_speed){
        System.out.println("Speed range for bicycle is "+min_speed+"--"+max_speed);
    }
    public void gear(){
        System.out.println("Most geared bicycles have 7 to 12 gears");
    }
    public void apply_break(){
        System.out.println("Types of break in bicycle is rim break ,disc break, drum break");
    }

}

public class ass5 {
    public static void main(String[] args) {
        System.out.println("Information about car,Bike and Bicycle :-");
       System.out.println("==========================================================");
        Car C1=new Car();
        C1.speed(20,120);
        C1.gear();
        C1.apply_break();

       System.out.println("==========================================================");
        bicyclee b1=new bicyclee();
        b1.speed(5,50);
        b1.gear();
        b1.apply_break();

        System.out.println("==========================================================");
        Bike B1=new Bike();
        B1.speed(10,90);
        B1.gear();
        B1.apply_break();

        System.out.println("==========================================================");



    }
}


/* output:-

Information about car,Bike and Bicycle :-
==========================================================
Speed range for car is 20--120
Their are 5 gears in car
Their are 2 types of break in car drum break and disc break
==========================================================
Speed range for bicycle is 5--50
Most geared bicycles have 7 to 12 gears
Types of break in bicycle is rim break ,disc break, drum break
==========================================================
Speed range for bike is10--90
Depends on speed
Types of break in bike are disc break,drum break,foot break,regenerative break and electronic break
==========================================================


*/