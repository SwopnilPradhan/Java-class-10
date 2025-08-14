
import java.util.*;
public class Reverse_Sentenc3e
{  void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String x=sc.nextLine();
        x=' '+x;
        String k="";
        String k1="";
        System.out.println("Original \t Reversed word");
        for(int i=x.length()-1;i>=0;i--){
            char ch=x.charAt(i);
            if(ch==' '){
                System.out.print(k1);
                for(int j=k1.length();j<=9;j++){
                    System.out.print(" ");
                }
                System.out.println(" \t"+k);
                k="";
                k1="";
            }
            else{
                k=k+ch;
                k1=ch+k1;
            }
        }
    }
}
