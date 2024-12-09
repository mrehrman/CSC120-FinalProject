import java.util.Scanner;

/**
 * Creates a loop that allows a user to interact with the game by comparing user responses to possible actions.
 */
public class GameLoop{

    protected boolean playing; //true if the user is still playing the game, false if the user quits the game
    protected Scanner userInput; //takes user responses to allow user to interact with the game
    protected String userResponse; //holds the latest user response
    protected boolean win; //false if the user has not yet won, true if the user has won the game

    /**
     * Constructor. Sets all attributes to default values.
     */
    public GameLoop(){
        this.playing = true;
        this.userInput = new Scanner(System.in);
        this.userResponse = "";
        this.win = false;
    }

    /**
     * Splits response from user into a list of individual words.
     * @param response The user's response.
     * @return The user's response split into a String[] of individual words.
     */
    public String[] split(String response){
        String[] words = response.split(" ");
        return words;
    }

    /**
     * Loops through the game
     * @param protagonist The Character that the user is playing the game as.
     * @param map The Map that the user navigates through.
     * @param win The Location that the user must drop 3 GameObjects in to win.
     * @param object1 One of the GameObjects that the user needs to drop in a specified Location to win.
     * @param object2 One of the GameObjects that the user needs to drop in a specified Location to win.
     * @param object3 One of the GameObjects that the user needs to drop in a specified Location to win.
     * @param gamePremise The premise of the game, prints at the beginning of the game.
     * @param quest The goal of the game, prints near the beginning of the game.
     * @param winMessage The message that prints when the user wins the game (when win == true).
     */
    public void loop(Character protagonist, Map map, Location win, GameObject object1, GameObject object2, GameObject object3, String gamePremise, String quest, String winMessage){
        
        //print opening game messages
        System.out.println("*********************************************************************************");
        System.out.println(gamePremise);
        System.out.println("Enter a command to accept your quest and " + quest + " \n Enter 'QUIT' to exit the game. You can 'WALK [NORTH, SOUTH, EAST, WEST]', 'LOOK AROUND', 'GRAB [OBJECT]', or 'DROP [OBJECT].'");
        //start loop, continues while the user is still playing
        while (this.playing) {
            while (this.win == false & this.playing == true){
                this.userResponse = this.userInput.nextLine(); //get next user interaction
                //check if user wants to quit the game
                if (this.userResponse.toUpperCase().equals("QUIT")){
                    this.playing = false;
                    System.out.println("You have quit the game.");
                } else {
                    this.playing = true;
                    //split user response into individual words
                    String[] words = this.split(userResponse); 
                    int length = words.length;
                    //loop through the user's words to see if they correspond to a game command
                    //goal: add error checking for when the user's response does not contain any valid command
                    for (int i = 0; i < length; i++){ 
                        //check if user wants to move
                        if (words[i].equalsIgnoreCase("north") || words[i].equalsIgnoreCase("south") || words[i].equalsIgnoreCase("east") || words[i].equalsIgnoreCase("west")){
                            try{
                                protagonist.walk(words[i], map);
                            } catch(RuntimeException e){
                                System.out.println(e);
                            }
                        //check if user wants to look around
                        } else if (words[i].equalsIgnoreCase("look")){
                            protagonist.lookAround();
                        //check if user wants to grab an object
                        } else if (words[i].equalsIgnoreCase("grab")){
                            try{
                                for (int a = 1; a < length; a++){
                                    GameObject object = protagonist.location.checkContents(words[a]);
                                    protagonist.grab(object);
                                    }
                            } catch(RuntimeException e){
                                System.out.println(e);
                            }
                        //check if user wants to drop an object
                        } else if (words[i].equalsIgnoreCase("drop")){
                            for (int b = 1; b < length; b ++){
                                try{
                                    GameObject item = protagonist.checkInventory(words[b]);
                                    protagonist.drop(item);
                                } catch(RuntimeException e){
                                    System.out.println(e);
                                }
                            } //check if dropping an object has fulfilled the win condition
                            if (win.contents.contains(object1) & win.contents.contains(object2) & win.contents.contains(object3)){
                                this.win = true;
                                this.playing = false;
                            }
                        }
                    }   
                }
                }
            }   
            this.userInput.close(); 
            //print win message if the user has won
            if (this.win){
                System.out.println(winMessage);
            }
        }
    

    public static void main(String[] args) {
   
    
    }

}