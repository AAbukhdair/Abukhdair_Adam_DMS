/**
 * Adam Abukhdair, CEN-3024C, and 6-12-2024
 * Class CharacterManager
 * Manages a list of characters in the DMS. Provides methods to add, update, delete, and retrieve characters.
 */
import java.util.ArrayList;
import java.util.List;

public class CharacterManager {
    private List<Character> characters = new ArrayList<>();

    // Adds a character to the list
    public void addCharacter(Character character) {
        characters.add(character);
    }

    // Updates a character's details
    public void updateCharacter(int index, Character character) {
        characters.set(index, character);
    }

    // Deletes a character from the list
    public void deleteCharacter(Character character) {
        characters.remove(character);
    }

    // Returns the list of characters
    public List<Character> getAllCharacters() {
        return characters;
    }
}
