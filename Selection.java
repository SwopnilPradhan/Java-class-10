import java.util.*;
public class Selection
{
   public static void main(String gx[])
    {
        int a[]={1,2,5,3,0,4};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j+1]<a[j]){
                    int x=a[j+1];
                    a[j+1]=a[j];
                    a[j]=x;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }
    }
}
