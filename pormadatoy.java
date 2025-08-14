
import java.util.*;
public class pormadatoy
{
   void x(){
        Scanner sc=new Scanner(System.in);

        for(int i=1;i<=20;i++){
            int x=sc.nextInt();
            int s=0,c=0;
            for(int j=2;j<x;j++){
                if(x%j==0){
                    c++;
                }
            }
            if(c==0)
            System.out.println("P");
            else
            System.out.println("c");
        }
    }
}
