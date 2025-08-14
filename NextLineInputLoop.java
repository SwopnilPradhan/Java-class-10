import java.util.Scanner;

public class NextLineInputLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine;

        System.out.println("Enter lines of text (enter an empty line to stop):");

        while (true) {
            inputLine = scanner.nextLine();

            if (inputLine.isEmpty()) {
                break; // Exit the loop if an empty line is entered
            }
            System.out.println("You entered: " + inputLine);
        }
        System.out.println("Loop finished.");
        scanner.close();
    }
}