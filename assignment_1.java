/*
Name - Usha sree alekhya siddi

Roll no - 25062

Div - A

Batch - C
*/






package com.company;
class Complexe5{
    int a=2,b=3;
    int a1=1,b1=2;
    public void sum(){
        int sum1= (a+a1);
        int sum2= (b+b1);

        System.out.println("sum of complexe number is" +sum1 + "+" +sum2 +"i");
    }
    public void sub(){
        int sub1=(a-a1);
        int sub2 =(b-b1);
        System.out.println("substraction of complexe number is" +sub1 + "+" +sub2 +"i");
    }
    public void div(){
        float div1=(a/a1);
        float div2= (b/b1);
        System.out.println("division of complexe number is" +div1 + "+" +div2 +"i");
    }
    public void multi(){
        int multi1=(a*a1);
        int multi2=(b*b1);
        System.out.println("multiplication of complexe number is" +multi1 + "+" +multi2 +"i");
    }
}

public class Assignment1_OOP {
    public static void main(String[] args) {
        Complexe5 c1= new Complexe5();
        c1.sum();
        c1.sub();
        c1.div();
        c1.multi();


    }
}

/*
Output --
sum of complexe number is3+5i
substraction of complexe number is1+1i
division of complexe number is2.0+1.0i
multiplication of complexe number is2+6i
*/