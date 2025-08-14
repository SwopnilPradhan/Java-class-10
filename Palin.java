import java.util.Scanner;
public class Palin{
  public static void main(String args[]){
    int rev= 0,n,z;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num");
    n = sc.nextInt();
    z=n;
    while(n>0){
      rev = (rev*10)+ n%10;
      n=n/10;
    }
    if(rev==z)
      System.out.println("Palindrome");
    else
      System.out.println("not a Palindrome");
  }
}
