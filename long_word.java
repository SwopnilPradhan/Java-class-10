   
import java.util.*;
public class long_word
{  void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String x=sc.nextLine();
        x=' '+x+' ';
        String k="";
        String y="";
        String y1="";
        int max=0,min=100;
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch!=' '){
               k=k+ch;
            }
            else{
                 if(k.length()<min && k.length()>0){
                    min=k.length();
                    y1=k;
                }
                else if(k.length()>max){
                    max=k.length();
                    y=k;
                }
                k="";
            }
        }System.out.println("Longest word "+y);
        System.out.println("Shortest word "+y1);
    }
}

