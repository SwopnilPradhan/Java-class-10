import java.util.*;
public class Circle
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); //importing scanner class to recieve user input and convert to primitive data types
        //input radius of circle
        System.out.println("-----------------------------The Circle's Area and Perimeter calculator---------------------------------");
        System.out.println("Enter Radius of circle (in metres)");
        float r = sc.nextInt();
        //calculating area and perimeter
        double pi = 3.14;
        double area = (double)(pi * Math.pow(r,2));
        double perimeter = (double)(2 * pi * r);
        //Output of class
        System.out.println("The perimeter of the given information of circle is " + perimeter + "m");
        System.out.println("The area of the given information of circle is " + area + "m²");

    }
}



/*
 *-----------------------Variable Description-------------------------
 *--------------------------------------------------------------------
 *Variable     -         Datatypes   -          Description
 *r            -         float       -          to store value of radius 
 *pi           -         double      -          to store value of pi
 *area         -         double      -          to calculate area and store
 *perimeter    -         double      -          to calculate perimeter and store
 *--------------------------------------------------------------------
 */