import java.util.*;
public class Search
{
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter n elements one by one");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println("Enter a no. to be searched");
        int x=sc.nextInt();
        int k=-1;
        for(int i=0;i<n;i++){
            if(a[i]==x)
            k=i;
        }
        if(k==-1)
        System.out.println("Element not found");
        else
        System.out.println("Found at array index ["+k+"]");
    }
}
