import java.util.*;
public class NumberComparator
{
   public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.");
        int num1 = sc.nextInt();
        System.out.println("Enter second no.");
        int num2 = sc.nextInt();
        NumberComparator compare = new NumberComparator();
        compare.findLargerSmaller(num1,num2);
    }
    public int findLargerSmaller(int num1,int num2){
        int larger = Math.max(num1,num2);
        int smaller = Math.min(num1,num2);
        System.out.println("The larger number is " + larger);
        System.out.println("The smaller number is " + smaller);
        return 0;
    }
}
/*
 *    vd
 * variable    type    purpose
 * num1         int    to store value of first number
 * num2         int    to store value of second number
 * larger       int    to store the larger no. 
 * smaller      int    to store the smaller no.
 */
