import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterManagerTests {


    @Test
    void testAddCharacter() {
        CharacterManager manager = new CharacterManager();
        // Adjust the Character constructor call to match the required parameters.
        Character char1 = new Character("Ichigo Kurosaki", "Bleach", "Main", "Soul Reaper", 100, "First Appearance Info", 15, "Male");
        manager.addCharacter(char1);
        assertFalse(manager.getAllCharacters().isEmpty());
        assertEquals(1, manager.getAllCharacters().size());
        assertEquals("Ichigo Kurosaki", manager.getAllCharacters().get(0).getName());
    }

    @Test
    void testUpdateCharacter() {
        CharacterManager manager = new CharacterManager();
        int x=100;
        int y=15;
        Character char1 = new Character("Ichigo Kurosaki", "Bleach", "Main", "Soul Reaper", x, "First Appearance Info", y, "Male");
        manager.addCharacter(char1);
        int nf=95;
        int st=16;
        Character updatedChar = new Character("Ichigo Kurosaki", "Bleach", "Support", "Human", nf, "Updated Appearance Info", st, "Male");
        manager.updateCharacter(0, updatedChar);
        assertEquals(95, manager.getAllCharacters().get(0).getPowerLevel());
        assertEquals("Support", manager.getAllCharacters().get(0).getRole());
    }

    @Test
    void testRemoveCharacter() {
        CharacterManager manager = new CharacterManager();
        Character char1 = new Character("Ichigo Kurosaki", "Bleach", "Main", "Soul Reaper", 100, "First Appearance Info", 15, "Male");
        manager.addCharacter(char1);

        // Deleting the character by index
        manager.deleteCharacter(char1);
        assertTrue(manager.getAllCharacters().isEmpty());
    }


}



