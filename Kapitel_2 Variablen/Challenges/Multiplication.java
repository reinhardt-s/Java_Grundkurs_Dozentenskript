
/*
* Erstelle ein Programm das:
* 1. Zwei ganze Zahlen einliest
* 2. Beide Zahlen multipliziert und in einer Variable speichert
* 3. Das Ergebnis ausgibt.
*/
import java.util.Scanner;

class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die erste Zahl ein:");
        int firstNumber = scanner.nextInt();
        System.out.println("Bitte geben Sie die zweite Zahl ein:");
        int secondNumber = scanner.nextInt();        int result = firstNumber * secondNumber;
        System.out.println("Das Ergebnis ist: " + result);
        scanner.close();
    }
}