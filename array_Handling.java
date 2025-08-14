import java.util.*;
public class array_Handling
{
    public static void main(String arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array");
        int a[]=new int[10];
        for(int i=0;i<=9;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter number to bve found");
        int x=sc.nextInt();
        int l,m=0,n=9,k=-1;
        while(m<=n){
            l=(m+n)/2;
            if(a[l]<x)
            m=l+1;
            if(a[l]>x)
            n=l-1;
            if(a[l]==x){
            k=l;
            break;}
        }
        if(k>=0)
        System.out.println("Number found index = "+k);
        else
        System.out.println("not found");
    }
}
