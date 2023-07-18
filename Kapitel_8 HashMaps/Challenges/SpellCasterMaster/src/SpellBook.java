/**
 * This class represents a spell book that contains a collection of spells and their descriptions.
 * It uses a HashMap to store the spells and their descriptions.
 */
import java.util.HashMap;

public class SpellBook {


    /**
     * This HashMap represents a spell book that contains a collection of spells and their descriptions.
     * The keys are the names of the spells and the values are their descriptions.
     */
    private HashMap<String, String> spellBook = new HashMap<String, String>() {{
        put("Alohomora", "Unlocking Charm");
        put("Avada Kedavra", "Killing Curse");
        put("Crucio", "Cruciatus Curse");
        put("Imperio", "Imperius Curse");
        put("Lumos", "Wand-Lighting Charm");
        put("Obliviate", "Memory Charm");
        put("Wingardium Leviosa", "Levitation Charm");
    }};


    /**
     * This method returns the description of a spell given its name.
     *
     * @param spellName the name of the spell to get the description for
     * @return the description of the spell, or null if the spell is not in the spell book
     */
    public String getSpell(String spellName) {
        return spellBook.get(spellName);
    }

    /**
     * This method returns an array of all the spell names in the spell book.
     *
     * @return an array of all the spell names in the spell book
     */
    public String[] getSpellNames() {
        return spellBook.keySet().toArray(new String[0]);
    }

    /**
     * This method adds a new spell to the spell book.
     *
     * @param spellName the name of the new spell
     * @param spellDescription the description of the new spell
     */
    public void addSpell(String spellName, String spellDescription) {
        spellBook.put(spellName, spellDescription);
    }

    /**
     * This method removes a spell from the spell book given its name.
     *
     * @param spellName the name of the spell to remove
     */
    public void removeSpell(String spellName) {
        spellBook.remove(spellName);
    }

    /**
     * This method returns a string representation of the spell book.
     *
     * @return a string representation of the spell book
     */
    public String toString() {
        String output = "";
        for (String spellName : spellBook.keySet()) {
            output += spellName + ": " + spellBook.get(spellName) + "\n";
        }
        return output;
    }



}
