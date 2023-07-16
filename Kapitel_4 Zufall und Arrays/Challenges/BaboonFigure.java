// Schreibe ein Programm welches die Spieler*in dazu auffordert deren Schatz zu vergraben,
// in dem diese die Zeile und Spalte angibt.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BaboonFigure {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> treasureMap = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList("🟫", "🟫", "🟫")),
            new ArrayList<>(Arrays.asList("🟫", "🟫", "🟫")),
            new ArrayList<>(Arrays.asList("🟫", "🟫", "🟫"))
        ));
        String baboonFigure = "🐒";
        printMap(treasureMap);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wo soll der Schatz vergraben werden(Y,X - z.B. 1,2):");
        String input = scanner.nextLine();
        String[] inputArray = input.split(",");
        int row = Integer.parseInt(inputArray[0]);
        int column = Integer.parseInt(inputArray[1]);
        treasureMap.get(row-1).set(column-1, baboonFigure);
        scanner.close();

        printMap(treasureMap);
    }

    private static void printMap(ArrayList<ArrayList<String>> treasureMap) {
        System.out.println("1️⃣ " + String.join("", treasureMap.get(0)));
        System.out.println("2️⃣ " + String.join("", treasureMap.get(1)));
        System.out.println("3️⃣ " + String.join("", treasureMap.get(2)));
        System.out.println("  1️⃣ 2️⃣ 3️⃣");
    }
}
