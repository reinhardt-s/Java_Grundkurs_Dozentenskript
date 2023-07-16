import java.util.Random;
import java.util.Scanner;

public class RPSLS {
    public static void main(String[] args) {
        String[] hands = {
            "STEIN\n\n    _______\n---'   ____\n      (_____)\n      (_____)\n      (____)\n---.__(___)\n",        
            "SCHERE\n\n    _______\n---'   ____)____\n          ______)\n       __________)\n      (____)\n---.__(___)\n",        
            "PAPIER\n\n     _______\n---'    ____)____\n           ______)\n          _______)\n         _______)\n---.__________)\n",       
            "ECHSE\n\n      ___________\n---/'  __________)\n    (_________    \n---.__________)\n",
            "SPOCK\n\n     _______\n---/'   ____)____\n           ______)\n         ________)\n        (_______\n         _______)\n---.__________)\n"
        };
        
        // Dein Code nach dieser Zeile
        Random random = new Random();

        System.out.println("Willkommen bei Rock Paper Scissors Lizard Spock!");
        System.out.println("Wähle deine Hand:\n1: Stein, 2: Schere, 3: Papier, 4: Echse, 5: Spock: ");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        if (userChoice < 1 || userChoice > 5) {
            System.out.println("Keine gültige Eingabe. Du verlierst.");
            scanner.close();
            return;
        }

        System.out.println("Du wählst:\n" + hands[userChoice - 1]);

        int appChoice = random.nextInt(5) + 1;
        System.out.println("Computer wählt:\n" + hands[appChoice - 1]);

        if (userChoice == appChoice) {
            System.out.println("Unentschieden!");
        } else if ((userChoice == 2 && (appChoice == 3 || appChoice == 4)) ||
                (userChoice == 3 && (appChoice == 1 || appChoice == 5)) ||
                (userChoice == 1 && (appChoice == 4 || appChoice == 2)) ||
                (userChoice == 4 && (appChoice == 5 || appChoice == 3)) ||
                (userChoice == 5 && (appChoice == 2 || appChoice == 1))) {
            System.out.println("Du gewinnst!");
        } else {
            System.out.println("Du verlierst");
        }
        scanner.close();
        // Dein Code vor dieser Zeile

    }
}
