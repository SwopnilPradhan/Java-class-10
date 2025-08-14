
public class special_no
{
    void main()
    {
       int s=0,p=1,j,k=0;
       for(int i=10;i<100;i++){
           s=0;p=1;k=i;
           while(k>0){
               j=k%10;
               k=k/10;
               s=s+j;
               p=p*j;
           }
           if(s+p==i )
           System.out.println(i);
       }
    }
}
