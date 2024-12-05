public class GameInterface{

    public static void main(String[] args) {

        //initiate protagonist
        Character protagonist = new Character("Protagonist", "You are exploring the enchanted forest.", 0, 0);
        System.out.println(protagonist.description);
 
        //create map
        Map gameMap = new Map(4);
        Location waterfall = new Location("Waterfall", "There is a large waterfall in front of you.", 0, 0);
        Location cottage = new Location("Cottage", "You are inside of a small wooden cottage. \n You can smell cookies baking and see a cozy fire burning in the fireplace.", 10, 10);
        Location forest1 = new Location("Forest", "You are in the forest. There are tall trees around. The sun shines through the trees.", 15, 10);
        Location forest2 = new Location("Forest on east edge of the map", "You are in the forest. You cannot move any farther east.", 15, 5);
        gameMap.addLocation(waterfall, 0);
        gameMap.addLocation(cottage, 1);
        gameMap.addLocation(forest1, 2);
        gameMap.addLocation(forest2, 3);
        System.out.println(gameMap);

        GameLoop playGame = new GameLoop();
        playGame.loop(protagonist, gameMap);
        
    }
}