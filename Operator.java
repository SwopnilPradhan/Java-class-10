import java.util.*;
public class Operator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter operator:-");
        
        char operator = sc.next().charAt(0);
         
        System.out.println("Enter number 1:-");
        int x = sc.nextInt();
        
        System.out.println("Enter number 2:-");
        int y = sc.nextInt();
        
        switch(operator){
            case '+':
                int sum = x + y;
                System.out.println("Ans:- " + sum);
                break;
            case '-':
                int diff = x - y;
                System.out.println("Ans:- " + diff);
                break;
            case '*':
                int product = x * y;
                System.out.println("Ans:- " + product);
                break;
            case '/':
                int div =  x/y;
                System.out.println("Ans:- " + div);
                break;
            case '%':
                int mod =  x%y;
                System.out.println("Ans:- " + mod);
                break;
            case '^':
                double power =  Math.pow(x,y);
                System.out.println("Ans:- " + power);
                break;
            default:
                System.out.println("Enter correct operator");
                break;
            }
        }
}
