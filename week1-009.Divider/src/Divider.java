
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("Type a number: " + number);
        System.out.println("Type another number: ");
        int otherNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: " + otherNumber);
        System.out.println("Division: " + number + " / " + otherNumber + " = " + ((double)number / otherNumber));
    }
}
