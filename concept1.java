import java.util.*;
public class concept1
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner (System.in); 
       System.out.println("enter range");
       int r = sc.nextInt();
       int s = 0;
       int i;
       for(i = 1; i <= r; i++){
           s= s*10+i;
           System.out.print(s + " ");
       }
       System.out.println();
    }
}
