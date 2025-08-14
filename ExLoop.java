import java.util.*;
public class ExLoop
{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i = 2;
           do{
               int counter = 0;
               for(int j =1;j<=i;j++){
                   if(i%j == 0){
                       counter++;
                   }
               }
               if (counter == 2){
                   System.out.println(i);
               }
               i++;
        }
        while(i<=n);
    }
}
