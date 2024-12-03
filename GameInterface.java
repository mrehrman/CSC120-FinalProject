public class GameInterface{

    public static void main(String[] args) {

        //initiate protagonist
        Character protagonist = new Character("Protagonist", "You are exploring the enchanted forest.", 7.5, 7.5);
        System.out.println(protagonist.description);
 
        //create map
        GameMap gameMap = new GameMap();
        Location waterfall = new Location("Waterfall", "There is a large waterfall in front of you.", 2.5, 7.5);
        Location cottage = new Location("Cottage", "You are inside of a small wooden cottage. \n You can smell cookies baking and see a cozy fire burning in the fireplace.", 7.5, 7.5);
        Location forest1 = new Location("Forest", "You are in the forest. There are tall trees around. The sun shines through the trees.", 12.75, 7.5);
        Location forest2 = new Location("Forest on east edge of the map", "You are in the forest. You cannot move any farther east.", 17.5, 7.5);
        gameMap.addLocation(waterfall);
        gameMap.addLocation(cottage);
        gameMap.addLocation(forest1);
        gameMap.addLocation(forest2);
        System.out.println(gameMap);

        GameLoop playGame = new GameLoop();
        playGame.loop(protagonist);
        
    }
}