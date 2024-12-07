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

    public void addObject(GameObject object){
        this.contents.add(object);
    }

    public void removeObject(GameObject object){
        if (this.contents.contains(object)){
            this.contents.remove(object);
        } else {
            throw new RuntimeException(object.description + " is not in " + this.name);
        }
    }

    // public void contentsToString(){
    //     Object[] objects = this.contents.toArray();
    //     int i = 1;
    //     for (Object object : objects){
    //         System.out.println(i + ". " + object);
    //         i = i + 1;

    //     }
    // }

    public static void main(String[] args) {
        
    }
}