import java.util.*;
public class String_Handling
{
    void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String s=sc.next();
        int d=0,a=0,s1=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            d++;
            else if(Character.isLetter(ch))
            a++;
            else
            s1++;
        }
        System.out.println("The number of digits are "+d);
         System.out.println("The number of letters are "+a);
          System.out.println("The number of special characters are "+s1);
    }
}
