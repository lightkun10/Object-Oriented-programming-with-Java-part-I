
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // make a prompt for the word
        System.out.print("Type a word: ");
        String word = reader.nextLine();

        // ask for the length of the part of word
        System.out.print("Length of the first part: ");
        int firstPart = Integer.parseInt(reader.nextLine());

        String result = word.substring(0, firstPart);
        System.out.println("Result: " + result);
    }
}
