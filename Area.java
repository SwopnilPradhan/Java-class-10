

public class Area
{
    double S, A;
    void mx(int a,int b,int c){
        S=(a+b+c)/2;
        A=Math.sqrt((S-a)*(S-b)*(S-c)*S);
        System.out.println(A);
    }
}
