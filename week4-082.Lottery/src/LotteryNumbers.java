import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        Random random = new Random();

        int drawLimit = 7;
        // create temporary "jar" to filter
        int draw = 0;
        while (this.numbers.size() < drawLimit) {
            draw = random.nextInt(40);
            if (draw > 0 && !containsNumber(draw) /* !this.numbers.contains(number) */) {
                this.numbers.add(draw);
            }
        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);
        // return TRUE if the OBJECT VARIABLES contains int parameter
    }
}