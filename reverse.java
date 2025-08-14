import java.util.*;
public class reverse{
  public static void main(String args[]){
    String x = "Deepak";
    int length = x.length();
    String rev = "";
    for(int i = length-1;i>=0;i--){
      rev = rev + x.charAt(i);
    }
    System.out.println(rev);
  }
}
