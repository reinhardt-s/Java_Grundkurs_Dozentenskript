// Pay Roulette
// Schreibe ein Programm welches zufällig aus der Liste an Gästen einen auswählt,
// der die Rechnung zahlt. Gehe dazu wie folgt vor:
// Nimm eine Eingabe von Namen, mit Leerzeichen getrennt ("Hans Magerete") via Scanner an
// Teile dann die den String in eine Liste auf
// Wähle dann, mithilfe von random eine Person aus, welche die Rechnung zahlt.
// Gebe dann das Ergebnis aus
// Dein Code nach dieser Zeile

import java.util.Scanner;
import java.util.Random;

public class PayRoulette {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Namen eingeben:");
        String names = scanner.nextLine();
        String[] namesArray = names.split(" ");
        int playerCount = namesArray.length;
        int randomPlayer = random.nextInt(playerCount);
        System.out.println(namesArray[randomPlayer] + " zahlt die Rechnung.");

        scanner.close();
    }
}
