import java.util.Random;
public class CoffeeMaker implements SelfCleaningInterface{

    @Override
    public void startCleaning() {
        System.out.println("Pushing hot water through the machine...");
        System.out.println("PTFPPFPFFFFFF...");
        System.out.println("Cleaning complete!");
    }

    @Override
    public boolean checkIfDirty() {
        Random rand = new Random();
        return rand.nextInt(2) == 1;
    }
    
}
