/*
Name - Usha sree alekhya siddi

Roll no - 1961

Div - A

Batch - C
*/


package com.company;

import java.util.Scanner;

class Employee{
    String emp_add;
    int emp_id;
    String emp_name;
    long emp_phone;
    String emp_email;

    void getdata(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter name");
        emp_name=s.nextLine();
        System.out.println("enter id");
        emp_id=s.nextInt();
        System.out.println("enter phone number");
        emp_phone=s.nextLong();
        System.out.println();
        emp_add=s.nextLine();

        System.out.println("enter address");
        emp_add=s.nextLine();
        System.out.println("enter email");
        emp_email=s.nextLine();

    }
    void display(){
        System.out.println("address is"+ emp_add);
        System.out.println("ID is"+ emp_id);
        System.out.println("Name is"+ emp_name);
        System.out.println("Phone number is"+ emp_phone);
        System.out.println("Email is"+ emp_email);

    }


}
class Programmer extends Employee{
    Scanner s= new Scanner(System.in);
    double salary,bp,da,hra,pf,club,gross,net;

    void getsalary(){
        System.out.println("enter basic pay");
        bp =s.nextDouble();

    }
    void calculate(){
        da=0.97*bp;
        hra=0.10*bp;
        pf=0.12*bp;
        club=0.01*bp;

        gross=bp+da+hra;
        net=gross-pf-club;
    }
    void display_salary(){
        System.out.println("salary structure for programmer is: ");
        System.out.println("DA is "+ da);
        System.out.println("hra is "+ hra);
        System.out.println("pf is "+ pf);
        System.out.println("club fund is "+ club);
        System.out.println("Gross is "+ gross);
        System.out.println("Net salary is "+ net);


    }

}
class Teamlead extends Employee {
    Scanner s = new Scanner(System.in);
    double salary, bp, da, hra, pf, club, gross, net;

    void getsalary() {
        System.out.println("enter basic pay");
        bp = s.nextDouble();

    }

    void calculate() {
        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.01 * bp;

        gross = bp + da + hra;
        net = gross - pf - club;
    }

    void display_salary() {
        System.out.println("salary structure for programmer is: ");
        System.out.println("DA is " + da);
        System.out.println("hra is " + hra);
        System.out.println("pf is " + pf);
        System.out.println("club fund is " + club);
        System.out.println("Gross is " + gross);
        System.out.println("Net salary is " + net);

    }
}
class Assistantmanager extends Employee {
    Scanner s = new Scanner(System.in);
    double salary, bp, da, hra, pf, club, gross, net;

    void getsalary() {
        System.out.println("enter basic pay");
        bp = s.nextDouble();

    }

    void calculate() {
        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.01 * bp;

        gross = bp + da + hra;
        net = gross - pf - club;
    }

    void display_salary() {
        System.out.println("salary structure for programmer is: ");
        System.out.println("DA is " + da);
        System.out.println("hra is " + hra);
        System.out.println("pf is " + pf);
        System.out.println("club fund is " + club);
        System.out.println("Gross is " + gross);
        System.out.println("Net salary is " + net);

    }
}
class Projectmanager extends Employee {
    Scanner s= new Scanner(System.in);
    double salary,bp,da,hra,pf,club,gross,net;

    void getsalary(){
        System.out.println("enter basic pay");
        bp =s.nextDouble();

    }
    void calculate(){
        da=0.97*bp;
        hra=0.10*bp;
        pf=0.12*bp;
        club=0.01*bp;

        gross=bp+da+hra;
        net=gross-pf-club;
    }
    void display_salary(){
        System.out.println("salary structure for programmer is: ");
        System.out.println("DA is "+ da);
        System.out.println("hra is "+ hra);
        System.out.println("pf is "+ pf);
        System.out.println("club fund is "+ club);
        System.out.println("Gross is "+ gross);
        System.out.println("Net salary is "+ net);

}
}


public class oopASS3 {
    public static void main(String[] args) {
       // int choice;



        while (true){
            int choice;
            System.out.println("\n1.programmer\t \n2.Teamlead\t \n3.Assistant manager\t \n4.project manager\t ");
            System.out.println("enter the case number to get the details");
            Scanner s= new Scanner(System.in);
            choice= s.nextInt();
            switch (choice){
                case 1:{
                    Programmer p1=new Programmer();
                    p1.getdata();
                    p1.display();
                    p1.getsalary();
                    p1.calculate();
                    p1.display_salary();
                    break;

                }
                case 2:{
                    Teamlead T1=new Teamlead();
                    T1.getdata();
                    T1.display();
                    T1.getsalary();
                    T1.calculate();
                    T1.display_salary();
                    break;

                }
                case 3:{
                    Assistantmanager A1= new Assistantmanager();
                    A1.getdata();
                    A1.display();
                    A1.getsalary();
                    A1.calculate();
                    A1.display_salary();
                    break;
                }
                case 4:{
                    Projectmanager PM=new Projectmanager();
                    PM.getdata();
                    PM.display();
                    PM.getsalary();
                    PM.calculate();
                    PM.display_salary();
                    break;
                }
            }


        }
    }

}

/*
Output --
1.programmer	 
2.Teamlead	 
3.Assistant manager	 
4.project manager	 
enter the case number to get the details
1
enter name
usha
enter id
123
enter phone number
7458943568
enter address
pune
enter email
usha@gmail.com
address ispune
ID is123
Name isusha
Phone number is7458943568
Email isusha@gmail.com
enter basic pay
12345
salary structure for programmer is: 
DA is 11974.65
hra is 1234.5
pf is 1481.3999999999999
club fund is 123.45
Gross is 25554.15
Net salary is 23949.3


1.programmer	 
2.Teamlead	 
3.Assistant manager	 
4.project manager	 
enter the case number to get the details
2
enter name
alekhya
enter id
234
enter phone number
9865487655

enter address
solapur
enter email
alekhya@gmail.com
address issolapur
ID is234
Name isalekhya
Phone number is9865487655
Email isalekhya@gmail.com
enter basic pay
13456
salary structure for programmer is: 
DA is 13052.32
hra is 1345.6000000000001
pf is 1614.72
club fund is 134.56
Gross is 27853.92
Net salary is 26104.639999999996


1.programmer	 
2.Teamlead	 
3.Assistant manager	 
4.project manager	 
enter the case number to get the details
3
enter name
sai
enter id
345
enter phone number
9647645454
enter address
banglore
enter email
sai@gmail.com
address isbanglore
ID is345
Name issai
Phone number is9647645454
Email issai@gmail.com
enter basic pay
14567
salary structure for programmer is: 
DA is 14129.99
hra is 1456.7
pf is 1748.04
club fund is 145.67000000000002
Gross is 30153.69
Net salary is 28259.98


1.programmer	 
2.Teamlead	 
3.Assistant manager	 
4.project manager	 
enter the case number to get the details
4
enter name
rahul
enter id
456
enter phone number
975457456
enter address
mumbai
enter email
rahul@gmail.com
address ismumbai
ID is456
Name israhul
Phone number is975457456
Email israhul@gmail.com
enter basic pay
178988
salary structure for programmer is: 
DA is 173618.36
hra is 17898.8
pf is 21478.559999999998
club fund is 1789.88
Gross is 370505.16
Net salary is 347236.72

*/