import java.util.*;
public class Box
{
    public int volume(int l,int b,int h){
        int x=l*b*h;
        return(x);
    }
    public int ta(int l,int b,int h){
        int fx=2*(l*b+b*h+l*h);
        return(fx);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length,breadth and height of box");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Box ob=new Box();
        int v=ob.volume(a,b,c);
        int t=ob.ta(a,b,c);
        System.out.println("The volume of box is "+v);
        System.out.println("The total surface area of box is "+t);
    }
}
