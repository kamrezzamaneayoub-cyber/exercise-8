# Exercise 8 - Packages and Interfaces

For Task 2, I added three interfaces to the animal project from lab 5.

- **Sleeping.** `AnimalBehavior` declares `sleep()`. Each animal that implements it describes how it sleeps. Buddy the dog curls up, and Pablo the pigeon sleeps on a perch.
- **Moving.** `AnimalMove` gives animals a default `move()` method. A bird uses that default and prints `Bird moves.` A pigeon overrides it and prints `Pigeon flies.` The loop calls `animal.move()` the same way for both.
- **Printing names.** `name(String)` is static, so the loop calls it directly on the interface with `AnimalName.name(animal.getName())`. For Buddy, that prints `Animal name: Buddy`.

## Running the program

In IntelliJ, open `src/Animal/java/Animal.java` and click the green arrow beside the `main` method. To run it from a terminal, use these commands in the project folder with a JDK installed:

```sh
javac -d out -sourcepath src src/Animal/java/Animal.java
java -cp out Animal.java.Main
```
