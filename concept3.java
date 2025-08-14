
 import java.util.*;
public class concept3
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner (System.in); 
       System.out.println("enter range");
       int r = sc.nextInt();
       int i;
       for(i = 1; i < 5; i++){
           int s =65;
           for(int j =1; j<=i; j++){
               System.out.print((char)s);
               s++;
           }
            System.out.println();
       }
      
    }

}
