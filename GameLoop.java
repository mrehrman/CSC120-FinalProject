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
    public String[] split(String response){
        String[] words = response.split(" ");
        int length = words.length;
        return words;
    }

    /**
     * Loops through the game
     */
    public void loop(Character protagonist, Map map){
        
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
                protagonist.move(userResponse, map);
                // String[] words = this.split(userResponse);
                // if (this.userResponse.equalsIgnoreCase("north") || this.userResponse.equalsIgnoreCase("south") || this.userResponse.equalsIgnoreCase("east") || this.userResponse.equalsIgnoreCase("west")){ //check if user wants to move
                //     protagonist.move(this.userResponse, map);
                //     System.out.println("Move");
                // }
            }
        }
        this.userInput.close();  
    }

}