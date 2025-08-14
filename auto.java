
public class auto
{
    void x(){
        int x=25;
        int m=x*x;
        int c=0,s=0,n=0,z,l=x;
        int y=0;
        while(x!=0){
            x=x/10;
            c++;
        }
        while(c!=0){
            n=m%10;
            m=m/10;
            s=s*10+n;
            c--;
        }
        while(s!=0){
            z=s%10;
            s=s/10;
            y=y*10+z;
        }
        System.out.println(y);
    }
}
