package monsters;



/**
 * The BasicMonster class is an abstract class that represents a basic monster in a game.
 * It contains properties for the monster's name, health, attack, and defense, as well as
 * methods for getting and setting these properties, attacking another BasicMonster, and
 * printing the monster's stats to the console.
 */
public abstract class BasicMonster {
    private String name;
    private int health = 100;
    private int attack = 12;
    private int defense = 8;

    /**
     * Returns the name of the monster.
     * 
     * @return the name of the monster
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the monster.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the health of the monster.
     * 
     * @return the health of the monster
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the health of the monster.
     * 
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Returns the attack of the monster.
     * 
     * @return the attack of the monster
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Sets the attack of the monster.
     * 
     * @param attack the attack to set
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * Returns the defense of the monster.
     * 
     * @return the defense of the monster
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Sets the defense of the monster.
     * 
     * @param defense the defense to set
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * Attacks another BasicMonster and reduces its health by the amount of damage
     * dealt.
     * 
     * @param target the BasicMonster to attack
     */
    public void attack(BasicMonster target) {
        int damage = this.attack - target.defense;
        if (damage < 0) {
            damage = 0;
        }
        target.health -= damage;
    }

    /**
     * Prints the stats of the monster to the console.
     */
    public void printStats() {
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Attack: " + this.attack);
        System.out.println("Defense: " + this.defense);

        System.out.println("");
        System.out.println("");
    }

    public void scream() {
        System.out.println("ROAR!");
    }

    protected abstract String getMonsterType();

}
