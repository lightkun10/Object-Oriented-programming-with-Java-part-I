import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.print("Type a word: ");
        String word = reader.nextLine();

        while (true) {
            if (word.isEmpty()) {
                System.out.println("You typed the following words: ");
                for (String newWords : words) {
                    System.out.println(newWords);
                }
                break;
            } else {
                words.add(word);
                System.out.print("Type a word: ");
                word = reader.nextLine();
            }
        }
    }
}
