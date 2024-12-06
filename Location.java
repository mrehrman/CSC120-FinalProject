import java.util.ArrayList;

public class Location extends GameObject{

    protected ArrayList<GameObject> contents;
    
    /**
     *  constructor.
     */
    public Location(String name, String description, double centerX, double centerY){
        super(name, description, centerX, centerY);
        this.contents = new ArrayList<GameObject>();

    }

    /**
     * Overloaded constructor adds GameObjects to Location
     */
    public Location(String name, String description, double centerX, double centerY, GameObject object){
        super(name, description, centerX, centerY);
        this.contents = new ArrayList<GameObject>();
        contents.add(object);

    }

    public void inLocation(GameObject object){
        this.contents.add(object);
        if(this.contents.contains(object)){
            System.out.println(this.description);
        }

    }

    public static void main(String[] args) {
        
    }
}