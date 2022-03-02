*
Name - Usha sree alekhya siddi

Roll no - 25062

Div - A

Batch - C
*/
package com.company;

import java.io.*;


public class ass_8 {


   static BufferedReader breader=new BufferedReader(new InputStreamReader(System.in));
   public void add_details() throws IOException {
       FileWriter writee=new FileWriter("file.txt");
       BufferedWriter bwrite=new BufferedWriter(writee);
       PrintWriter pwrite =new PrintWriter(bwrite);
       String name,address,div,mother_name,father_name;
       int age;
       String dob;
       long mob_no;
       boolean add_again;

       do {
           System.out.println("\nenter name of the student");
           name=breader.readLine();

           System.out.println("\nenter mother name of the student");
           mother_name=breader.readLine();

           System.out.println("\nenter father name of the student");
           father_name=breader.readLine();

           System.out.println("\nenter division of student");
           div=breader.readLine();

           System.out.println("\nenter address of student");
           address=breader.readLine();

           System.out.println("\nenter date of birth of student");
           dob=breader.readLine();

           System.out.println("\nenter age of the student");
           age=Integer.parseInt(breader.readLine());

           System.out.println("\nenter mobile no. of the student");
           mob_no=Long.parseLong(breader.readLine());



           pwrite.println(name);
           pwrite.println(mother_name);
           pwrite.println(father_name);
           pwrite.println(div);
           pwrite.println(address);
           pwrite.println(dob);
           pwrite.println(age);
           pwrite.println(mob_no);

           System.out.println("Details added");
           System.out.println("do you want to add more records(y/n)");
           String a=breader.readLine();
           if (a.equalsIgnoreCase("y")){
               add_again=true;

           }
           else{
               add_again=false;
           }


       }
       while (add_again);
       pwrite.close();
       show_details();
   }

   public void read_details() throws IOException{
       try {
           BufferedReader obj=new BufferedReader(new FileReader("file.txt"));
           String name;
           int i=1;

           while ((name=obj.readLine())!=null){
               System.out.println("Name : "+name);
               System.out.println("Father name : "+obj.readLine());
               System.out.println("Mother name : "+obj.readLine());
               System.out.println("Address : "+obj.readLine());
               System.out.println("Division : "+obj.readLine());
               System.out.println("Date of birth : "+obj.readLine());
               System.out.println("Age :"+Integer.parseInt(obj.readLine()));
               System.out.println("Telephone no: "+Long.parseLong(obj.readLine()));
           }
           obj.close();
           show_details();
       }
       catch (FileNotFoundException e) {
           System.out.println("File not found");
       }

   }

   public void clear_details() throws IOException {
       PrintWriter pwrite=new PrintWriter(new BufferedWriter(new FileWriter("file.txt")));
       pwrite.close();
       System.out.println("All details cleared");
       show_details();

   }

   public void show_details() throws IOException {
       System.out.println("1.Add details \n2.Read details \n3.clear details \n4.Exit");
       System.out.println("enter choice");

       int choice=Integer.parseInt(breader.readLine());

       switch (choice){
           case 1:
               add_details();
               break;

           case 2:
               read_details();
               break;

           case 3:
               clear_details();
               break;

           case 4:
               System.exit(1);
               break;
           default:
               System.out.println("Enter valid choice");
               break;
       }
   }



    public static void main(String[] args) throws IOException {
       ass_8 call=new ass_8();
       call.show_details();
//       obj.create();

    }
}



/*
output:-
1.Add details 
2.Read details 
3.clear details 
4.Exit
enter choice
1

enter name of the student
usha

enter mother name of the student
sunita

enter father name of the student
mahesh

enter division of student
A

enter address of student
solapur

enter date of birth of student
19/3/2002

enter age of the student
19

enter mobile no. of the student
8275225229
Details added
do you want to add more records(y/n)
y

enter name of the student
sai

enter mother name of the student
suni

enter father name of the student
mahesh

enter division of student
X

enter address of student
banglore

enter date of birth of student
27/12/1999

enter age of the student
21

enter mobile no. of the student
93894384848
Details added
do you want to add more records(y/n)
n
1.Add details 
2.Read details 
3.clear details 
4.Exit
enter choice
2
Name : usha
Father name : sunita
Mother name : mahesh
Address : A
Division : solapur
Date of birth : 19/3/2002
Age :19
Telephone no: 8275225229
Name : sai
Father name : suni
Mother name : mahesh
Address : X
Division : banglore
Date of birth : 27/12/1999
Age :21
Telephone no: 93894384848
1.Add details 
2.Read details 
3.clear details 
4.Exit
enter choice
4

file.txt:-
usha
sunita
mahesh
A
solapur
19/3/2002
19
8275225229
sai
suni
mahesh
X
banglore
27/12/1999
21
93894384848



*/