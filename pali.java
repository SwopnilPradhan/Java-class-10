import java.util.*;
public class pali
{
    void x(){
        Scanner sc=new Scanner(System.in);

        for(int i=1;i<=20;i++){
            int y,s=0,l;
            int x=sc.nextInt();
            l=x;
            while(x!=0){
                y=x%10;
                s=s*10+y;
                x=x/10;
            }
            
            if(l==s){
                System.out.println("P");
            }
            else{
                System.out.println("NP");
            }
        }
    }
}
