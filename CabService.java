import java.util.*;
public class CabService {
    String car_type;
    double km;
    double bill;

    CabService(){
        car_type = "";
        km = 0.0;
        bill = 0.0;
    }

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car type Hint For AC and for non AC is Ac and NAC");
        car_type = sc.next();
        System.out.println("Enter km you will travell");
        km = sc.nextDouble();
    }
    void calculate(){
        if(car_type.equals("AC")){
            if(km > 5){
                bill = km * 10.0;
            }
            else{
                bill = 150.0;
            }
        }
        else if(car_type.equals("NAC")){
            if(km > 5){
                bill = km * 8.0;
            }
            else{
                bill = 120.0;
            }
        }
        else{
            System.out.println("Enter correct name");
        }
    }
    void display(){
        System.out.println("Car type " + car_type);
        System.out.println("KILOMETER TRAVELLED " +km);
        System.out.println("TOTAL Bill = " +bill);
    }

    public static void main(){

        CabService cs = new CabService();
        cs.accept();
        cs.calculate();
        cs.display();
    }

}