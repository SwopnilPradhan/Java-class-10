import java.lang.*;
import java.util.*;
import java.io.*;
import java.math.*;
public class ProjectCommission
{
    void x(){
        System.out.println("-----------------------------------------Mehra and Son----------------------------------------");
    }
    void display(){
        String name = "";
        float s;
        double co =0.0 ;
        
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=100;i++){
            System.out.println(" --------------------------------------- Person " + i + " ---------------------------------------");
            System.out.println("Enter name of CellsMan ");
            name = sc.next();
            System.out.println("Enter sales made ");
            s=sc.nextFloat();
            if(s<=10000&&s>0){
                co = 0.1 * s;
            }
            else if(s>10000 && s<=20000){
                co = 0.15 * s;
            }else if(s>20000 && s<=50000){
                co = 0.3 * s;
            }
            else if(s>50000){
                co = 0.4 * s;
            }
            else{
                System.out.println("Not entered");
            }
            System.out.println("The commision for person " +i + " is $" +co);
        }
    }
    public static void main(String arr[]){
        ProjectCommission P1= new ProjectCommission();
        P1.x();
        P1.display();
        
    }
}
