
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        System.out.println("Please input radius number");
        int radius = Integer.parseInt(reader.nextLine());
        System.out.println("Type of radius: " + radius);
        System.out.println("\nCircumference of the circle: " + (2 * Math.PI * radius));
    }
}
