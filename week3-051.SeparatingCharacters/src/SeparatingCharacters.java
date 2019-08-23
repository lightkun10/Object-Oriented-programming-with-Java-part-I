
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String input = reader.nextLine();

        int countdown = 0;
        int inputLength = input.length();
        while (countdown < inputLength) {
            System.out.println((countdown + 1) + ". character: " + input.charAt(countdown));
            countdown++;
        }
    }
}
