import java.util.*;
public class perfectloop
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in); //to input
        System.out.println("Enter a number");
        int n = sc.nextInt();
       for(int i=1; i<=n; i++)
      {
          int sum = 0;
         for(int j=1; j<=(i/2); j++)
         {
            if(i%j == 0)
            {
               sum=j + sum;
            }
         }
         if(sum == i)
            System.out.println(i);
      }
   }        


}
