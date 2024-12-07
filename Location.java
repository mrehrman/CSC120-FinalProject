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

    /**
     * Checks if the given String name of an object matches the String name of an object in the Location's contents.
     * @param objectName
     * @return
     */
    public GameObject checkContents(String objectName){
        int length = this.contents.size();
        for (int i = 1; i < length; i++){
            GameObject item = this.contents.get(i);
            if (item.name == objectName){
                return item;
            } 
        } throw new RuntimeException("There is no " + objectName + " here.");
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
        GameObject book1 = new GameObject("Spell Book", "A book bound in a bright blue material. \n Large cursive script on the front reads 'Spell Book'");
        GameObject book2 = new GameObject("Cook Book", "A silver book with elaborate red detailing on the spine. \n The front says 'Cook Book'");
        GameObject book3 = new GameObject("Flora and Fauna of the Enchanted Forest", "A book with a dark green spine and brown cover that says 'Flora and Fauna of the Enchanted Forest'");


        Map gameMap = new Map(6, 5, 0, 10, 0);
         Location forest1 = new Location("forest", "You are in the forest. There are tall trees all around you. \n There is a small clearing in front of you with a large rock in it. \n When you look closer, you can see a book on top of the rock.", 0, 10);
         forest1.addObject(book3);
         gameMap.addLocation(forest1, 0);
         Location forest2 = new Location("forest", "You are in the forest. The trees block the light, so it is quite dark. \n There is a small path heading west.", 5, 10);
         gameMap.addLocation(forest2, 1);
         Location field = new Location("field of flowers", "You are in a field full of flowers in every color of the rainbow. \n A small patch of flowers are shimmering. \n When you get closer, you see that there is a silver book on the ground underneath them.", 0, 5);
         gameMap.addLocation(field, 2);
         field.addObject(book2);

        System.out.println(forest1.checkContents("Flora"));
    }
}