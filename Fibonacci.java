public class Fibonacci
{
    public static void main(String arrr[]){
        int a[]=new int[10];
        int x=0,y=1,z;
        for(int i=2;i<a.length;i++){
            z=x+y;
            x=y;
            y=z;
            a[i]=z;
        }
        a[0]=0;
        a[1]=1;
        for(int i=0;i<=9;i++){
            System.out.print(a[i]+",");
        }
    }
}
