import java.util.ArrayList;

/**
 * Locations hold GameObject contents, including Characters. 
 */
public class Location extends GameObject{

    protected ArrayList<GameObject> contents; //the GameObjects in a Location
    
    /**
     * Constructor.
     * @param name The Location's name.
     * @param description The Location's description.
     * @param centerX The x coordinate at which the Location is accessible.
     * @param centerY The y coordinate at which the Location is accesible.
     */
    public Location(String name, String description, double centerX, double centerY){
        super(name, description, centerX, centerY);
        this.contents = new ArrayList<GameObject>();

    }

    /**
     * Overloaded constructor allows adding a GameObject to the Location's contents.
     * @param name The Location's name.
     * @param description The Location's description.
     * @param centerX The x coordinate at which the Location is accessible.
     * @param centerY The y coordinate at which the Location is accesible.
     * @param object A GameObject to add to the Location's contents.
     */
    public Location(String name, String description, double centerX, double centerY, GameObject object){
        super(name, description, centerX, centerY);
        this.contents = new ArrayList<GameObject>();
        contents.add(object);

    }

    /**
     * Adds a GameObject to the Location's contents.
     * @param object The GameObject to add to the Location's contents.
     */
    public void addObject(GameObject object){
        this.contents.add(object);
    }

    /**
     * Removes a GameObject from the Location's contents.
     * @param object The GameObject to remove from the Location's contents.
     */
    public void removeObject(GameObject object){
        //check if the GameObject is in the Location.
        if (this.contents.contains(object)){
            //remove the GameObject
            this.contents.remove(object);
        } else {
            throw new RuntimeException(object.description + " is not in " + this.name);
        }
    }

    /**
     * Checks if a given name of an object matches the String name of an object in the Location's contents. Returns the GameObject that matches the name.
     * @param objectName The name to check in the contents.
     * @return The GameObject that matches the given name.
     */
    public GameObject checkContents(String objectName){
        //get length of contents
        int length = this.contents.size();
        //loop through contents
        for (int i = 0; i < length; i++){ 
            GameObject item = this.contents.get(i); 
            //check if the objectName matches the name of a GameObject in contents
            if (item.name.equalsIgnoreCase(objectName)){
                return item;
            } 
        }
        throw new RuntimeException("There is no " + objectName + " here.");
    }


    /**
     * Prints a formatted list of the GameObjects in a Location.
     * Note: update this method.
     */
    public void contentsToString(){
        System.out.println("Objects near you: ");
        for (GameObject object : this.contents){
            if (object instanceof Character){
                System.out.println(" ");
            } else{
                System.out.println(object.name + ": " + object.description);
            }
        }
    }

    public static void main(String[] args) {

    }
}