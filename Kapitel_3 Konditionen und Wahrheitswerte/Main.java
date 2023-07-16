// An der Kinokasse gibt es für Kinder bis 12 Jahre 25 % Rabatt.
// Schreibe ein Programm, das den Preis eines Kinotickets berechnet.
// Der Preis für ein Ticket beträgt 15 Euro.
// Die Kund*in gibt ihr Alter ein und das Programm berechnet den Preis.
// Gib den Preis mit System.out.println() aus.


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int childTillAge = 12; // Maximales Alter für Rabatt
        double discount = 0.25; // 25 % Rabatt für Kinder
        double cost = 15; // Kosten pro Ticket

        // Alter der Kundin/Kunden
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie alt bist du?");
        int age = scanner.nextInt();
        scanner.close();

        if (age <= childTillAge) {
            double withDiscount = cost * (1 - discount);
            System.out.println("Dein Ticket kostet " + withDiscount);
        } else {
            System.out.println("Dein Ticket kostet " + cost);
        }

        System.out.println(14 % 12); // Das Ergebnis ist 2

        int val2 = 10;
        int val1 = 15;
        if ((val2 > 5 && val2 < 10) || (val1 < 10 || val2 > 5)) {
            System.out.println("Beide Bedingungen sind wahr");
        }
    }
}
