/**
 * Adam Abukhdair, CEN-3024C, and 6-12-2024
 * Class Character
 * This class models an anime character with properties like name, anime, role, and power level. It serves as the basic data structure for the DMS project.
 */
public class Character {
    private String name;
    private String anime;
    private String role;
    private String roleDescription;
    private int powerLevel;
    private String firstAppearance;
    private int age;
    private String gender;

    // Constructor
    public Character(String name, String anime, String role, String roleDescription, int powerLevel, String firstAppearance, int age, String gender) {
        this.name = name;
        this.anime = anime;
        this.role = role;
        this.roleDescription = roleDescription;
        this.powerLevel = powerLevel;
        this.firstAppearance = firstAppearance;
        this.age = age;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAnime() {
        return anime;
    }

    public String getRole() {
        return role;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    // Setters (if necessary, not shown here)
}
