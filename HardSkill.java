//Concrete class Hard Skill which extends from the Skills abstract class
class HardSkill extends Skills {
    public HardSkill(String name, int level) {
        super(name, "HardSkill", level);
    }

    //using override allows specific implementation for each of the 4 skills
    @Override
    public void identifySkill() {
        System.out.println(getType() + " of " + getName() + " has a level of " + getLevel());
    }
}