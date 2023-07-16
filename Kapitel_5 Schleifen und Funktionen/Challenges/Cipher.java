// Schreibe eine App, welche folgende Aufgaben erfüllt:
// Task-1: Erstelle eine Funktion ask_for_data, welche folgende Informationen erfragt:
//           * Frage die Nutzer*in, ob diese (V)erschküsseln oder (E)ntschlüsseln möchte
//           * Frage die Nutzer*in, wie viele Zeichen verschoben wird, bzw. wurde.
//           * Frage die Nutzer*in, wie die Nachricht lautet
//           * Rufe die Funktion crypt mit den Argumenten auf.
// Task-2: Schreibe eine Funktion crypt welche:
//           * die oben genannten Argumente annimmt
//           * je nachdem ob es sich um eine Ver- oder Ent-schlüsselung handelt,
//             die Nachricht in die eine oder andere Richtung verschiebt
// Task-3: Rufe ask_for_data auf.
// Task-4: Nachdem Die (Ent-)Schlüsselung beendet wurde, fragt das Programm,
//         ob ein weiterer Durchlauf gestartet werden soll
// Hinweise:
// * Mit der Methode split("") kannst du einen String in einzelne Zeichen aufteilen (z.B. "Hallo".split("") -> ["H", "a", "l", "l", "o"], message.split("") -> ["H", "a", "l", "l", "o"])
// * Mit der Methode indexOf kannst du den Index eines Zeichens in einem Array finden (z.B. alphabet.indexOf("a") -> 0, alphabet.indexOf("b") -> 1


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> alphabet = new ArrayList<String>(Arrays.asList( "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z", "ä", "ö", "ü", "ß", " " ));

        while (shouldContinue(scanner)){
            askForData(scanner, alphabet);
        }

        scanner.close();
    }

    public static boolean shouldContinue(Scanner scanner) {
        System.out.println("Möchtest du eine Nachricht verschlüsseln/entschlüsseln? (J/N)");
        String answer = scanner.nextLine().toLowerCase();
        return answer.equals("j");
    }

    public static void askForData(Scanner scanner, ArrayList<String> alphabet) {
        System.out.println("Soll (V)erschlüsselt oder (E)ntschlüsselt werden?");
        String method = scanner.nextLine().toLowerCase();
        System.out.println("Wie groß ist die Verschiebung?");
        int shift = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.println("Wie lautet die Nachricht?");
        String message = scanner.nextLine();
        crypt(method, shift, message, alphabet);
    }

    public static void crypt(String method, int shift, String message, ArrayList<String> alphabet) {
        String output = "";
        if (!method.equals("v")) {
            shift *= -1;
        }
        for (String letter : message.split("")) {
            int index = alphabet.indexOf(letter);
            if (index != -1) { // if the character exists in the alphabet
                int pos = (index + shift) % alphabet.size();
                if (pos < 0) {
                    pos += alphabet.size();
                }
                output += alphabet.get(pos);
            } else { // if the character doesn't exist in the alphabet, keep it as it is
                output+=letter;
            }
        }
        System.out.println("Nachricht: " + output.toString());
    }
}
