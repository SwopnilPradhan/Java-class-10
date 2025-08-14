import java.util.*;
public class SN_Care
{
    public static void main(String arr[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("What is shop name ");
        String shop = sc.nextLine();
        System.out.println("------------------------------" + shop +"------------------------------");
        System.out.println("What is your name ");
        String costumer = sc.nextLine();
        System.out.println("What is your order t-shirt(1), pants(2) or caps(3)");
        int x = sc.nextInt();
        if (x == 1 || x==2 || x==3){
            double d;
            System.out.println("enter price of your item");
            float y = sc.nextFloat();
            if(y>=500 && y<=1000){
                d= (y*20.0)/100.0;
                double price = Math.round(y - d*1.0);
                System.out.println("The price of your item(deducted) is " + price);
            }
            else if(y>1000 && y<=10000){
                d= (y*30.0)/100.0;
                double price = Math.round(y - d*1.0);
                System.out.println("The price of your item(deducted) is " + price);
            }
            else if(y>10000){
                d= (y*40.0)/100.0;
                double price = Math.round(y - d*1.0);
                System.out.println("The price of your item(deducted) is " + price);
            }
            else{
                d= 0.0;
                double price = y-d*1.0;
                System.out.println("The price of your item is " + price);
            }
        }
        else{
            System.out.println("Enter item available");
        }
    }
}
