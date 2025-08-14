
import java.util.*;
public class div
{
   public static void main(String args[]){
        Scanner sc = new Scanner (System.in); //to input
        System.out.println("Enter a number");
        int n = sc.nextInt();
            if(n%3 == 0 && n%5 == 0){
                   System.out.println(" The no. is divisible by 3 & 5.");                
            }
            else if( n % 5 == 0){
                System.out.println(" The no. is divisible by 5 but not 3.");  
            }
            else if( n % 3 == 0){
                System.out.println(" The no. is divisible by 3 but not 5.");  
            }
            else{
            System.out.println(" The no. is neither divisible by 3 nor 5.");  
            }
    }
}
