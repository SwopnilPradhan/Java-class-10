import java.util.*;
public class Loop_MenuDriven
{
    public void main(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Print the sum of following series");
       System.out.println("ENTER 1 FOR 1+(1+2)+(1+2+3)+......(1+2+3+4+5+.....n)");
       System.out.println("ENTER 2 FOR 1+11+111+.......111...n");
       System.out.println("ENTER 3 FOR (1*2)+(2*3)+....(24*25)");
       System.out.println("ENTER 4 FOR 1,1,2,3,5.....N");
       System.out.println("Enter your choice");
       int x=sc.nextInt();
       switch(x){
           case 1:
               System.out.println("Enter limit");
                int n=sc.nextInt();
                int s=0,s1=0;
                int j;
       
              for(int i=1;i<=n ;i++){
               s1=0;
               for( j=1;j<=i;j++){
               s1=s1+j;
               }
               s=s+s1;
               }
             System.out.println(s);
              break;
           case 2:
              System.out.println("Enter limit");
                int n1=sc.nextInt();
                int s2=0;
                int j1=0;
       
               for(int i=1;i<=n1 ;i++){
                  j1=1+j1*10;
                  s2=s2+j1;
                 }
            System.out.println(s2);
            break;
           case 3:
               int s3=0;
               int p=1;
       
              for(int i=1;i<=24 ;i++){
               p=i*(i+1);
               s3=s3+p;
               }
           System.out.println(s3);
           break;
           case 4:
               int s_=0;
               int a=0,b=1,c;
               System.out.print("0,1,");
               for(int i=1;i<=18;i++){
                   c=a+b;
                   a=b;
                   b=c;
                   
                   System.out.print(c+",");
               }
               break;
            default:
                System.out.println("You have entered a wrong option");
       }
   }
}
