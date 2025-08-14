

public class CI
{double A, CI;
    void Compound(int p,int r,int t){
        double x = 1 + r/100.0;
        A = p * Math.pow(x,t);
        CI = A - p;
        System.out.println("Amount = " + A);
        System.out.println("Compound Interest = " + CI);
    }
}
