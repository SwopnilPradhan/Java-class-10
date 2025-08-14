
import java.util.*;
public class cbrtloop
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in); //to input
        System.out.println("Enter a number");
        int n = sc.nextInt();
       for(int i=1; i<= Math.cbrt(n); i++)
      {
           System.out.println(i*i*i);
        
   }        
}
}
