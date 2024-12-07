import java.util.ArrayList;

public class Character extends GameObject{

    protected ArrayList<GameObject> inventory; 
    protected int health; //a health score ranging from 1-10
    protected Location location;

    public Character(String name, String description, double x, double y, Location location){
        super(name, description, x, y);
        this.inventory = new ArrayList<GameObject>(); //Characters start with an empty inventory.
        this.health = 10; //characters start with a full health score of 10.
        this.location = location;
    }

    public void walk(String direction, Map map){
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
        for (int i = 0; i < length; i++){
            Location myLocation = map.locations[i];
            if (this.getX() == myLocation.getX() && this.getY() == myLocation.getY()){
                myLocation.addObject(myLocation);
                this.location = myLocation;
                System.out.println(myLocation.description);
            }
        }
        }

    /**
     * 
     * @param item
     */
    public void lookAround(){
        this.location.contentsToString();
    }

    
    /**
     * Allows the Character to pick up an object and add it to their inventory.
     * @param item The object to pick up.
     */
    public void grab(GameObject item){
        if (this.location.contents.contains(item)){
            inventory.add(item);
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
       
        if (inventory.contains(item)){
            inventory.remove(item);
            this.location.addObject(item);
            System.out.println("You have dropped a(n) " + item.name + ".");
        } else{
            throw new RuntimeException(item + " is not in your inventory.");
        }  
    }

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