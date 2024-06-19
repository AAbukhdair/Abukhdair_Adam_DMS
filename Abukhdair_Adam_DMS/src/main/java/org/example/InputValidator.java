
import java.util.Scanner;

    public class InputValidator {
        public int getValidInteger() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter an integer:");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer:");
                scanner.next(); // consume the invalid input
            }
            return scanner.nextInt();
        }
    }


