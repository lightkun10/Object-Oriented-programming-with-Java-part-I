import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        // add the input word into the array until the input is zero
        while (true) {
            // make the prompt for user input
            System.out.print("Type a word: \n");
            // add the input word to the array
            String input = reader.nextLine();

            if (input.isEmpty()) {
                Collections.reverse(words);
                System.out.println("You typed the following words: ");
                for (String newWord : words) {
                    System.out.println(newWord);
                }
                break;
            }
            words.add(input);
        }

    }
}
