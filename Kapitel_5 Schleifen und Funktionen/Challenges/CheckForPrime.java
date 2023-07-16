// Schreibe eine App, die die Nutzer*in dazu auffordert eine Zahl einzugeben
// Schreibe eine Funktion names check_for_prime, welche ausgibt, ob es eine Primzahl ist oder nicht
// Tipps:
// Du kannst mit Modulo arbeiten
// Primzahlen sind nur durch 1 und sich selbst teilbar

import java.util.Scanner;
public class CheckForPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welche Zahl soll geprüft werden?");
        int n = input.nextInt();

        checkForPrime(n);

        input.close();
    }

    public static void checkForPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.printf("%d ist eine Primzahl\n", number);
        } else {
            System.out.printf("%d ist keine Primzahl\n", number);
        }
    }
}
