import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // 1. ask the word
        System.out.print("Type a word: ");
        String word = reader.nextLine();

        // 2. ask for the length of the end part
        System.out.print("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());

        // 3. Print the end part from the word
        // get the length total of the word
        int lengthWord = word.length();
        // cut the word from the length total
        String resultLength = word.substring(lengthWord - length);
        // print the result
        System.out.println("Result: " + resultLength);
    }
}
