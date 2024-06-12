/**
 * Adam Abukhdair, CEN-3024C, and 6-12-2024
 * Class Character
 * This class models an anime character with properties like name, anime, role, and power level. It serves as the basic data structure for the DMS project.
 */
public class Character {
    private String name;
    private String anime;
    private String role;
    private int powerLevel;

    // Constructor
    public Character(String name, String anime, String role, int powerLevel) {
        this.name = name;
        this.anime = anime;
        this.role = role;
        this.powerLevel = powerLevel;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnime() {
        return anime;
    }

    public void setAnime(String anime) {
        this.anime = anime;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }
}
