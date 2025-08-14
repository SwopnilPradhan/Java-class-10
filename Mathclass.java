import java.util.*; //importing package
public class Mathclass
{
   public static void main(String[]args){
       Scanner sc = new Scanner(System.in); //importing scanner class to recieve user input and convert to primitive data types
       //1. Math.pow(x,y)
        //input
        System.out.println("Enter Base ");
        float z = sc.nextFloat();
        
        System.out.println("Enter Power");
        float y = sc.nextFloat();
        
        //output
        System.out.println(z + "^" + y + " or " + z + " to the power " + y +  " = " + Math.pow(z,y));
       //---------------------------------------------------------------------------------------------- 
       
         //2. Math.sqrt(x)
        //input
        System.out.println("Enter a number to find square root ");
        int b = sc.nextInt();
        //output
        System.out.println("√" + b + " or square root of " + b + " is " + Math.sqrt(b));
        //-----------------------------------------------------------------------------------------------
         //3. Math.cbrt(x)
        //inputd
        System.out.println("Enter a number to find cube root ");
        int a = sc.nextInt();
        //output
        System.out.println("∛" + a + " or cuberoot of " + a + " is " + Math.cbrt(a));
        //-------------------------------------------------------------------------------------------
         //4. Math.ceil(x) and 5. Math.floor(x), 6. Math.round(x)
        //input
        System.out.println("Enter a number to find round number (in decimal point) ");
        float v = sc.nextFloat();
        //output
        System.out.println(v + " which when rounded to nearest greater number we got " + Math.ceil(v) + " as a rounded number.");
        System.out.println(v + " which when rounded to nearest smaller number we got " + Math.floor(v) + " as a rounded number.");
        System.out.println(v + " which when rounded to nearest number we got " + Math.round(v) + " as a rounded number.");
        //------------------------------------------------------------------------------------------------
        //7. Math.abs(a)
        //input
        System.out.println("Enter a number to return absolute value of that number ");
        int nu = sc.nextInt();
        //output
        System.out.println("Absolute value of (" + nu + ") is " + Math.abs(nu));
        //------------------------------------------------------------------------------------------------
        //8. Math.max(a,b) & 9. Math.min(a,b)
        //input number
        System.out.println("Enter 1st no. ");
        float c = sc.nextFloat();
        
        System.out.println("Enter 2nd no. ");
        float d = sc.nextFloat();
        
        //output
        System.out.println("The greatest number of the two given no. is " + Math.max(c,d));
        System.out.println("The smallest of the two given no. is " + Math.min(c,d));
        //------------------------------------------------------------------------------------------------
        
         //10. Math.random()
        //input
        System.out.println("Enter a number between which we should generate random number");
        int x = sc.nextInt();
        //generating random number
        double ran = Math.random() * x;
        //output
        System.out.println("Random number between " + x + " is " + Math.round(ran));
        //--------------------------------------------------------------------------------------------   
    }
}





/* 
 *               Variable description
 * Variable         Datatype            Description
 * -----------------------------------------------------------------------------------------------------------------
 *1. z        -         float      -         to store the value of base
 *2. y        -         float      -         to store the value of power
 *3. b        -         int        -         to store the value of a squae number
 *4. a        -         int        -         to store the value of a cubical number
 *5. v        -         float      -         to store the value of a number to round it to nearest number
 *6. nu       -         int        -         to store the value of a number to find its absolute value
 *7. c        -         int        -         to store value of first number for comparision
 *8. d        -         int        -         to store value of second number for comparision
 *9. x        -         int        -         to store the value of number between which random number would be generated
 *10.ran      -         double     -         to store the value of the generated random number
 *---------------------------------------------------------------------------------------------------------------------
 */