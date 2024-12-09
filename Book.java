/**
 * A type of GameObject that cna hold spells to affect Character abilities.
 * Note: this could become an instance of the GameObject class instead of its own class.
 */
public class Book extends GameObject {

    protected boolean swimSpell; 

    public Book(String name, String description, boolean swimSpell){
        super(name, description);
        this.swimSpell = swimSpell;
    }

}
