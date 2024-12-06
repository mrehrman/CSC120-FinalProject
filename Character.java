import java.util.ArrayList;

public class Character extends GameObject{

    protected ArrayList<GameObject> inventory; 
    protected int health; //a health score ranging from 1-10

    public Character(String name, String description, double x, double y){
        super(name, description, x, y);
        this.inventory = new ArrayList<GameObject>(); //Characters start with an empty inventory.
        this.health = 10; //characters start with a full health score of 10.
    }

    public void speak(String sentence){
        System.out.println(sentence);
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
            Location location = map.locations[i];
            if (this.getX() == location.getX() && this.getY() == location.getY()){
                location.inLocation(this);
            }
        }
        }

    
    /**
     * Allows the Character to pick up an object and add it to their inventory.
     * @param item The object to pick up.
     */
    public void grab(GameObject item){
        if (item.x == this.x & item.y == this.y){
            inventory.add(item);
            System.out.println("You have picked up a(n) " + item + ".");
        } else{
            throw new RuntimeException("There is no " + item + " to grab.");
        }
    }

    /**
     * 
     * @param item
     */
    public void lookAround(){
        
    }

    /**
     * Allows the Character to drop an item and remove it from their inventory.
     * @param item The object to drop.
     */
    public void drop(GameObject item){
       
        if (inventory.contains(item)){
            inventory.remove(item);
            System.out.println("You have dropped " + item + ".");
        } else{
            throw new RuntimeException(item + " is not in your inventory.");
        }  
    }

    public static void main(String[] args) {
        
    }
}