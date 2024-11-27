import java.util.Scanner;

public class GameLoop{

    protected boolean playing;
    Scanner userInput;
    String userResponse;

    /**
     * Constructor
     */
    public GameLoop(){
        this.playing = true;
        this.userInput = new Scanner(System.in);
        this.userResponse = "";
    }

    /**
     * Splits response from user into a list of individual words
     * @param response
     * @return
     */
    public String[] splitResponseString(String response){
        String[] words = response.split(" ");
        return words;
    }

    /**
     * Loops through the game
     */
    public void loop(){
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
        
        //loop
        System.out.println("Welcome to the library. Your task is to retrieve the stolen books.");
        System.out.println("Enter anything to play. You can move 'NORTH, SOUTH, EAST, or WEST.' \n Enter 'QUIT' to exit the game.");
        while (this.playing) {
            System.out.println("What would you like to do?");
            this.userResponse = this.userInput.nextLine();
            if (this.userResponse.toUpperCase().equals("QUIT")){ //check if user wants to quit game
                this.playing = false;
                System.out.println("You have quit the game.");
            } else{
                this.playing = true;
                if (this.userResponse.equalsIgnoreCase("north") || this.userResponse.equalsIgnoreCase("south") || this.userResponse.equalsIgnoreCase("east") || this.userResponse.equalsIgnoreCase("west")){ //check if user wants to move
                    protagonist.move(this.userResponse);
                    System.out.println(protagonist.x);
                    System.out.println(protagonist.y);
                    
                }
            }
        }
        this.userInput.close();  
    }

}