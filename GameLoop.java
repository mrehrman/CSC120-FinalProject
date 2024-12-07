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
        return words;
    }

    /**
     * Loops through the game
     */
    public void loop(Character protagonist, Map map){
        
        System.out.println("You have been exploring an enchanted forest and gotten lost wandering through the trees. \n You just came across a small cottage. It has ivy climbing up the sides and lights twinkling in the windows. \n You knock on the door and an older woman answers. She greets you kindly, but she appears frazzled. \n When you explain that you're lost, she tells you that she's in a pickle too. \n 'I have a beautiful library in my home, and three of my most precious books have been stolen,' she says. \n 'One of them includes a spell to guide a wanderer home--it would be of great help to you. Can you help me find the books?'");
        System.out.println("Enter a command to accept your quest and help collect the three lost books. Enter 'QUIT' to exit the game. \n You can 'WALK NORTH, SOUTH, EAST, or WEST,' 'LOOK AROUND,' GRAB,' or 'DROP.'");
        while (this.playing) {
            System.out.println("What would you like to do?");
            this.userResponse = this.userInput.nextLine();
            if (this.userResponse.toUpperCase().equals("QUIT")){ //check if user wants to quit game
                this.playing = false;
                System.out.println("You have quit the game.");
            } else{
                this.playing = true;
                String[] words = this.split(userResponse); //split user response into individual words
                int length = words.length;
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
                    //check if user wants to pick up an object
                    } else if (words[i].equalsIgnoreCase("grab")){
                        try{
                            for (int a = 1; a < length; a++){
                                GameObject object = protagonist.location.checkContents(words[a]);
                                protagonist.grab(object);
                            }
                        } catch(RuntimeException e){
                            System.out.println(e);
                        }
                                //System.out.println(object.name);
                            }
                                //int a = 1; a < length; a++){
                                   // Location currentLocation = protagonist.location;
                                    //System.out.println(words[a]);
                                    // GameObject object = currentLocation.checkContents(word);
                        //             // System.out.println(object.name);
                        //             //protagonist.grab(object);
                        //     } 
                        // } catch(RuntimeException e){
                        //     System.out.println(e);
                        // }
                    //check if user wants to drop an object
                    // } else if (words[i].equalsIgnoreCase("drop")){
                    //     for (int b = 1; b < length; b ++){
                    //         GameObject item = protagonist.checkInventory(words[b]);
                    //         protagonist.drop(item);
                    //     }
                    // }
                }
                //throw new RuntimeException("You cannot perform that action. Enter a new command. \n You can 'WALK NORTH, SOUTH, EAST, or WEST,' 'LOOK AROUND,' GRAB,' or 'DROP'");
                
            }
        }
        this.userInput.close();  
    }

    public static void main(String[] args) {
   
    
    }

}