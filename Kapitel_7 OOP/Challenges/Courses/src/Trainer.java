public class Trainer extends Trainee{
    public Trainer(String name, int age, String course) {
        super(name, age, course);
    }

    public void teach() {
        this.addSkillPoints(3);

        if (this.course.equals("Java")) {
            System.out.println("Ich möchte das nicht.");
        } else {
            System.out.println("Willkommen zum Kurs " + this.course + "!");
        }
    }
}
