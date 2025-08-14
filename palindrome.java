import java.util.*;
public class palindrome
{
    public static void main(String args[])
    {
        int n= 100000;
        for(int i =10; i<=n; i++){
        int x =i;
        int digits;
        int sum =0;
        while(x > 0){
            digits = x % 10;
            sum = sum * 10 + digits;
            x = x/10;
        }
        if( i == sum){
        System.out.println(i);
    }
    }
    }
}
