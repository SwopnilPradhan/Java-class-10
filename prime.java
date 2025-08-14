import java.util.*;
public class prime
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1; i < num;i++){
            if(num % i ==0){
                
                count ++;
            }
            
        }
        if(count == 1 ){
                System.out.println("Prime no.");
            }
            else{
                System.out.println(" not Prime no.");
            }
    }
}
