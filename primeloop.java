import java.util.*;
public class primeloop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in); //to input
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = 0;
       for(int i=2; i<=n; i++){
         boolean isPrime = true;
         for(int j=2; j<i; j++){
            if(i%j == 0)
            {
               isPrime = false;
               break;
            }
         }
         if(isPrime){
             count++;
            System.out.println(i);
        }
      }
      System.out.println("there are " + count + " between 1 to " + n);
   }        
}


                
        
    
