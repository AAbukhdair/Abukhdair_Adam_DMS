

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler {
    public void readFile(String filename) {
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the filename and try again.");
        }
    }
}
