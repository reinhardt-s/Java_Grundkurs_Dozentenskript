package monsters;


/**
 * The SugarFangs class represents a type of monster that extends the BasicMonster class and implements the BehaviourInterface.
 * It contains methods for evolving, taunting, and getting the monster type.
 */
public class SugarFangs extends BasicMonster implements BehaviourInterface{

    public SugarFangs() {
        this.setName("Sugar Fangs");
        this.setHealth(120);
        this.setAttack(15);
        this.setDefense(5);
    }

    @Override
    public void evolve() {
        System.out.println("Sugar Fangs evolves into a Mega Fangs!");
    }

    @Override
    public void taunt() {
        System.out.println("Sugar Fangs taunts: \"You can't catch me!\"");
    }

    @Override
    protected String getMonsterType() {
        return "Dark";
    }
    
}
