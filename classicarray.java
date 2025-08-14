import java.util.*;
public class classicarray
{
   void x(){
       Scanner sc=new Scanner(System.in);
       int a[]=new int[15];
       double d[]=new double[15];
       String n[]=new String[15];
       for(int i=0;i<=14;i++){
           System.out.println("Enter name of consumer"+i);
           n[i]=sc.next();
           System.out.println("Enter ticket amount of consumer"+i);
           a[i]=sc.nextInt();
        }
        System.out.println("Sl no. \t name \t Amount \t discount \t net amt");
        int dx=0;
        double ax=0;
        for(int i=0;i<=14;i++){
            if(a[i]>70000)
            dx=18;
            else if(a[i]>55000 && a[i] <=70000)
            dx=16;
            else if(a[i]>35000 && a[i] <=55000)
            dx=12;
            else if(a[i]>25000 && a[i] <=35000)
            dx=10;
            else if(a[i]<25000)
            dx=2;
            ax=a[i]*dx/100.0;
            d[i]=a[i]-ax;
            System.out.println(i +"  \t    " +n[i]+"\t " +a[i]+"   \t "+ax+"\t  "+d[i]);
        }
    }
}