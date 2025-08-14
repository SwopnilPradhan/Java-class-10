
public class Java
{
    void main(){
        int k=4;
        String s="JAVA";
        for(int i=0;i<4;i++){
            for(k=1;k<=4-i;k++){
                    System.out.print(" ");
                }
            for(int j=0;j<=i;j++){
                
                System.out.print(s.charAt(i)+" ");
            }System.out.println();
        }
    }
}
