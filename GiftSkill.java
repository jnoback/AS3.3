//concrete class Gift Skill which extends from the Skills abstract class
class GiftSkill extends Skills {
    public GiftSkill(String name, int level) {
        super(name, "GiftSkill", level);
    }

    //using override allows specific implementation for each of the 4 skills
    @Override
    public void identifySkill() {
        System.out.println(getType() + " of " + getName() + " has a level of " + getLevel());
    }
}