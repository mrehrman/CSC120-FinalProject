/**
 * Creates a Map that contains Locations.
 */
public class Map{
    
    Location[] locations; //the Locations in the Map
    int size; //the number of Locations in the Map
    double maxX; //the maximum x coordinate in the range of x coordinates the Map can hold
    double minX; //the minimum x coordinate in the range of x coordinates the Map can hold
    double maxY; //the maximum y coordinate in the range of x coordinates the Map can hold
    double minY; //the minimum y coordinate in the range of x coordinates the Map can hold

    
    /**
     * Constructor.
     * @param numLocations the number of Locations the Map contains.
     * @param maxX the maximum x coordinate in the range of x coordinates the Map can hold
     * @param minX the minimum x coordinate in the range of x coordinates the Map can hold
     * @param maxY the maximum y coordinate in the range of x coordinates the Map can hold
     * @param minY the minimum y coordinate in the range of x coordinates the Map can hold
     */
    public Map(int numLocations, double maxX, double minX, double maxY, double minY){
        this.locations = new Location[numLocations];
        this.size = numLocations;
        this.maxX = maxX;
        this.minX = minX;
        this.maxY = maxY;
        this.minY = minY;
    }

    /**
     * Adds a Location to the GameMap
     * @param b the Location to add
     * @return Location the Location that was added
     */
    public Location addLocation(Location l, int index) {
        locations[index] = l;
        return l;
    }

    /**
     * Getter for Map size: the number of Locations that the Map contains
     * @return the number of Locations that the Map contains
     */
    public int getSize(){
        return this.size;
    }

    /**
     * Checks if a given x and y coordinate are within the Map's boundaries. 
     * @param x The x coordinate to check against the Map's parameters.
     * @param y The y coordinate to check against the Map's parameters.
     * @return True if the x and y coordinates are within the Map's parameters, false if they are not.
     */
    public boolean checkLimits(double x, double y){
        if (x >= this.minX & x <= this.maxX & y >= this.minY & y <= this.maxY){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {


    }
}