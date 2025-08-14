import java.util.*;
public class perfectsquare
{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in); //to input
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n >= 0){
            int sqr = (int)Math.sqrt(n);
            if((sqr*sqr) == n){
                System.out.println(n + " is a perfect square");
            }
            else{
                System.out.println(n + " is not a perfect square");
            }
        }
        else{
            System.out.println(n + " is not a perfect square");
        }
    }
}
