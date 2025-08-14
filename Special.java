import java.util.*;

public class Special

{

public static void main(String args[])

{

Scanner in=new Scanner(System.in);

int a,p,uplc=0,d=0,spl=0;

String st;

char chr;

System.out.println("Enter a string:");

st=in.nextLine();
p=st.length();

for(a=0;a<p;a++)
{
chr=st.charAt(a);

if((chr>='a' && chr<='z') || (chr>='A' && chr<='Z'))

uplc=uplc+1;

else if(chr>='0' && chr<='9')

d=d+1;

else

spl=spl+1;
}
System.out.println("Number of digits present in the string:"+d);

System.out.println("Number of uppercase and lowercase letters:"+uplc);

System.out.println("Number of special characters:"+spl);
}
}
