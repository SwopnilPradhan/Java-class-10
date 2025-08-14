import java.io.*;
public class ReverseS
{
   void main(){
       StringBuffer m=new StringBuffer("COMPUTER");
       int n=m.length(),i;
       System.out.println(m);
       for(i=0;i<(n-2);i++){
           System.out.println(m.charAt(i+1)+"      "+m.charAt(n-i-2));
       }System.out.println(m.reverse());
       
   }
}
