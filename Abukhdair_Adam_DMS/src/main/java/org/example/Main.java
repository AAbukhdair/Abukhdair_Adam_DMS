/**
 * Adam Abukhdair, CEN-3024C, and 6-12-2024
 * Class Application
 * Contains the main method and handles the program execution flow. Demonstrates CRUD operations on characters.
 */
public class Main {
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();

        // Example characters
        Character char1 = new Character("Ichigo Kurosaki", "Bleach", "Main", 100);
        Character char2 = new Character("Luffy", "One Piece", "Main", 90);

        // Add characters
        manager.addCharacter(char1);
        manager.addCharacter(char2);

        // Display characters
        System.out.println("Characters in the system:");
        for (Character c : manager.getAllCharacters()) {
            System.out.println(c.getName() + " from " + c.getAnime());
        }

        // Update a character
        Character updatedChar = new Character("Naruto Uzumaki", "Naruto", "Main", 101);
        manager.updateCharacter(0, updatedChar);

        // Delete a character
        manager.deleteCharacter(char2);

        // Final list of characters
        System.out.println("Updated list of characters:");
        for (Character c : manager.getAllCharacters()) {
            System.out.println(c.getName() + " from " + c.getAnime());
        }
    }
}
