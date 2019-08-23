
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // 1. get the first word from the user
        System.out.print("Type the first word: ");
        String firstWord = reader.nextLine();

        // 2. get the second word from the user
        System.out.print("Type the second word: ");
        String secondWord = reader.nextLine();

        // 3. check if the first word contain the second word
        // I can use indexof...
        int index = firstWord.indexOf(secondWord);
        // if -1, there isn't, if 1 >, there is
        if (index == -1) {
            System.out.println("The word '" + secondWord + "' is not found in the word '" + firstWord + "'.");
        } else {
            System.out.println("The word '" + secondWord + "' is found in the word '" + firstWord + "'.");
        }
    }
}
