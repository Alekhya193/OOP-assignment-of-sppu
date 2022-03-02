*
Name - Usha sree alekhya siddi

Roll no - 25062

Div - A

Batch - C
*/


package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ass_7_template {

    static int cont=0;
    public static void main(String[] args) {



        Scanner s=new Scanner(System.in);

        System.out.println("1.integer");
        System.out.println("2.String");
        System.out.println("select 1 or 2");
        int ch=s.nextInt();

        if (ch==1){
            number();
        }
        else{
            string_palen();
        }
    }

     static void string_palen() {
        String y;
        int ele,count;
         ArrayList<String> y1=new ArrayList<String>();
         Scanner s=new Scanner(System.in);
         System.out.println("enter the number of strings you want to store");
         ele=s.nextInt();

         System.out.println("enter the strings");
         for (int i=0;i<ele;i++){
             y=s.next();
             y1.add(y);
         }
          count=0;
         for (String z:y1){
             string_palen_cheak(z);
         }



    }

     static void string_palen_cheak(String x) {
        StringBuilder s1=new StringBuilder(x);
        if (x.equals(s1.reverse().toString())){
            System.out.println(x+"\t the string is palindrome");
           cont +=1;
        }
        else {
            System.out.println(x+"\t it is not a palindrome");
        }
    }

    static void number(){
        int n,element ,count;
        Scanner s= new Scanner(System.in);

        ArrayList<Integer> num=new ArrayList<Integer>();

        System.out.println("enter the number of elements");
        n=s.nextInt();

        System.out.println("Enter the elements");
        for (int i=0;i<n;i++){
            element=s.nextInt();
            num.add(element);
        }
        System.out.println("Elements are:-" +num);

        System.out.println("enter the operation that you want to perfrom on integer:-");
        System.out.println("1.odd or even");
        System.out.println("2.prime or not prime");
        int choice=s.nextInt();

        Iterator itr =num.iterator();
         cont =0;

        while(itr.hasNext()){
            cheak(choice, (Integer) itr.next());
        }
        if (choice==1){
            System.out.println("the count of Even number is "+ cont);
            System.out.println("the count of odd number is "+(num.size()-cont));
        }


    }
    
    static void cheak(int ch,int x)
    {
        switch (ch){
            case 1:
                even_odd(x);
                break;
            case 2:
                prime(x);
                break;
            default:
                System.out.println("enter the correct option");
        }
    }

    public static void prime(int x) {
        if (isPrime(x)){
            System.out.println(x+" it is a prime number");
        }
        else{
            System.out.println(x+" it is not a prime number");
        }
    }

    public  static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int p=2;p<n;p++){
            if (n % p==0){
                return false;
            }
        }
        return true;
    }


     static void even_odd(int x) {
        if (x%2==0){
            System.out.println("it is even");

             cont += 1;//+

        }
        else
        {
            System.out.println("it is odd");
        }
    }
}

/*
output:-
1.integer
2.String
select 1 or 2
1
enter the number of elements
6
Enter the elements
2 5 7 9 4 1
Elements are:-[2, 5, 7, 9, 4, 1]
enter the operation that you want to perfrom on integer:-
1.odd or even
2.prime or not prime
1
it is even
it is odd
it is odd
it is odd
it is even
it is odd
the count of Even number is 2
the count of odd number is 4
_________________________________________________________________________________________________

1.integer
2.String
select 1 or 2
1
enter the number of elements
6
Enter the elements
 3 4 6 7 8 9
Elements are:-[3, 4, 6, 7, 8, 9]
enter the operation that you want to perfrom on integer:-
1.odd or even
2.prime or not prime
2
3 it is a prime number
4 it is not a prime number
6 it is not a prime number
7 it is a prime number
8 it is not a prime number
9 it is not a prime number
________________________________________________________________________________________________

1.integer
2.String
select 1 or 2
2
enter the number of strings you want to store
4
enter the strings
usha
nitin
pop
alekhya
usha	 it is not a palindrome
nitin	 the string is palindrome
pop	 the string is palindrome
alekhya	 it is not a palindrome

*/
