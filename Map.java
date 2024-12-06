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
     * 
     * @param args
     */
    public boolean checkLimits(double x, double y){
        if (this.minX <= x & x <= this.maxX & this.minY <= y & this.maxY <= y){
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
        Location field = new Location("field of flowers", "You are in a field full of flowers in every color of the rainbow. \n A small patch of flowers are shimmering. \n When you get closer, you see that there is a silver book on the ground underneath them.", 0, 5);
        gameMap.addLocation(field, 2);
        Location cottage = new Location("cottage", "You are at the cottage.", 5, 5);
        gameMap.addLocation(cottage, 3);
        Location forest3 = new Location("forest", "You are in the forest. You can hear the sound of rushing water nearby.", 5, 0);
        gameMap.addLocation(forest3, 4);
        Location waterfall = new Location("waterfall", "You are in front of a waterfall. At the base of the waterfall is a pool of water /n with a large rock in the middle. On the rock sits a bright blue book.", 10, 0);
        gameMap.addLocation(waterfall, 5);

        System.out.println(gameMap.checkLimits(0, 0));



    }
}