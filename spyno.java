import java.util.*;
public class spyno
{
      public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in); 
       System.out.println("enter number");
       int x = sc.nextInt();
        System.out.println("Enter a number");
        int h = sc.nextInt();
        
        for(int i =x;i<=h;i++){
        int sum =0;
        int product = 1;
        int n = i;
        while(n>0){
            int r = n % 10;
            sum = sum + r;
            product = product * r;
            n = n/10;
        }
        if(product == sum){
            System.out.println(i);
        }
    }
    }
}
