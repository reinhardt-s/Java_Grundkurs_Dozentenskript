// Erstelle einen Kaffeeautomaten welches aufhört die Tasse zu befüllen, 
// wenn der Tassenfüllstand 150ml erreicht ist.
// Gebe dann "Der Kaffee ist fertig" aus. Gebe andernfalls "Fülle auf..." aus.

import java.util.Scanner;
public class Coffee {
    public static void main(String[] args) {
        // Lese die Tassenfüllmenge ein
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Tassenfüllmenge ein:");
        int cupFillLevel = scanner.nextInt();
        scanner.close();
        int cupVolume = 150;

        // Prüfe ob die Tassenfüllmenge die maximale Füllmenge erreicht hat
        if (cupFillLevel >= cupVolume) {
            System.out.println("Der Kaffee ist fertig");
        } else {
            System.out.println("Fülle auf...");
        }
    }
}
