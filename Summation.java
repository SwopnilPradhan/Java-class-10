
import java.util.*;
public class Summation
{
    public static void main(String arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array");
        int a[]=new int[10];
        for(int i=0;i<=9;i++){
            a[i]=sc.nextInt();
        }
        int s=0,s1=0;
        System.out.println("Single digit sum:");
        for(int i=0;i<=9;i++){
            if(a[i]>-10 && a[i]<10){
            s=s+a[i];
            System.out.print("("+a[i]+")+");
        }
        }
        System.out.println("0="+s+"\n Double digit sum:");
        for(int i=0;i<=9;i++){
          if(a[i]<100 && a[i]>=10){
            s1=s1+a[i];
            System.out.print("("+a[i]+")+");
        }
            else if(a[i]>-100 && a[i]<=-10){
            s1=s1+a[i];
            System.out.print("("+a[i]+")+");
        }
        }
        System.out.println("00="+s1);

    }
}