import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String input = reader.nextLine();
        // pass the input to the method, get the 1st 2nd and 3rd character
        if (input.length() > 2) {
            System.out.println("1. character: " + input.charAt(0));
            System.out.println("2. character: " + input.charAt(1));
            System.out.println("3. character: " + input.charAt(2));
        } else {
            return;
        }
    }
}
