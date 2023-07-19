// Trainer class extends Trainee class
public class Trainer extends Trainee{
    // Constructor for Trainer class
    public Trainer(String name, int age, String course) {
        // Call constructor of parent class Trainee
        super(name, age, course);
    }

    // Method to teach course
    public void teach() {
        // Add 3 skill points to trainee
        this.addSkillPoints(3);

        // Check if course is Java
        if (this.course.equals("Java")) {
            // Print message if course is Java
            System.out.println("Ich möchte das nicht.");
        } else {
            // Print welcome message for course
            System.out.println("Willkommen zum Kurs " + this.course + "!");
        }
    }
}
