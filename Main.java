public class Main {
    public static void main(String[] args) {
        Skills OOP =  new HardSkill("OOP", 7);
        Skills Communication = new SoftSkill("Communication", 5);
        Skills Creativity = new GiftSkill("Creativity", 9);
        Skills ProblemSolving = new TalentSkill("Problem-Solving", 7);

        OOP.identifySkill();
        Communication.identifySkill();
        Creativity.identifySkill();
        ProblemSolving.identifySkill();
    }
}