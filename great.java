import java.util.*;
public class great
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);//importing scanner class to recieve user input and convert to primitive data types
        System.out.println("Enter 1st no. ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no. ");
        int b =  sc.nextInt();
        if (a > b){
            System.out.println(a + " is greater");
        }
        if(b > a){
            System.out.println(b + " is greatest.");
        }
    }
}
/*
 *          Variable desc.
 *var         type       desc.
 *a           int        to store value of first number
 *b           int        to store value of second no.
 */
