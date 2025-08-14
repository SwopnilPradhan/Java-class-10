import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
public class ShopDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the shop: ");
        String shopName = scanner.nextLine();

        System.out.println("Choose an option:");
        System.out.println("1. Refrigerator");
        System.out.println("2. TV");
        System.out.println("3. AC");
        int choice = scanner.nextInt();
           String i = "";
        double discount = 0;
        double amount = 0;
        if(choice == 1 || choice ==2 || choice == 3){
             System.out.print("Enter the price: ");
                 double price = scanner.nextDouble();
            if(choice == 1){
                i="Refrigerator";
            }
            if(choice == 2){
                i="TV";
            }
            if(choice == 3){
                i="AC";
            }
        switch (choice) {
            case 1:
            
                if (price >= 20000 && price <= 40000) {
                    discount = price * 0.05;
                }
                else {
                    if(price>40000){
                     discount=0.0;
                    System.out.println("Wow");
                }
                else{
                    discount = 0.0;
                }
                }
                break;
            case 2:
                
                if (price >= 15000 && price <= 30000) {
                    discount = price * 0.03;
                }else {
                    if(price>30000){
                     discount=0.0;
                    System.out.println("Wow");
                }
                else{
                    discount = 0.0;
                }
                }
                break;
            case 3:
                

                if (price >= 30000 && price <= 50000) {
                    discount = price * 0.06;
                }else {
                    if(price>50000){
                     discount=0.0;
                    System.out.println("Wow");
                }
                else{
                    discount = 0.0;
                }
                }
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        amount = price-discount;
        System.out.println("Shop name = " + shopName);
        System.out.println("Amount = " + amount);
        System.out.println("Item = " + i);
    }
    else {
        System.out.println("Invalid");
    }
    }
}