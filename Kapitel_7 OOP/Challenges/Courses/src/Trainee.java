// Define the Trainee class
public class Trainee {

    // Define the instance variables
    protected String name; // The name of the trainee
    protected int skillPoints; // The number of skill points the trainee has
    protected String course; // The course the trainee is studying

    // Define the constructor
    public Trainee(String name, Integer skillPoints, String course) {
        this.name = name; // Set the name of the trainee
        if (skillPoints == null) { // If no skill points are provided
            this.skillPoints = 14; // Set the default skill points to 14
        }
        this.skillPoints = skillPoints; // Set the skill points of the trainee
        this.course = course; // Set the course the trainee is studying
    }

    // Define the whoAmI method
    public String whoAmI() {
        return "I am " + name + " and I am studying " + course + ". I have " + skillPoints + " skill points.";
    }

    // Define the addSkillPoints method
    public int addSkillPoints(int skillPoints) {
        this.skillPoints += skillPoints; // Add the provided skill points to the trainee's skill points
        return this.skillPoints; // Return the updated skill points
    }

}