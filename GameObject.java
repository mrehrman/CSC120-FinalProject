/**
 * Elements of the game, including Characters, Locations, and other objects have the pieces from the GameObject class in common.
 */
public class GameObject{

   
    protected String name;
    protected String description;
    protected double x; //x cooordinate
    protected double y; //y coordinate

    /**
     * Full constructor
     * @param name The object's name.
     * @param description A description of the object.
     */
    public GameObject(String name, String description, double x, double y){
        this.name = name;
        this.description = description;
        this.x = x;
        this.y = y;
    }

    /**
     * Overloaded constructor, no x or y coordinate.
     * @param name
     * @param description
     */
    public GameObject(String name, String description){
        this.name = name;
        this.description = description;
    }

    /**
     * Getter for name.
     * @return The GameObject's name.
     */
    public String getName(){
        return this.name;
    }

    /**
     * Getter for description.
     * @return The GameObject's description.
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * Getter for x coordinate.
     * @return The GameObject's x coordinate.
     */
    public double getX(){
        return this.x;
    }

    /**
     * Getter for y coordinate.
     * @return The GameObject's y coordinate.
     */
    public double getY(){
        return this.y;
    }
}