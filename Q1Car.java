import java.util.*;
public class Q1Car
{
    public static void main(String args[]){
        double bill;//to store bill 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter km you will travell");
        double km = sc.nextDouble();//input kilometer travelled
         if(km > 5 && km <= 10){
                bill = km * 10.0;
                System.out.println("your bill is " + bill);
            }
            else if(km > 10){
                bill = km * 20.0;
                System.out.println("your bill is " + bill);
            }
            else{
                bill = 150.0;
                System.out.println("your bill is " + bill);
            }
    }
}
