import java.util.ArrayList;

public class Location extends GameObject{

    protected ArrayList<GameObject> contents;
    
    /**
     * Full constructor.
     */
    public Location(String name, String description, double centerX, double centerY){
        super(name, description, centerX, centerY);
        this.contents = new ArrayList<GameObject>();

    }
}