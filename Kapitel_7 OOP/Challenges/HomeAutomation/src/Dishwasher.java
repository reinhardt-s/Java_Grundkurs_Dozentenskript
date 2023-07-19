public class Dishwasher implements SelfCleaningInterface {

    private int runCycles = 0;

    public int getRunCycles() {
        return runCycles;
    }

    public void setRunCycles(int runCycles) {
        this.runCycles = runCycles;
    }

    // This method starts the cleaning process of the dishwasher.
    @Override
    public void startCleaning() {
        System.out.println("Spinning cleaning brushes...");
        System.out.println("Sploosh brrr wobble wobble...");
        System.out.println("Cleaning complete!");
        this.runCycles = 0;
    }

    // This method checks if the dishwasher is dirty.
    @Override
    public boolean checkIfDirty() {
        return this.runCycles > 10;
    }

}
