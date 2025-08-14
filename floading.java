import java.util.*;

class floading
{
void main()

{ Scanner sc= new Scanner (System.in);

System.out.println ("Enter a no. "); 

int x= sc.nextInt();

floading ob=new floading ();

ob.Print();

ob.Print(x);

}

void Print(){

for(int i=1; i<= 5; i++)
{
for (int j=1;j<= 4; j++)

System.out.print(i);

System.out.println();
}
}
void Print (int n)
{
int f,s=0,s1=0;

while (n>0)
{ f=n%10;

n/= 10;
if (f%2==0)
s=s+f;
else
s1=s1+f;

}
if (s==s1)

System.out.println("Lead no.");
else
System.out.println("Not a lead no.");
}
}
