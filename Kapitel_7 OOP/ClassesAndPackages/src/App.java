import monsters.FluffyGiggles;
import monsters.SugarFangs;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Monsters Game!");
        SugarFangs sugarFangs = new SugarFangs();
        FluffyGiggles fluffyGiggles = new FluffyGiggles();

        sugarFangs.printStats();
        fluffyGiggles.printStats();

        sugarFangs.attack(fluffyGiggles);
        fluffyGiggles.attack(sugarFangs);

        sugarFangs.printStats();
        fluffyGiggles.printStats();

        sugarFangs.scream();
        fluffyGiggles.scream();
    }
}
