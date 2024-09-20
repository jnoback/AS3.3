//Concrete class Talent Skill which extends from the Skills abstract class
class TalentSkill extends Skills {
    public TalentSkill(String name, int level) {
        super(name, "TalentSkill", level);
    }

    //using override allows specific implementation for each of the 4 skills
    @Override
    public void identifySkill() {
        System.out.println(getType() + " of " + getName() + " has a level of " + getLevel());
    }
}