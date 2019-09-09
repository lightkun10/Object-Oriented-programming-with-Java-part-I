public class Player {
  // OBJECT VARIABLES .. FIELDS
  private String playerName;
  private int amountOfGoals;

  // OBJECT CONSTRUCTOR
  public Player(String playerName) {
    this(playerName, 0);
  }

  public Player(String playerName, int amountOfGoals) {
    this.playerName = playerName;
    this.amountOfGoals = amountOfGoals;
  }

  // OBJECT METHODS
  public String getName() {
    return this.playerName;
  }

  public int goals() {
    return this.amountOfGoals;
  }

  public String toString() {
    return this.playerName + ", goals: " + this.amountOfGoals;
  }
}