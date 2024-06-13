/**
 * Adam Abukhdair, CEN-3024C, and 6-12-2024
 * Class Application
 * Contains the main method and handles the program execution flow. Demonstrates CRUD operations on characters.
 */
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();

        // Example characters
        Character char1 = new Character("Ichigo Kurosaki", "Bleach", "Main", "Soul Reaper", 100, "Episode 1", 15, "Male");
        Character char2 = new Character("Luffy", "One Piece", "Main", "Pirate", 90, "Episode 1", 17, "Male");




        // Add characters
        manager.addCharacter(char1);
        manager.addCharacter(char2);
       




        // Display characters
        System.out.println("Characters in the system:");
        manager.getAllCharacters().forEach(c -> System.out.println(c.getName() + " from " + c.getAnime()));

        // Update a character
        Character updatedChar = new Character("Naruto Uzumaki", "Naruto", "Main", "Ninja", 101, "Episode 1", 12, "Male");
        manager.updateCharacter(0, updatedChar);  // Ensure this matches your update logic

        // Delete a character by object
        manager.deleteCharacter(char2); // Ensure deleteCharacter(Character character) is implemented

        // Final list of characters
        System.out.println("Updated list of characters:");
        manager.getAllCharacters().forEach(c -> System.out.println(c.getName() + " from " + c.getAnime()));



    }
}


