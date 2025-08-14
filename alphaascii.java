
import java.util.*;
public class alphaascii
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter start number range :- ");
        int a = sc.nextInt();
        
        System.out.println("Enter end number range :- ");
        int b = sc.nextInt();
        
        for(int i = a; i <= b; i++){
            System.out.println(i);
        }
    }
}
