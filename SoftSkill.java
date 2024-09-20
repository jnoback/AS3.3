//Soft skill concrete class which extends from the Skills abstract class
class SoftSkill extends Skills {
    public SoftSkill(String name, int level) {
        super(name, "SoftSkill", level);
    }

    //using override allows specific implementation for each of the 4 skills
    @Override
    public void identifySkill() {
        System.out.println(getType() + " of " + getName() + " has a level of " + getLevel());
    }
}
