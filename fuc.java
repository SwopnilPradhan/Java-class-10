import java.util.*;
public class fuc
{
    public static void main(String gx[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]={5,7,9,11,15,20,30,45,89,97};
        
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
        if(i==(-1))
        System.out.println("number not found!");
        else
        System.out.println(a[i]+" and position of number is a[" +i+"]");
    }
}