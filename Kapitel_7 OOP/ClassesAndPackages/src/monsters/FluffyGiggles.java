package monsters;


/**
 * FluffyGiggles class represents a specific type of monster that extends the BasicMonster class and implements the BehaviourInterface.
 */
public class FluffyGiggles extends BasicMonster implements BehaviourInterface{
    
    public FluffyGiggles() {
        this.setName("Fluffy Giggles");
        this.setHealth(80);
    }

    @Override
    public void scream() {
        System.out.println("Fluffy Giggles screams: \"I'm gonna get you!\"");
    }

    @Override
    public void evolve() {
        System.out.println("Fluffy Giggles evolves into a Mega Giggles!");
    }

    @Override
    public void taunt() {
        System.out.println("Fluffy Giggles taunts: \"You can't catch me!\"");
    }

    @Override
    protected String getMonsterType() {
        return "Psychic";
    }
}
