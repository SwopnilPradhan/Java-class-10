import java.util.*;
public class insertnarr
{
    public static void main(String gx[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int x1=sc.nextInt();
        int a[]=new int[x1+1];
        
        for(int i=0;i<=(x1-1);i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter number to be inserted");
        int x=sc.nextInt();
        System.out.println("Enter pos");
        int p=sc.nextInt();
        for(int i=x1-1;i>=p;i--){
            a[i+1]=a[i];
        }
        a[p]=x;
        int t;
        int j;
        System.out.print("Un-sorted array:-\n {");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        System.out.println("}");
        for(int i=1;i<a.length;i++){
            t=a[i];
            for( j=i-1;j>=0 && t<a[j];j--){
                a[j+1]=a[j];
            }
            a[j+1]=t;
        }
        System.out.print("\n Sorted array:-\n {");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }System.out.println("}");
    }
}
