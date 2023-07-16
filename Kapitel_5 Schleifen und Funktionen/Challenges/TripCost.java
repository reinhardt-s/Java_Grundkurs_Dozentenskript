// Schreibe eine App, welche mit den Parametern: distance, costPerLiter, literPer100Km,
// Task 1 - Erstelle eine Funktion askUserForData, in welche die Nutzer*in nach den drei Werten fragt
// Task 2 - Erstelle eine Funktion calcCost, welche diese drei Werte annimmt
// Task 3 - Berechnung und Ausgabe der Kosten.
// Task 4 - Rufe aus askUserForData die Funktion calcCost auf und rufe askUserFoData selbst auf

import java.util.Scanner;

public class TripCost {
    
    public static void main(String[] args) {
        askUserForData();
    }

    public static void askUserForData() {
        Scanner input = new Scanner(System.in);

        System.out.println("Wie lang ist die Route in Kilometern?");
        int tripDistance = input.nextInt();

        System.out.println("Wie viel kostet ein Liter Benzin?");
        float costPerLiter = input.nextFloat();

        System.out.println("Wie viel Benzin benötigt das Fahrzeug durchschnittlich für 100km?");
        float literPer100Km = input.nextFloat();

        calcCost(tripDistance, costPerLiter, literPer100Km);

        input.close();
    }

    public static void calcCost(int distance, float cost, float consumption) {
        float consumptionPerKm = consumption / 100;
        float result = distance * cost * consumptionPerKm;

        System.out.printf("Die Fahrt wird in etwa %.2f € kosten.\n", result);
    }
}
