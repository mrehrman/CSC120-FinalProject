public class GameInterface{

    public static void main(String[] args) {

        //initiate protagonist
         //create map
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
 
         //initiate protagonist
         Character protagonist = new Character("Protagonist", "You are exploring the enchanted forest.", 0, 0                                                     );
         System.out.println(protagonist.description);
 
         GameLoop myGame = new GameLoop();
         myGame.loop(protagonist, gameMap);
        
    }
}