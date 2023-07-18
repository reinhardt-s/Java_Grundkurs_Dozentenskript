public class Trainee {

    protected String name;
    protected int skillPoints;
    protected String course;

    public Trainee(String name, Integer skillPoints, String course) {
        this.name = name;
        if (skillPoints == null) {
            this.skillPoints = 14;
        }
        this.skillPoints = skillPoints;
        this.course = course;
    }

    public String whoAmI() {
        return "I am " + name + " and I am studying " + course + ". I have " + skillPoints + " skill points.";
    }

    public int addSkillPoints(int skillPoints) {
        this.skillPoints += skillPoints;
        return this.skillPoints;
    }

}