import java.util.*;
public class aphabets
{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Small alphabets");
        for(int i = 97; i <= 122; i++){
            System.out.println((char)i);
        }   
        System.out.println("Capital alphabets");
        for(int i = 65; i <= 90; i++){
            System.out.println((char)i);
        }
    }
}
