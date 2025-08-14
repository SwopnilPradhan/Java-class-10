import java.util.Scanner;

public class LinearSearchDoubleArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare a double array of size 20
        double[] numbers = new double[20];

        // Prompt the user to enter 20 double elements
        System.out.println("Enter 20 double elements for the array:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Prompt the user to enter the element to search for
        System.out.print("\nEnter the double element to search for: ");
        double searchElement = input.nextDouble();

        // Perform linear search
        boolean found = false;
        int foundIndex = -1; // To store the index if found

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                found = true;
                foundIndex = i;
                break; // Exit the loop once the element is found
            }
        }

        // Display the search result
        if (found) {
            System.out.println("Search successful! " + searchElement + " found at index " + foundIndex + ".");
        } else {
            System.out.println("Search unsuccessful! " + searchElement + " not found in the array.");
        }

        input.close(); // Close the scanner
    }
}