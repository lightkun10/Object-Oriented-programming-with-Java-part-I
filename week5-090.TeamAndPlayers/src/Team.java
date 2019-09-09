import java.util.ArrayList;

public class Team {
  private String teamName;
  private ArrayList<Player> listOfPlayer = new ArrayList<Player>();
  private int teamMaxSize = 16;

  // OBJECT CONSTRUCTOR
  public Team(String teamName) {
    this.teamName = teamName;
  }

  public String getName() {
    return this.teamName;
  }

  public void addPlayer(Player newPlayer) {
    if (listOfPlayer.size() < teamMaxSize) {
      listOfPlayer.add(newPlayer);
    }
  }

  public void printPlayers() {
    // do the for each
    for (Player player : listOfPlayer) {
      System.out.println(player);
    }
  }

  public void setMaxSize(int teamMaxSize) {
    this.teamMaxSize = teamMaxSize;
  }

  public int size() {
    return listOfPlayer.size();
  }

  public int goals() {
    int totalGoalsOfAllPlayerInTeam = 0;
    for (Player player : listOfPlayer) {
      totalGoalsOfAllPlayerInTeam += player.goals();
    }

    return totalGoalsOfAllPlayerInTeam;
  }

}