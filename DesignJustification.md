My game design includes GameObject, Character, Location, Map, Book, GameLoop, and GameInterface classes. They work together to create a text-based interface that allows a user to interact with the game, navigating through the Map and collecting Books. An alternative that I considered in my design was removing the GameObject class. Even though a lot of my classes inherit from GameObject, it would be easy enough to include name and description attribtutes, the main elements that other classes took from GameObject, to each individual class. However, I decided to stick with GameObject as a class, as it allowed most elements of the game to start with those basic elements that I needed the classes to have.

- What was your **overall approach** to tackling this project?
 Once I got started, my overall approach was to break the project into small chunks and get them working. Each step made a new part of the game start functioning and got closer to having a fully functioning game. My first goal was to make it so that a player could navigate through a map, which required creating the character and map, as well as an interface that a user could interact with. After that I slowly added other features to create the objects the player would need to find and set up the win condition.

 - What **new thing(s)** did you learn / figure out in completing this project?
 The biggest new thing I figured out in completing this project was how to implement a map. When I started, I had no idea how I was going to make a user navigate through different spaces. I also had to figure out how I was going to store the player's location: would the Character know its location? Would the location hold the Character in its contents? I had to experiment before I settled on a grid system where each location has coordinates that the Character can move throughout.

 - Is there anything that you wish you had **implemented differently**?
 I would have liked to experiment more with my map structure to make it as efficient as possible. If I were to work more on this, I might try using Guava to create a new kind of map. 

 - If you had **unlimited time**, what additional features would you implement?
 There are a number of other features I would like to implement. First, I would like to be able to initialize my Locations, Character, etc through a text file that the GameInterface would read instead of by hard coding them into the interface. Another feature I would like to add is the ability to scramble which Location the Books are in for each game play so that game play changes more each time. Finally, I would like to implement more obstacles that remove a player's health points as they encounter them, creating a way for the player to lose the game if they run out of health points. 

 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?
 The most helpful piece of advice I received while working on this project came from Ellie Zdancewic and Emily Middleton(I believe that's the correct last name) at the very beginning of working on it. Before I had written any of my code, I was able to talk througb what I should implement first with them, and we deciced that I should start with my Character and Location classes so I could make a player navigate through my game. That's ultimately what I did, and it was a good way to get started.

 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?
 The first piece of advice I would give my past self is to just start and start small. I was nervous to get started because I didn't know how I was going to implement some aspects of the game, so I held back on starting. Ultimately, I realized that just getting a small piece working made it much easier to see how to take the next steps. Thus, my biggest piece of advice is just to start and get something working.
 
 - _If you worked with a team:_ please comment on how your **team dynamics** influenced your experience working on this project.
 N/A

