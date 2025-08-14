
import java.util.*;
public class JQ
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained by the student:-");
        int x = sc.nextInt();
        char grade = '0';
        if(x<=100 && x>=90){
            grade = 'A';
        }
        else if(x<90 && x>=80){
            grade = 'B';
        }
        else if(x<80 && x>=70){
            grade = 'C';
        }
        else if(x<70 && x>=60){
            grade = 'D';
        }
        else if(x<60 && x>=50){
            grade = 'E';
        }
        else if(x<50 && x>00){
            grade = 'F';
        }
        else{
            System.out.println("Enter correct mark");
        }
        switch(grade){
            case 'A':
                System.out.println("You got A grade");
                break;
            case 'B':
                System.out.println("You got B grade");
                break;
            case 'C':
                System.out.println("You got C grade");
                break;
            case 'D':
                System.out.println("You got D grade");
                break;
            case 'E':
                System.out.println("You got E grade");
                break;
            case 'F':
                System.out.println("Student needs to inprove his/her performance.");
                break;
        }
    }
}
