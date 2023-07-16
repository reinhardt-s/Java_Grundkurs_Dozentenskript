// Schreibe ein Programm, welches per Zufall "Kopf" oder "Zahl" ausgibt
// Benutze hierzu java.util.Random und generiere damit entweder einer 1 oder eine 0
// 1 = Kopf
// 0 = Zahl

import java.util.Random;

public class Coinflip {
    public static void main(String[] args) {
        Random rand = new Random();
        int result = rand.nextInt(2); // Erzeugt eine zufällige Zahl zwischen 0 und 1

        if (result == 1) {
            System.out.println("Kopf");
        } else {
            System.out.println("Zahl");
        }
    }
}
