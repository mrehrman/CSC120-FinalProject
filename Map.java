/**
 * Creates a map that contains Locations.
 */
public class Map{
    
    Location[] locations;
    int size;

    /**
     * Constructor
     * @param numLocations the Number of Locations the Map contains.
     */
    public Map(int numLocations){
        this.locations = new Location[numLocations];
        this.size = numLocations;
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

    public static void main(String[] args) {
        // Map gameMap = new Map();
        // Location waterfall = new Location("Waterfall", "There is a large waterfall in front of you.", 2.5, 7.5);
        // Location cottage = new Location("Cottage", "You are inside of a small wooden cottage. \n You can smell cookies baking and see a cozy fire burning in the fireplace.", 7.5, 7.5);
        // Location forest1 = new Location("Forest", "You are in the forest. There are tall trees around. The sun shines through the trees.", 12.75, 7.5);
        // Location forest2 = new Location("Forest on east edge of the map", "You are in the forest. You cannot move any farther east.", 17.5, 7.5);
        // gameMap.addLocation(waterfall);
        // gameMap.addLocation(cottage);
        // gameMap.addLocation(forest1);
        // gameMap.addLocation(forest2);


    }
}