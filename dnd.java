import java.util.*;
public class dnd
{
   public static void main(String args[])
    {
         Scanner sc = new Scanner (System.in); 
       System.out.println("enter Word");
       String name = sc.nextLine();
       int wrdl = name.length();
       for(int i = wrdl; i>= 1;i--){
           for(int n=0; n < i;n++){
               System.out.print(name.charAt(n)+" ");
           }
           System.out.println();
       }
    }
}
