// Task-1 Wähle einen zufälligen Film aus der Liste movies und weise diesen der Variable chosen_movie zu
// Task-2 Lass die User*in einen Buchstaben raten. Speichere die Eingabe im Lower-Case in der Variable user_guess
// Task-3 Füge den Buchstaben einer neuen Liste (already_guessed) von Buchstaben die bereits geraten wurden hinzu.
// Task-4 Prüfe jede Stelle im Filmtitel auf den eingegebenen Buchstaben,
// Task 5 Erstelle eine Liste mit "_" korrespondierend zu der Anzahl an Buchstaben
// Der Unterstrich soll nur gesetzt werden, wenn es sich nicht, um eines der erlaubten Symbole (allowed_symbols) handelt
// Diese Symbole sollen direkt, statt dem Unterstrich angezeigt werden:
// " ", ":", "-", "\'", "ä", "ö", "ü", "ß", "&", "!", "?"
// Task 6 tausche bei einem Treffer den entsprechenden Unterstrich durch den passenden Buchstaben aus
// Task 7 - Erstelle eine Variable, welche die Anzahl an Versuchen der User*in speichert.
// Task 8 - Erstelle eine Variable welche festhält, ob die User*in gewonnen hat.
// Task 9 - Erstelle eine Schleife, die die User*in so lange zu neuen Eingaben auffordert,
// bis sie entweder keine Versuche mehr oder die Lösung erraten hat
// Task 10 - Führe das Aufdecken des Buchstaben nur aus, wenn wir den Buchstaben noch nicht geraten haben
// und dieser auch im Titel vorkommt.
// Ziehe andernfalls einen Versuch ab
// Task 11 - Prüfe, ob die User*in gewonnen hat
// Task 12 - Wenn die User*in gewonnen oder verloren hat, wird Sie gefragt, ob Sie eine neue Runde spielen möchte


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class GTF {
    public static ArrayList<String> loadMoviesFromFile(String filename) {
        ArrayList<String> movies = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            movies.addAll(lines);
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen der Datei " + filename);
            e.printStackTrace();
        }

        return movies;
    }
    public static void main(String[] args) {
        ArrayList<String> movies = loadMoviesFromFile("./movies.txt"); // Fügen Sie hier Ihre
                                                                                              // Filmliste ein
        ArrayList<String> allowedSymbols = new ArrayList<>(
                Arrays.asList(" ", ":", "-", "'", "ä", "ö", "ü", "ß", "&", "!", "?"));
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean won = false;
        boolean playing = true;
        int triesLeft = 4;

        while (playing) {
            String chosenMovie = movies.get(random.nextInt(movies.size()));
            ArrayList<String> coveredMovie = new ArrayList<>();

            for (int i = 0; i < chosenMovie.length(); i++) {
                String currentChar = String.valueOf(chosenMovie.charAt(i));
                if (allowedSymbols.contains(currentChar)) {
                    coveredMovie.add(currentChar);
                } else {
                    coveredMovie.add("_");
                }
            }

            ArrayList<String> alreadyGuessed = new ArrayList<>();

            while (triesLeft > 0 && !won) {
                System.out.println("Wähle einen Buchstaben: ");
                String userGuess = scanner.next().toLowerCase();

                if (!alreadyGuessed.contains(userGuess) && chosenMovie.toLowerCase().contains(userGuess)) {
                    alreadyGuessed.add(userGuess);

                    for (int i = 0; i < chosenMovie.length(); i++) {
                        if (String.valueOf(chosenMovie.toLowerCase().charAt(i)).equals(userGuess)) {
                            coveredMovie.set(i, String.valueOf(chosenMovie.charAt(i)));
                        }
                    }

                    if (!coveredMovie.contains("_")) {
                        won = true;
                    }
                } else {
                    triesLeft--;
                    System.out.println("Das war leider falsch. Du hast noch " + triesLeft + " Versuche");
                }

                if (won) {
                    System.out.println("Super, du hast es gelöst!");
                    System.out.println(chosenMovie);
                } else if (triesLeft == 0) {
                    System.out.println("Schade, du hast es leider nicht geschafft!");
                    System.out.println("Die richtige Lösung war: " + chosenMovie);
                } else {
                    for (String c : coveredMovie) {
                        System.out.print(c);
                    }
                    System.out.println();
                }

                if (won || triesLeft == 0) {
                    System.out.println("Möchtest du noch eine Runde spielen (J/N)?");
                    String answer = scanner.next().toLowerCase();

                    if (answer.equals("j")) {
                        won = false;
                        triesLeft = 4;
                        alreadyGuessed.clear();
                        coveredMovie.clear();
                        playing = true;
                        break;
                    } else {
                        playing = false;
                        break;
                    }
                }
            }
            
        }
        scanner.close();
    }
}
