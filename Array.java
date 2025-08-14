import java.util.*;
public class Array
{
    void main(){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter 10 elements one by one");
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array before sort:-");
        for(int i=0;i<10;i++){
            System.out.print(a[i]+",");
        }
        int t;
        for(int i=0;i<9;i++){
            for(int j=0;j<9-i;j++){
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("\nArray after sort:-");
        for(int i=0;i<10;i++){
            System.out.print(a[i]+",");
        }
    }
}
