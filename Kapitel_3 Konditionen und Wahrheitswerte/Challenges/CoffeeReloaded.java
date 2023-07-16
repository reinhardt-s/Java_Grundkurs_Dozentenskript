// Erweitere das Programm so, das je nach gewählter Kaffee-Zubereitung eine andere Füllmenge gewählt wird:
//   - (1) Kaffee       = 140 ml
//   - (2) Espresso     =  20 ml
//   - (3) Americano    = 450 ml
//   - (x) Alle anderen = 200 ml
// Erweitere das Kaffeeprogramm so, dass nach dem die Tasse gefüllt wurde,
// Milch hinzugegeben wird, so dies vom Kunden gewünscht ist.

import java.util.Scanner;

public class CoffeeReloaded {
    public static void main(String[] args) {
        int maxInMl = 1000; // Maximale Kaffeefüllmenge - kann überschrieben werden

        // Kaffeesorte, angegeben durch 1,2 oder 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wählen Sie:\n1 - Kaffee\n2 - Espresso\n3 - Americano\n4 - Crema\n5 - Cold Brew\n");
        int coffeeType = scanner.nextInt();
        
        // Soll Milch hinzugefügt werden? (j/n) - wird zum Boolean
        System.out.println("Soll Milch hinzugefügt werden? (j/n)");
        String addMilkInput = scanner.next();
        boolean addMilk = addMilkInput.equalsIgnoreCase("j");
        
        // Tassenfüllstand
        System.out.println("Wie viel ML Kaffee sind in der Tasse?");
        int filledToInMl = scanner.nextInt();
        scanner.close();

        // Dein Code kommt unter dieser Zeile

        switch(coffeeType) {
            case 1:
                maxInMl = 140;
                break;
            case 2:
                maxInMl = 20;
                break;
            case 3:
                maxInMl = 450;
                break;
            default:
                maxInMl = 200;
        }

        if (filledToInMl >= maxInMl) {
            if (addMilk) {
                System.out.println("Füge Milch hinzu");
            }
            System.out.println("Der Kaffee ist fertig.");
        } else {
            System.out.println("Fülle auf");
        }
    }
}
