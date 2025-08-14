import java.util.*;
public class Result
{
 public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);    
        int m[]=new int[5];
        int p[]=new int[5];
        int c[]=new int[5];
        int C[]=new int[5];
        String n[]=new String[5];
        double d[]=new double[5];
        char g[]=new char[5];
        for(int i=0;i<4;i++){
            System.out.println("Enter name of student");
            n[i]=sc.next();
            System.out.println("Enter mark in math");
            m[i]=sc.nextInt();
            System.out.println("Enter mark in physics");
            p[i]=sc.nextInt();
            System.out.println("Enter mark in chemistry");
            c[i]=sc.nextInt();
            System.out.println("Enter mark in computer");
            C[i]=sc.nextInt();
            d[i]=(m[i]+c[i]+p[i]+C[i])/4.0;
            System.out.println("The percentage scored is "+d[i]);
            if(d[i]>80)
                g[i]='A';
            else if(d[i]>70 && d[i]<=80)
                g[i]='B';
            else if(d[i]>50 && d[i]<=70)
                g[i]='C';
            else
                g[i]='D';
        }
        for(int i=0;i<4;i++){
            System.out.println("Name:-"+n[i]+"\n Grade:-"+g[i]);
        }
    }
}
