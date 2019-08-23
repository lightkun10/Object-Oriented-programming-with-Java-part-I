import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String input = reader.nextLine();

        int countdownReverse = input.length() - 1;
        int countdown = 0;
        int inputLength = input.length();
        String reverse = "";
        while (countdown < inputLength) {
            reverse += input.charAt(countdownReverse);
            countdown++;
            countdownReverse--;
        }
        System.out.print("In reverse order: " + reverse);
    }
}
