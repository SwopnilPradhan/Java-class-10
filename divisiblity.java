
import java.util.*;
public class divisiblity
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check divisibilty");
        int a =  sc.nextInt();
        System.out.println("Enter divisible number");
        int b = sc.nextInt();
        if(a%b == 0){
            System.out.println(a + " is divisible by " + b);
        }
        else{
            System.out.print(a + " is not divisible by " + b);
        }
    }
}
