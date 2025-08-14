import java.util.*;
public class Income_Tax
{
    public static void main(String args[]){
        String n;double s=0,m,tax,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of teachers");
        int x=sc.nextInt();
        sc.nextLine(); 
        for(int i=1;i<=x;i++){
            System.out.println("Enter Name");
            n=sc.nextLine();
            System.out.println("Enter salary per month");
            m=sc.nextDouble();
            sc.nextLine();
            if(m>=30000 && m<=50000){
                tax=m*3/100.0;
            }
            else if(m>50000){
                tax=m*5/100.0;
            }
            else{
                tax=0.0;
            }
            s=(s+tax);
            a=(int)(m-tax);
            System.out.println("Name- \t"+n);
            System.out.println("Total amount after tax deduction ~"+a+ "\n");
        }
        System.out.println("\n Total amount recieved by the governments ="+s);
}
}