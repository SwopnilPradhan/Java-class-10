import java.util.*;
public class bill
{
    public static void main(String arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total cost");
        int x= sc.nextInt();
        String i = "";
        double amt;
        if(x<=2000 && x>0){
            amt = x - x * 0.05;
            i = "Calculator";
        }
        else if(x<=5000 && x >2000){
            amt = x - x * 0.1;
            i = "School Bag";
        }else if(x<=10000 && x>5000){
            amt = x - x * 0.15;
            i = "Wall Clock";
        }else if(x>10000){
            amt = x - x * 0.2;
            i = "Wrist Watch";
        }else{
            amt=0;
            i = "null";
        }
        System.out.println("Amount to be paid $"+ amt);
        System.out.println("Gift is " + i);
    }
}
