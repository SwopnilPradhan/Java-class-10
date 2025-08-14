// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class fxm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String b=sc.nextLine();
        Scanner s=new Scanner(b);
        s.useDelimiter(" ");
        int m=0;
        while(s.hasNext()){
            if(s.hasNextInt()){
                m=s.nextInt();
                System.out.println(m);
            }
            else
            s.next();
        }
    }
}