/*
Name - Usha sree alekhya siddi

Roll no - 1961

Div - A

Batch - C
*/





package com.company;

import java.util.Scanner;

abstract class Publication{
    String title;
    double price;
    int copies;
    int sales;

    public void salecopy(int copies,double price,String title ,int sales){
        this.copies=copies;
        this.price=price;
        this.title=title;
        this.sales=sales;
    }
    Scanner s= new Scanner(System.in);
    public void getCopies(){
        System.out.println("Enter number of copies of the book");
        copies=s.nextInt();
    }
    public void getprice(){
        System.out.println("Enter price of the book :");
        price=s.nextDouble();
    }
    public void gettitle(){
        System.out.println("Enter Title of the book : ");
        title = s.nextLine();
    }
    public void totalsales(){
        System.out.println("Enter total sales :");
        sales=s.nextInt();
    }
    public void display(){
        System.out.println("Number of copies is : \t"+copies+"\nPrice is : \t"+price+"\nTitle is : \t"+title+"\nTotal sales is: \t"+sales);
    }



}
 class Book extends Publication {
    Scanner s= new Scanner(System.in);
     String author;

     Book(){
         System.out.println("the name of the author is " );
         author=s.nextLine();
     }
 }



 class Magazine extends Publication{
    int currentissue;
    int receiveissue;
     Scanner s= new Scanner(System.in);
     Magazine(){
         System.out.println("enter your current issue date");
         currentissue=s.nextInt();
         System.out.println("enter your receive issue date ");
        receiveissue=s.nextInt();

     }


 }



public class ass2_oop {
    public static void main(String[] args) {
        System.out.println("Enter information for book :-");
        System.out.println("");
       Publication P1=new Book();

       P1.gettitle();
       P1.getprice();
       P1.getCopies();
       P1.totalsales();
       P1.display();

        System.out.println("");
        System.out.println("");

        System.out.println("Enter information for Magazine :");
        Publication P2= new Magazine();

        P2.gettitle();
        P2.getprice();
        P2.getCopies();
        P2.totalsales();
        P2.display();


    }

}


/*
output:-

Enter information for book :-

the name of the author is 
J.K Rowling
Enter Title of the book : 
Harry potter
Enter price of the book :
1780
Enter number of copies of the book
7
Enter total sales :
12345
Number of copies is : 	7
Price is : 	1780.0
Title is : 	Harry potter
Total sales is: 	12345


Enter information for Magazine :
enter your current issue date
4
enter your receive issue date 
5
Enter Title of the book : 
Scarlet
Enter price of the book :
98
Enter number of copies of the book
12
Enter total sales :
123456
Number of copies is : 	12
Price is : 	98.0
Title is : 	Scarlet
Total sales is: 	123456


*/
