// Schreibe eine App die es Ron erlaubt, in seinem Zauberspruchbuch
// * Einen vorhandenen Eintrag anzuzeigen
// * Alle vorhandenen Zauberspruchnamen auszugeben
// * Einen neuen Zauberspruch einzutragen
// * Einen Zauberspruch zu entfernen
// * Nach dem das Programm die gweünschte Aufgabe erledigt hat, soll es erneut Fragen, welche Aktion ausgeführt werden
//   soll, bis die Nutzer*in sich entscheidet das Programm zu verlassen

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        SpellBook spellBook = new SpellBook();

        String action = "";

        while (!action.equals("v")) {
            System.out.println("Hi Ron! What do you want to do?");
            action = scanner.nextLine();

            switch (action) {
                case "a":
                    System.out.println("Which spell do you want to add?");
                    String spellName = scanner.nextLine();
                    System.out.println("What is the description of the spell?");
                    String spellDescription = scanner.nextLine();
                    spellBook.addSpell(spellName, spellDescription);
                    break;
                case "r":
                    System.out.println("Which spell do you want to remove?");
                    String spellToRemove = scanner.nextLine();
                    spellBook.removeSpell(spellToRemove);
                    break;
                case "s":
                    System.out.println("Which spell do you want to see?");
                    String spellToSee = scanner.nextLine();
                    System.out.println(spellBook.getSpell(spellToSee));
                    break;
                case "l":
                    String[] spellNames = spellBook.getSpellNames();
                    for (String spell : spellNames) {
                        System.out.println(spell);
                    }
                    break;
                case "v":
                    System.out.println("Bye!");
                    break;
            }
        }
        scanner.close();
    }
}
