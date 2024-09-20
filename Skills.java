//abstract class "Skills" with the three attributes "name", "type", and "level"
public abstract class Skills {
    private String name;
    private String type;
    private int level;

    public Skills(String name, String type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
    }

//The costructor below initializes the 3 values
    public String getName() {
    return name;
    }

    public String getType() {
    return type;

    }

    public int getLevel() {
    return level;
    }

    //method to show each of the skill's details
    public abstract void identifySkill();
}
