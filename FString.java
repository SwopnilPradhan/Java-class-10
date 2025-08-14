import java.util.*;
class FString{
    void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String x=sc.next();
        String n=x.toLowerCase();
        int l=n.length();int f=0;
        for(int i=0;i<l;i++){
            char ch=n.charAt(i);
                    
            if(Character.isLetter(ch)){
            if(ch!='a'&& ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
               f++;
        }
        }
        System.out.println("No of characters "+ (l));
        System.out.println("No of consonants "+f);
    }
}