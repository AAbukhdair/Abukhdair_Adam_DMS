import java.util.Scanner;
import java.util.List;

/**
 * Adam Abukhdair, CEN-3024C, and 6-19-2024
 * Class Main
 * Contains the main method and handles the program execution flow. Demonstrates CRUD operations on characters.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static CharacterManager characterManager = new CharacterManager();
    private static InputValidator validator = new InputValidator();  // Assuming InputValidator is implemented

    public static void main(String[] args) {
        initializeCharacters();
        menuSystem();
        scanner.close();
    }

    private static void initializeCharacters() {
        // Previously hardcoded characters are now dynamically added
        characterManager.addCharacter("1", "Ichigo Kurosaki", "Bleach", "Main", 100, "Episode 1", 15, "Male");
        characterManager.addCharacter("2", "Luffy", "One Piece", "Main", 90, "Episode 1", 17, "Male");
    }

    private static void menuSystem() {
        int choice;
        do {
            System.out.println("\n1. Display Characters\n2. Add New Character\n3. Update Character\n4. Delete Character\n5. Search Character by Name\n6. Exit");
            choice = validator.getValidInteger();

            switch (choice) {
                case 1:
                    displayCharacters();
                    break;
                case 2:
                    addNewCharacter();
                    break;
                case 3:
                    updateCharacter();
                    break;
                case 4:
                    deleteCharacter();
                    break;
                case 5:
                    searchCharacterByName();
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 6);
    }

    private static void displayCharacters() {
        System.out.println("Characters in the system:");
        characterManager.getAllCharacters().forEach(c -> System.out.println(c.getName() + " from " + c.getAnime() + ", Role: " + c.getRoleDescription() + ", Power: " + c.getPowerLevel()));
    }

    private static void addNewCharacter() {
        System.out.println("Enter the following details to add a new character:");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Anime: ");
        String anime = scanner.nextLine();
        System.out.print("Role: ");
        String role = scanner.nextLine();
        System.out.print("Power Level: ");
        int powerLevel = validator.getValidInteger();
        System.out.print("First Appearance: ");
        String firstAppearance = scanner.nextLine();
        System.out.print("Age: ");
        int age = validator.getValidInteger();
        System.out.print("Gender: ");
        String gender = scanner.nextLine();

        characterManager.addCharacter(id, name, anime, role, powerLevel, firstAppearance, age, gender);
        System.out.println("New character added successfully.");
    }

    private static void updateCharacter() {
        System.out.println("Enter the index of the character to update:");
        int index = validator.getValidInteger();
        if (index >= 0 && index < characterManager.getAllCharacters().size()) {
            Character character = characterManager.getAllCharacters().get(index);
            System.out.println("Updating character: " + character.getName());
            System.out.println("Enter new power level:");
            int powerLevel = validator.getValidInteger();
            character.setPowerLevel(powerLevel);
            System.out.println("Character updated: " + character.getName() + " with new power level " + character.getPowerLevel());
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    private static void deleteCharacter() {
        System.out.println("Enter the index of the character to delete:");
        int index = validator.getValidInteger();
        if (index >= 0 && index < characterManager.getAllCharacters().size()) {
            Character character = characterManager.getAllCharacters().get(index);
            characterManager.deleteCharacter(character);
            System.out.println("Character deleted: " + character.getName());
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    private static void searchCharacterByName() {
        System.out.println("Enter the name of the character to search:");
        String name = scanner.nextLine();
        List<Character> foundCharacters = characterManager.searchByName(name);
        if (foundCharacters.isEmpty()) {
            System.out.println("No characters found with the name: " + name);
        } else {
            System.out.println("Found characters:");
            foundCharacters.forEach(character -> System.out.println(character.getName() + " from " + character.getAnime()));
        }
    }
}
