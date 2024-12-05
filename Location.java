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

    public void inLocation(GameObject object){
        this.contents.add(object);
        if(this.contents.contains(object)){
            System.out.println(object.name + " is now in " + this.name);
        }

    }

    public static void main(String[] args) {
        
    }
}