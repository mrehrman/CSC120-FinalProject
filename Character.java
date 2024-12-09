import java.util.ArrayList;

/**
 * Characters can move through Locations in a Map and interact with GameObjects.
 */
public class Character extends GameObject{

    protected ArrayList<GameObject> inventory; //the GameObjects a Character has
    protected int health; //a health score ranging from 1-10
    protected Location location; //the Location that the Character is in

    /**
     * Constructor. Note: params x and y are redundant when location is also a parameter.
     * @param name The Character's name.
     * @param description The Character's description.
     * @param x The x coordinate where the Character is.
     * @param y The y coordinate where the Character is.
     * @param location The Location where the Character is.
     */
    public Character(String name, String description, double x, double y, Location location){
        super(name, description, x, y);
        this.inventory = new ArrayList<GameObject>(); //Characters start with an empty inventory.
        this.health = 10; //Characters start with a full health score of 10.
        this.location = location;
    }

    /**
     * Moves a Character into a new Location in a Map by changing its coordinates.
     * @param direction The direction for the Character to move ("north", "south", "east", or "west")
     * @param map The Map in which the Character is moving.
     */
    public void walk(String direction, Map map){
        //check which direction to move and update character's coordinates accordingly
        if (direction.equalsIgnoreCase("north")){
            if (map.checkLimits(this.x, this.y + 5)){
                this.y = this.y + 5;
            } else{
                throw new RuntimeException("You cannot walk any further in that direction. Try a new direction.");
            }
        } else if (direction.equalsIgnoreCase("south")){
            if (map.checkLimits(this.x, this.y - 5)){
                this.y = this.y - 5;
            } else{
                throw new RuntimeException("You cannot walk any further in that direction. Try a new direction.");
            }
        } else if (direction.equalsIgnoreCase("east")){
            if (map.checkLimits(this.x + 5, this.y)){
                this.x = this.x + 5;
            } else{
                throw new RuntimeException("You cannot walk any further in that direction. Try a new direction.");
            }
        } else if (direction.equalsIgnoreCase("west")){
            if (map.checkLimits(this.x - 5, this.y)){
                this.x = this.x - 5;
            } else{
                throw new RuntimeException("You cannot walk any further in that direction. Try a new direction.");
            }
        } else{
            throw new RuntimeException("You can only walk NORTH, SOUTH, EAST, or WEST. Try a different direction.");
        }
        int length = map.getSize();
        //add Character to new Location and change Character's location to new Location
        for (int i = 0; i < length; i++){
            Location myLocation = map.locations[i];
            if (this.getX() == myLocation.getX() && this.getY() == myLocation.getY()){
                myLocation.addObject(this);
                this.location = myLocation;
                System.out.println(myLocation.description);
            }
        }
        }


    /**
     * Shows which GameObjects are in the same Location as the Character.
     */
    public void lookAround(){
        this.location.contentsToString();
    }

    
    /**
     * Allows the Character to pick up an object and add it to their inventory.
     * @param item The object to pick up.
     */
    public void grab(GameObject item){
        //check if the object is in the same Location as the Character
        if (this.location.contents.contains(item)){
            //add object to Character's inventory
            inventory.add(item);
            //remove object from Location's contents
            this.location.removeObject(item);
            System.out.println("You have grabbed a(n) " + item.name + ".");
        } else {
            throw new RuntimeException("There is no " + item.name + " to grab.");
        }
    }

    /**
     * Allows the Character to drop an item and remove it from their inventory.
     * @param item The object to drop.
     */
    public void drop(GameObject item){
        //check if the object is in the Character's inventory
        if (inventory.contains(item)){
            //remove object from Character's inventory
            inventory.remove(item);
            //add object to the contents of the Location where the Character is
            this.location.addObject(item);
            System.out.println("You have dropped a(n) " + item.name + ".");
        } else{
            throw new RuntimeException(item + " is not in your inventory.");
        }  
    }

    /**
     * Checks if an object is in the Character's inventory.
     * @param objectName The object to check for.
     * @return
     */
    public GameObject checkInventory(String objectName){
        int length = this.inventory.size();//get length of contents
        for (int i = 0; i < length; i++){ //loop through contents
            GameObject item = this.inventory.get(i); 
            if (item.name.equalsIgnoreCase(objectName)){
                return item;
            } 
        }
        throw new RuntimeException("There is no " + objectName + " in your inventory.");
    }

    public static void main(String[] args) {
        
    }
}