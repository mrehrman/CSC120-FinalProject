/**
 * Creates a map that contains Locations.
 */
public class Map{
    
    Location[] locations;
    int size;
    double maxX; 
    double minX;
    double maxY;
    double minY; 

    /**
     * Constructor
     * @param numLocations the Number of Locations the Map contains.
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
     * Getter for Map size: the number of elements that the Map contains
     * @return the number of elements that the Map contains
     */
    public int getSize(){
        return this.size;
    }

    /**
     * Returns 
     * @param args
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
        Map gameMap = new Map(6, 10, 0, 10, 0);
        Location forest1 = new Location("forest", "You are in the forest. There are tall trees all around you. \n There is a small clearing in front of you with a large rock in it. \n When you look closer, you can see a book on top of the rock.", 0, 10);
        gameMap.addLocation(forest1, 0);
        Location forest2 = new Location("forest", "You are in the forest. The trees block the light, so it is quite dark. \n There is a small path heading west.", 5, 10);
        gameMap.addLocation(forest2, 1);

        System.out.println(gameMap.checkLimits(5, 5));
        System.out.println(gameMap.checkLimits(-5, 12.5));
        System.out.println(gameMap.checkLimits(0, 15));
        System.out.println(gameMap.checkLimits(0, 11));


    }
}