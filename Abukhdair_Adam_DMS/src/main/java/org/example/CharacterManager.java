/**
 * Adam Abukhdair, CEN-3024C, and 6-19-2024
 * Class CharacterManager
 * Manages a list of characters in the DMS. Provides methods to add, update, delete, and retrieve characters.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CharacterManager {
    private List<Character> characters;

    public CharacterManager() {
        characters = new ArrayList<>();
    }

    // Adds a character to the list using parameters
    public void addCharacter(String id, String name, String anime, String role, int powerLevel, String firstAppearance, int age, String gender) {
        Character newCharacter = new Character(id, name, anime, role, powerLevel, firstAppearance, age, gender);
        characters.add(newCharacter);
    }

    // Adds a character object directly to the list
    public void addCharacter(Character character) {
        characters.add(character);
    }

    // Updates a character at a specified index
    public void updateCharacter(int index, Character character) {
        if (index >= 0 && index < characters.size()) {
            characters.set(index, character);
        }
    }

    // Deletes a character object from the list
    public void deleteCharacter(Character character) {
        characters.remove(character);
    }

    // Returns the list of all characters
    public List<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }

    // Method to search characters by name using a case-insensitive search
    public List<Character> searchByName(String name) {
        return characters.stream()
                .filter(c -> c.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    // Method to display all characters
    public void displayCharacters() {
        for (Character ch : characters) {
            System.out.println(ch.getName() + " from " + ch.getAnime() + " | Age: " + ch.getAge() + " | Gender: " + ch.getGender());
        }
    }
}

