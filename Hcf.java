
import java.util.*;
public class Hcf
{
    void x(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int x=a;
        int hcf=1;
        int p=a*b;
        int l=1;
        do{
            if(a>b)
            a=a-b;
            else
            b=b-a;
            hcf=a;
            l=p/hcf;
            
        }while(a!=b);
        System.out.println(l);
        System.out.println(hcf);
    }
}
