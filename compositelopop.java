import java .util.*;
public class compositelopop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in); //to input
        System.out.println("Enter a number");
        int n = sc.nextInt();
       for(int i=2; i<=n; i++)
      {
         int chk = 0;
         for(int j=2; j<i; j++)
         {
            if(i%j == 0)
            {
               chk++;
               break;
            }
         }
         if(chk == 1)
            System.out.println(i);
      }
   }        
}
