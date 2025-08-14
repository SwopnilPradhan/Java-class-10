import java.util.*;
public class niven
{
      public static void main(String args[])
    {
         Scanner sc = new Scanner (System.in); 
       System.out.println("enter number");
       int x = sc.nextInt();
        System.out.println("Enter a number");
        int h = sc.nextInt();
        
        for(int i = x; i<=h;i++){
        int n = i;
        int sum =0; 
         while(n>0){
            int r = n % 10;
            sum = sum + r;
            n = n/10;
        }
        if(i%sum == 0){
            System.out.println(i);
        }
        }
    }
}
