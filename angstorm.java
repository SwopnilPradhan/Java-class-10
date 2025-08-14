
import java.util.*;
public class angstorm
{
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = 999;
        for(int i =100; i<=x; i++){
        int num = i;
        int n = i;
        int numofdigit =0;
        int sum = 0;
        int finalsum = 0;
        while(num > 0){
            num = num/10;
            numofdigit++;
        }
        while(n > 0){
            int digits = n %10;
            finalsum = finalsum + (int)Math.pow(digits,numofdigit);
            n = n/10;
        }
        if (finalsum == i){
        System.out.println(i);
    }
    }
}
}
