import java.util.*;
public class neon
{
    void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s1=0,w,f;
         f=(int)Math.pow(n,2);
        
        while(f!=0){
            w=f%10;
            f=f/10;
            s1=s1+w;
        }
        if(n==s1)
        System.out.println("Neon");
        else
        System.out.println("Not neon");
    }
}
