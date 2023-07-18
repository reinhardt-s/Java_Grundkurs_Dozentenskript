package monsters;


/**
 * This interface defines the behavior of a monster in the game.
 */
public interface BehaviourInterface {
    
    /**
     * This method is called when the monster evolves to a higher level.
     */
    public void evolve();
    
    /**
     * This method is called when the monster taunts the player.
     */
    public void taunt();
}

