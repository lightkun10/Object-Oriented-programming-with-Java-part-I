package app;

public class App {
    public static void main(String[] args) throws Exception {
        Dice dice = new Dice(6);

        int i = 0;
        while (i < 10) {
            System.out.println(dice.roll());
            i++;
        }
    }
}