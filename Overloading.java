import java.util.*;
public class Overloading
{
    
    public static void main(){
        Overloading ob=new Overloading();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        String x= sc.next();
        switch(x){
            case "cb1":
                System.out.println("length of figure = ");
                int a=sc.nextInt();
                System.out.println("breadth of figure = ");
                int b=sc.nextInt();
                System.out.println("height of figure = ");
                int c=sc.nextInt();
                ob.vol(a,b,c);
                break;
            case "cb2":
                System.out.println("side of figure = ");
                int z=sc.nextInt();
                ob.vol(z);
                break;    
            case "cyl":
                System.out.println("radius of figure = ");
                int k=sc.nextInt();
                System.out.println("height of figure = ");
                int d=sc.nextInt();
                ob.vol(k,d);
                break;
            default:
                System.out.println("Wrong choice. Try next time!!");
        }
        
    }
    void vol(int l,int b,int h){
        int vol= l*b*h;
        System.out.println("Area of cuboid = "+vol);
    }
    void vol(int s){
        int vol= s*s*s;
        System.out.println("Area of cube = "+vol);
    }
    void vol(int r,int h){
        double vol=Math.PI*r*r*h;
        System.out.println("Area of cylinder = "+vol);
    }
}
