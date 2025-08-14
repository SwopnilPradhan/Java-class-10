import java.util.*;
public class Vowel_word
{  void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String x=sc.nextLine();
        x=x+' ';
        String k="";
        String k1="";
        System.out.println("Original word \tNo. of vowels");
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            int c=0;
            
            if(ch==' '){
                for(int j=0;j<k1.length();j++){
                    k=k1.toLowerCase();
                    char n=k.charAt(j);
                    if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
                    c++;
                }
                System.out.print(k1);
                for(int t=k1.length();t<=14;t++)
                System.out.print(" ");
                System.out.println("\t"+c);
               
                k1="";
            }
            else{
               
                k1=k1+ch;
            }
        }
    }
}
