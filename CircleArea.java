import java.util.*;
public class CircleArea
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = sc.nextDouble();
        CircleArea it = new CircleArea();
        double area = it.calculateArea(radius);
        System.out.println("The area of the circle is " + area + " metre sq.");
    }
    public double calculateArea(double radius){
        double pi = 3.14;
        double area = pi * Math.pow(radius, 2);
        return area;
    }
}
/*    vd
 * variable    type       purpose
 *radius        double    to store value of radius
 *area          double    to calculate area
 *pi            double    to store the value of pi 
 */
