// TEIL I: Klassen
// Schreibe eine Klasse "Trainee", welche folgende Methoden hat:
// > Konstruktor
//    > Lege mit Hilfe von self die die Attribute course: String, name: String, skill_level: Integer an
// > whoAmI
//    > Gebe einen String aus, welcher name, course und skillLevel beinhaltet
// > addSkillPoints(quantity: int)
//    > Füge dem skillLevel quantity skill-Punkte hinzu
//    > Gebe mit einem print-Aufruf aus, dass das Objekt zerstört wurde.
//  Erstelle anschließend in App.java zwei Instanzen von Trainee Namens alice und bob mit den Werten:
//  alice: name="Alice", course="Python Aufbaukurs", skill_level=75
// bob: name="Bob", course="Data Science und Machine Learning mit Python"
// Rufe jeweils whoAmI auf
// Rufe jeweils addSkillPoints(12) auf
// Rufe erneut whoAmI auf
// 
// TEIL II: Vererbung
// Schreibe eine Klasse Trainer, die von Trainee erbt.
// Auch Trainer initialisiert die Parameter name, course und skillPoints.
// Reiche dies an den Konstruktor von Trainee weiter.
// Erstelle eine Methode in Trainer namens teach:
// > teach fügt zuerst dem Trainer 3 Skillpunkte hinzu.
//   >>> Falls der Trainer den Kurs in Java hält, wird mit print() "Ich möchte das nicht." ausgegeben.
//       Andernfalls wird "Willkommen zu 'Kursname'" ausgegeben
// Erstelle in App.java zwei Instanzen von Trainer namens charlie und dave mit den Werten:
// charlie: name="Charlie", course="Java", skill_level=75
// dave: name="Dave", course="Python", skill_level=75


public class App {
    public static void main(String[] args) {
        // create Trainee objects
        Trainee alice = new Trainee("Alice", 14, "Python");
        Trainee bob = new Trainee("Bob", 14, "Java");

        // print initial Trainee information
        System.out.println(alice.whoAmI());
        System.out.println(bob.whoAmI());

        // add skill points to Trainees
        alice.addSkillPoints(3);
        bob.addSkillPoints(3);

        // print updated Trainee information
        System.out.println(alice.whoAmI());
        System.out.println(bob.whoAmI());

        // create Trainer objects
        Trainer charlie = new Trainer("Charlie", 14, "Java");
        Trainer dave = new Trainer("Dave", 14, "Python");

        // print initial Trainer information
        System.out.println(charlie.whoAmI());
        System.out.println(dave.whoAmI());

        // have Trainers teach
        charlie.teach();
        dave.teach();

        // print updated Trainer information
        System.out.println(charlie.whoAmI());
        System.out.println(dave.whoAmI());
    }
}

