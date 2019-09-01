package app;

import java.util.Random;

public class Dice {
  // OBJECT VARIABLES .. FIELDS
  private Random random = new Random();
  private int numberOfSides;

  // OBJECT CONSTRUCTOR
  public Dice(int numberOfSides) {
    // Initialize here the number of sides
    this.numberOfSides = numberOfSides;
    random = new Random();
  }

  public int roll() {
    // create here a random number belonging to range 1-numberOfSided
    return random.nextInt(this.numberOfSides) + 1;
  }
}

// get the length