This file will contain documentation for all commands available in your game.

Note:  It's a good idea to also make this list available inside the game, in response to a `HELP` command.

WALK [NORTH, SOUTH, EAST, WEST]: Allows a player to navigate throughout the map. "WALK" in a direction changes the players coordinates to move them into the adjacent location in that direction.

LOOK AROUND: Tells the player what objects are in their location that they can grab.

GRAB [OBJECT]: Lets a player grab an object if it is in the same location they are in. Adds the object to the player's inventory and removes it from the contents of the location.

DROP [OBJECT]: Lets a play drop an object if it is in their inventory. Removes the object from their inventory and adds the object to the contents of the location they are in.

CHECK INVENTORY: Prints a list of the contents of a player's inventory.

HELP: Prints a list of available commands.

# SPOILER ALERT

If your game includes challenges that must be overcome to win, also list them below.

To win, the player must find and grab three books that are scattered throughout the map and drop them in the cottage. The books are in the locations Forest (0, 10), Field of flowers (0, 5), and Waterfall (10, 0). In order to access the Waterfall location, the player must first obtain a swimming spell. To do this, they must find and grab the spellbook, which is located in the Forest (0, 10). Map layout is included as an image in a separate file (Game Map Layout.jpg).
