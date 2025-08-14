import java.util.*;
public class Q2Car
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String Car_Type =  "";
        System.out.println("Enter car type:- (hint: for AC and non AC type AC & NAC)");
        Car_Type = sc.next();
        System.out.println("Enter km you will travelled");
        double km = sc.nextDouble();
        double bill;
         if(Car_Type.equals("AC")){
                if(km > 5 && km <= 10){
                    bill = km * 10.0;
                System.out.println("your bill is " + bill);
                }
                else if (km > 10){
                    bill = km * 20.0;
                System.out.println("your bill is " + bill);
                }
                else{
                 bill = 150.0;
                System.out.println("your bill is " + bill);   
                }
            }
            else if(Car_Type.equals("NAC") ){
                if(km > 5 && km <= 10){
                    bill = km * 8.0;
                System.out.println("your bill is " + bill);
                }
                else if (km > 10){
                    bill = km * 13.0;
                System.out.println("your bill is " + bill);
                }
                else{
                 bill = 120.0;
                System.out.println("your bill is " + bill);   
                }
            }
            else{
                System.out.println("Enter correct type");
            }
    }
}
