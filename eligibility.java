import java.util.*;
public class eligibility
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:- ");
        int x = sc.nextInt();
        System.out.println("Enter whether you havea valid voter id or not(Yes or No):- ");
        String y = sc.next();
        if(y.equals("Yes") ){
            if(x>=18){
                System.out.println("You are eligible to vote");
            }
        }
    }
}
/*
 *           Variable Description
 * Variable      type    purpose
 * x             int     to store age of candidate
 * y             String  to store voter id card or not
 */
