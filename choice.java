import java.util.*;
public class choice
{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);//importing scanner class to recieve user input and convert to primitive data types
       //Giving a menu to user to perform following task
       System.out.println("---------Enter your Choice----------");
       System.out.println("1-Area of square");
       System.out.println("2-Perimeter of square");
       System.out.println("3-Area of rectangle");
       System.out.println("4-Perimeter of rectangle");
       System.out.println("5-Exit");
       //storing choice 
       int a = sc.nextInt();
       if(a==1){
           System.out.println("Enter Side of square");
           float s1 = sc.nextFloat();//inputting
           float Area1 = s1*s1;//area calculation
           System.out.println("The area of given dimension of square is " + Area1 + "m²");//output of case 1
       }
       else if(a==2){
           System.out.println("Enter Side of square");
           float s2 = sc.nextFloat();//inputting
           float peri1 = s2*4;//perimeter cal.
           System.out.println("The perimeter of given dimension of square is " + peri1 + "m");//output of case 2
       }
       else if(a==3){
           System.out.println("Enter length of rectangle");
           float l1 = sc.nextFloat();//inputting
           System.out.println("Enter breadth of rectangle");
           float b1 = sc.nextFloat();//inputting
           float Area2 = l1 * b1;//area cal.
           System.out.println("The area of given dimension of rectangle is " + Area2 + "m²");//output of case 3
       }
       else if(a==4){
           System.out.println("Enter length of rectangle");
           float l2 = sc.nextFloat();//inputting
           System.out.println("Enter breadth of rectangle");
           float b2 = sc.nextFloat();//inputting
           float peri2 = 2 * (l2 + b2);//perimeter calculation
           System.out.println("The perimeter of given dimension of rectangle is " + peri2 + "m");//output of case 4
       }
       else if(a==5){
           System.exit(0);//exit system output
       }
       else{
           System.out.println("Enter valid choice");//choice is not vallid
       }
   }
}

/*
 *                   Variable description
 *Variable         Type               Description
 *a                 int               to store choice
 *s1                float             to store value of side
 *s2                float             to store value of side
 *area1             float             to store value of area
 *peri1             float             to store value of perimeter
 *l1                float             to store value of length
 *b1                float             to store value of breadth
 *area2             float             to store value of area
 *l2                float             to store value of length
 *b2                float             to store value of breadth
 *peri2             float             to store value of perimeter
 */