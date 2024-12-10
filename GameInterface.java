/**
 * Runs the game with information provided in main. Next goal: instead of initializing variables in main, put the information into a text file for GameInterface to read.
 */
public class GameInterface{

    /**
     * Initializes the variables needed to run a GameLoop and runs a GameLoop with those variables.
     * @param args
     */

    public static void main(String[] args) {

        //initialize GameObject books
        Book book1 = new Book("spellbook", "A book bound in a bright blue material. Large cursive script on the front reads 'Spell Book'", true);
        Book book2 = new Book("cookbook", "A silver book with elaborate red detailing on the spine. The front says 'Cook Book'", false);
        Book book3 = new Book("fairytales", "A book with a dark green spine and brown cover that says 'Fairytales'", false);

        //initialize Map, initiate Locations, add GameObjects to Locations, add Locations to Map
        //goal: make Map more robust with more locations
        Map gameMap = new Map(9, 10, 0, 10, 0);
        Location forest1 = new Location("forest", "You are in the forest. There are tall trees all around you. \n There is a small clearing in front of you with a large rock in it.", 0, 10, false);
        forest1.addObject(book1);
        gameMap.addLocation(forest1, 0);
        Location forest2 = new Location("forest", "You are in the forest. The trees block the light, so it is quite dark. \n There is a small path heading east and west.", 5, 10, false);
        gameMap.addLocation(forest2, 1);
        Location forest3 = new Location("forest", "You are in the forest.", 10, 10, false);
        gameMap.addLocation(forest3, 2);
        Location field = new Location("field of flowers", "You are in a field full of flowers in every color of the rainbow. \n A small patch of flowers are shimmering.", 0, 5, false);
        gameMap.addLocation(field, 3);
        field.addObject(book2);
        Location cottage = new Location("cottage", "You are at the cottage.", 5, 5, false);
        gameMap.addLocation(cottage, 4);
        Location forest4 = new Location("mountains", "You are at the base of a mountain. It is extremely rocky. You can hear rushing water nearby.", 10, 5, false);
        gameMap.addLocation(forest4, 5);
        Location forest5 = new Location("forest", "You are in the forest.", 0, 0, false);
        gameMap.addLocation(forest5, 6);
        Location forest6 = new Location("forest", "You are in the forest. You can hear birds chirping and water rushing nearby.", 5, 0, false);
        gameMap.addLocation(forest6, 7);
        Location waterfall = new Location("waterfall", "You are in front of a waterfall. At the base of the waterfall is a pool of water with a large rock in the middle.", 10 , 0, true);
        gameMap.addLocation(waterfall, 8);
        waterfall.addObject(book3);
 
        //initialize Character protagonist
        Character protagonist = new Character("Protagonist", "You are exploring the enchanted forest.", 5, 5, cottage);

        //initialize String variables for the various messages required by GameLoop
        String gamePremise = "You have been exploring an enchanted forest and gotten lost wandering through the trees. \n You just came across a small cottage. It has ivy climbing up the sides and lights twinkling in the windows. \n You knock on the door and an older woman answers. She greets you kindly, but she appears frazzled. \n When you explain that you're lost, she tells you that she's in a pickle too. \n 'I have a beautiful library in my home, and three of my most precious books have been stolen,' she says. \n 'One of them includes a spell to guide a wanderer home--it would be of great help to you. Can you bring the books back to me?'";
        String quest = "help collect the three lost books. \n Bring them back to the cottage and the old woman will help you find a spell to lead you home.";
        String winMessage = "You win! You delivered all of the stolen books back to the cottage and a spell in the Spell Book will guide you home.";

        //initialize a new GameLoop
        GameLoop myGame = new GameLoop();

        //run GameLoop with variables initialized above
        myGame.loop(protagonist, gameMap, cottage, book1, book2, book3, gamePremise, quest, winMessage);
        
    }
}