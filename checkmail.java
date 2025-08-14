
import java.util.*;
public class checkmail
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your mail: ");
        String id = in.next();
        if  (id.contains("@")&&id.contains(".")&&id.contains("gmail")&&id.contains("com")){
            System.out.println("Email is valid");
        }
        else{
            System.out.println("Email is invalid");
        }
    }
}
