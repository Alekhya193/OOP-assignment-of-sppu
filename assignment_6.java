*
Name - Usha sree alekhya siddi

Roll no - 25062

Div - A

Batch - C
*/





import java.util.*;
import java.util.InputMismatchException;
//import java.util.Arrays;
public class Main 
{
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
		
        
           int choice, cont;
          do
          {
              
              System.out.println("Exception Handaling");
              System.out.println(" 1: Array index out of bound\n 2: Devide by zero \n 3: Number Format");
              
              Scanner Scan=new Scanner(System.in);
              System.out.println("Enter your choice");
              choice=Scan.nextInt();
              
             
              
              
           
             switch(choice)
              {
                  case 1:
                      {
                          int[] a={1,2,3,4,5,6,7,8,9};
                          System.out.print("Elements in Array are:: ");
                          System.out.println(Arrays.toString(a));
                          Scanner s=new Scanner(System.in);
                          System.out.print("Enter tne index of your required number:: ");
                          
                          try 
                          {
                            
                            int Element=s.nextInt();
                            System.out.print("Element is :: "+a[Element]);
                              
                          } 
                          
                          catch(ArrayIndexOutOfBoundsException e)
                          {
                            System.out.println("Index which have enter is invalid for the given Array ");
                            System.out.println("Please Enter index from 0 to 8 only");
                          } 
                          break;
                          
                       }
                       case 2:
                           {
                               System.out.print("Enter your 1st number :: ");
                               int Num1=Scan.nextInt();
                               System.out.print("Enter your 2nd number :: ");
                               int Num2=Scan.nextInt();
                                try 
                                  {
                                   System.out.println("Division of your Number is  "+Num1/ Num2);
                                   
                                  } 
                                   catch(ArithmeticException e) 
                                   {
                                    System.out.println("divident can not be 0 \n Please enter the number except 0");   
                                      
                                   } break; 
                           }
                                   
                                   case 3:
                                      {
                                       try
                                        {
                                         String b="a";
                                            int a;
                                         Scanner scan=new Scanner(System.in);
        
                                         System.out.print("Enter the value");
                                         b=scan.nextLine();
                                         
                                         a=Integer.parseInt(b);
                                         System.out.print("value is "+  b);
                  
                                        }    
                
              
            
                                        catch(NumberFormatException e)
                                          {
                                            System.out.println("please enter valid Integer");
                                          } 
                                         break;
                                       }
                                       
                                      
                                       
                               
                              
                           
                       
                          
              }
           System.out.println("Please Enter 0 for exit & 1 to continue");
           Scanner c=new Scanner(System.in);
           cont=c.nextInt();
          }while(cont==1);
    }
}

/*output:
Exception Handaling
 1: Array index out of bound
 2: Devide by zero 
 3: Number Format
Enter your choice
1
Elements in Array are:: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Enter tne index of your required number:: 5
Element is :: 6Please Enter 0 for exit & 1 to continue
1
Exception Handaling
 1: Array index out of bound
 2: Devide by zero 
 3: Number Format
Enter your choice
2
Enter your 1st number :: 44
Enter your 2nd number :: 55
Division of your Number is  0
Please Enter 0 for exit & 1 to continue
1
Exception Handaling
 1: Array index out of bound
 2: Devide by zero 
 3: Number Format
Enter your choice
2
Enter your 1st number :: 27
Enter your 2nd number :: 0
divident can not be 0 
 Please enter the number except 0
Please Enter 0 for exit & 1 to continue
1
Exception Handaling
 1: Array index out of bound
 2: Devide by zero 
 3: Number Format
Enter your choice
3
Enter the value5
value is 5Please Enter 0 for exit & 1 to continue
1
Exception Handaling
 1: Array index out of bound
 2: Devide by zero 
 3: Number Format
Enter your choice
3
Enter the valued
please enter valid Integer
Please Enter 0 for exit & 1 to continue
0

*/

