import java.util.ArrayList;
import java.util.Random;

public class PasswordRandomizer {
  // OBJECT VARIABLES .. FIELDS
  private Random random;
  private int length;

  // OBJECT CONSTRUCTOR
  public PasswordRandomizer(int length) {
    this.random = new Random();
    this.length = length;
  }

  // OBJECT METHOD
  public String createPassword() {
    ArrayList<String> oldString = new ArrayList<String>();

    int i = 0;
    while (i < this.length) {
      String listOfWords = "abcdefghijklmnopqrstuvwxyz";
      int length = listOfWords.length();
      char symbol = listOfWords.charAt(random.nextInt(length));
      oldString.add(Character.toString(symbol));
      i++;
    }

    String passwords = "";
    int q = 0;

    for (String password : oldString) {
      passwords += oldString.get(q);
      q++;
    }

    return passwords;
  }
}