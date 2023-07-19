/**
 * This interface defines the methods that a self-cleaning object should implement.
 */
public interface SelfCleaningInterface {
    
    /**
     * Starts the cleaning process.
     */
    void startCleaning();
    
    /**
     * Checks if the object is dirty.
     * @return true if the object is dirty, false otherwise.
     */
    boolean checkIfDirty();
}
