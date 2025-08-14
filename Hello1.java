import java.util.*;
public class Hello1
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number");
        int y = sc.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Numbere 1 = " + x + "Number 2 = " + y);
    }
}
