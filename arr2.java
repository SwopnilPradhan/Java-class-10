import java.util.*;
public class arr2
{
    public static void main(String gx[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int x1=sc.nextInt();
        int a[]=new int[x1];
        System.out.println("Enter the values of thr array in ascending order");
        for(int i=0;i<=(a.length-1);i++){
            a[i]=sc.nextInt();
        }
        System.out.print("a["+a.length+"]={");
        for(int i=0;i<=(a.length-1);i++){
        System.out.print(a[i]+",");
        }
        System.out.println("}");
        System.out.println("Enter number to be found");
        int x=sc.nextInt();
        int l=0,h=a.length-1,mid=0;int i=-1;
        while(l<=h){
            mid=(l+h)/2;
            if(x<a[mid]){
                h=mid-1;
            }
            else if(x>a[mid]){
                l=mid+1;
            }else{
                i=mid;
                break;
            }
        }
        if(i==-1)
        System.out.println("number not found!");
        else
        System.out.println("position of number is a[" +i+"]");
    }
}