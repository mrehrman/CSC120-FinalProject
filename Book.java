public class Book extends GameObject {

    protected boolean swimSpell; 

    public Book(String name, String description, boolean swimSpell){
        super(name, description);
        this.swimSpell = swimSpell;
    }

}
