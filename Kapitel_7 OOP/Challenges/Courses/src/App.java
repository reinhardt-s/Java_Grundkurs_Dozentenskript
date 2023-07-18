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
    public static void main(String[] args) throws Exception {
        testTrainees();
        testTrainer();
    }

    public static void testTrainees() {
        Trainee alice = new Trainee("Alice", 14, "Python");
        Trainee bob = new Trainee("Bob", 14, "Java");

        print(alice.whoAmI());
        print(bob.whoAmI());

        alice.addSkillPoints(3);
        bob.addSkillPoints(3);

        print(alice.whoAmI());
        print(bob.whoAmI());
    }

    public static void testTrainer() {
        Trainer charlie = new Trainer("Charlie", 14, "Java");
        Trainer dave = new Trainer("Dave", 14, "Python");

        print(charlie.whoAmI());
        print(dave.whoAmI());

        charlie.teach();
        dave.teach();

        print(charlie.whoAmI());
        print(dave.whoAmI());
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
