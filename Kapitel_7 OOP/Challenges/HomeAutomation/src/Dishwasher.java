public class Dishwasher implements SelfCleaningInterface{

    private int runCycles = 0;
    @Override
    public void startCleaning() {
        System.out.println("Spinning cleaning brushes...");
        System.out.println("Sploosh brrr wobble wobble...");
        System.out.println("Cleaning complete!");
        this.runCycles = 0;

    }

    @Override
    public boolean checkIfDirty() {
        if (this.runCycles > 10) {
            return true;
        } else {
            return false;
        }
    }
    
}
