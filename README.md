Inheritance Exploration
=======================

For this exploration, create the GitHub project using the GitHub Classroom link under the Inheritance Exploration tab in OneNote.

Our Story
---------

A zoo hires you to write software to help model their animals. Their previous programmer started writing some of the code for you, but was eaten by a lion before he could finish.

Before you begin the exploration, ensure the following classes exist, in their own files:

```Java
public class Exploration
{
    public static void main(String[] args)
    {
    }
}

public class Bird
{
    public void fly()
    {
        System.out.println(“The bird flies”);
    }

    public void layEgg()
    {
        System.out.println(“The bird layed an egg.”);
    }

    public void doStuff()
    {
        System.out.println(“Doing some stuff...”);
        fly();
        layEgg();
    }
}
```

Note that you will be writing the code for the exploration in the main() method, unless otherwise specified.
 
Exercises
---------

1.  Create a new Bird object. Make it fly, lay an egg, and do stuff. What happens?

2.  Create a new Penguin class in a new file. Make a penguin object in the main method.

3.  As we know, penguins should be able to lay eggs. Try calling .layEgg() on your penguin object. What happens?

4.  Think back to the discussions we’ve had in class. The Penguin and Bird classes have an is-a relationship. What does that mean? 

5.  We’re going to give our Penguin class this relationship to the Bird class. Change the definition of the Penguin class to read `public class Penguin extends Bird`.

    What do you think this might mean?

6.  Go back to your main method, and look at where you called `layEgg()` on your penguin object. Now does it compile?

7.  Run your code. What happens when you call `layEgg()` on the penguin object?

8.  You’re calling the `layEgg()` method on the penguin object, yet the Penguin class doesn’t have a `layEgg()` method. Where is it “getting” this method? What code is actually being run?

9.  Don’t type any code! Do you think we could make the penguin object fly and do stuff now?

10. Write code to test your answer to number 9. What happens? Does it agree with your answer?

11. When you have the penguin fly, what does it say? Do these accurately reflect the characteristics of a penguin?

12. So now we’re going to fix this problem. Add a `fly()` method to the Penguin class that prints out an accurate message for penguins.

13. What happens when you call `fly()` on your penguin object?

14. What happens when you call `fly()` on your bird object?

15. Call `doStuff()` on your penguin object. Which fly message is printed out? Which `fly()` method is being called?

16. Call `doStuff()` on your bird object. Which fly message is printed out? Which `fly()` method is being called?

17. Add a method called `swim()` to the Penguin class that prints out “The penguin swim.” What do you think would happen if you called `swim()` on the bird object?

18. Write code to test your answer to number 17. Does it agree with your answer?

19. Now we want to make the penguin’s `doStuff()` method call the `swim()` method. Add a `doStuff()` method to the Penguin class that prints out exactly the same as the Bird class’s `doStuff()` method and then calls `swim()` at the end.

20. This solution works, but it doesn’t model what we want it to very well. We want the penguin to do everything that a bird does, and then a little bit more. We can access methods of the super class by calling `super.methodName()`. In this case, we could call `super.doStuff()` to call the Bird class’s doStuff method.

    Refactor the Penguin’s `doStuff()` to use the super call.

21. Create a new class called Animal. Add an `eats()` method to the class which prints “The animal eats.” Create a relationship between the Animal and Bird classes so that a Bird is an Animal.

22. Call `eat()` on your bird and penguin objects. What happens?

23. Add a happy `boolean` variable to the Bird class. A bird should start off unhappy, become happy when it flies, and become unhappy when it tries to swim.

24. In your Penguin class, try to change it so that a penguin becomes unhappy when it tries to fly, and becomes happy when it swims.

    What happens?

25. Change the field declaration in the Bird class from `private boolean happy;` to `protected boolean happy;`. 

26. What happened in the Penguin class? Based on this experiment, can a subclass access a field in a super class if it is private? What does `protected` mean?
 
Problems
--------
1.  Create a Player class (in the same package). A player should start with 10 life, and contain two methods: `damage()` and `checkDeath()`. The `damage()` method takes one life away from the player (the player can have negative life). The `checkDeath()` method should check if the player is dead (less than one life left), and return true if the player is dead or false if the player is not dead.

    Create a second class called WeakPlayer. WeakPlayer should inherit from Player. Override the WeakPlayer’s `damage()` method so that a player loses two life instead of one when damaged. 

    Include in your code a `main()` method which creates a Player object, damages it until it is dead, and prints “The Player is dead.” Then create a WeakPplayer object, damage it until it is dead, and print “The WeakPlayer is dead.”

2.  Create a Weapon class. Its constructor should take no parameters and store a strength variable, which is the amount of damage that it does to a player in one hit. The strength should be a random integer between 1 and 5, inclusive. Create a method called `hitPlayer()`, which takes a Player object and deals it strength damage.

    Create another class called ObnoxiousSword. ObnoxiousSword should extend the Weapon class. ObnoxiousSword overrides the `hitPlayer()` method, which calls the super class’s version of hitPlayer, and then prints some sort of obnoxious message to the console.
