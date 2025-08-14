/**This java file will act as a calculator
 * welcome to java program
 * @author (Swapnil)
 * @version (19.0.2)
 */
import java.util.*;
public class calculator
{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("Enter 2 numbers: ");
        a = in.nextInt();
        b = in.nextInt();
        int sum = a + b;
        int mul = a * b;
        System.out.println("sum of the number is = " +sum);
        System.out.println("product of the number is = " +mul);
    }
}
