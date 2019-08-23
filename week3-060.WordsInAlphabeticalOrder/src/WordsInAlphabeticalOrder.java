
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String input = reader.nextLine();

            if (input.isEmpty()) {
                Collections.sort(words);
                System.out.println();
                System.out.println("You typed the following words: ");
                for (String sortedWord : words) {
                    System.out.println(sortedWord);
                }
                System.out.println();
                break;
            }

            // add the input to the Array
            words.add(input);
        }
    }
}
