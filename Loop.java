import java.util.*;
public class Loop
{
    String x;int n,i,j,k;char ch;
    Scanner sc=new Scanner(System.in);
    void main(){
        System.out.println("Enter String");
        x=sc.next();
        n=x.length();
        for(i=(n);i>=0;i--){
            for(j=1;j<=k;j++){
                System.out.print(" ");
            }
            System.out.println(x.substring(0,i));
            k++;
        }
    }
}
