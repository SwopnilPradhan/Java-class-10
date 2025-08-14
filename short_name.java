import java.util.*;
public class short_name
{  void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String x=sc.nextLine();
        x=' '+x;
        String k="";
        String k1="";
        int m=x.lastIndexOf(' ');
        for(int i=0;i<m;i++){
            char ch=x.charAt(i);
            if(ch==' '){
                k=k+x.charAt(i+1)+". ";
                
            }
            
        }
        for(int i=m;i<x.length();i++){
            char ch=x.charAt(i);
            k=k+ch;
        }
        System.out.println(k);
    }
}
