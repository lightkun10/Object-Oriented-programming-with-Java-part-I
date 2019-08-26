import java.util.ArrayList;

public class SumOfNumbers {
    public static int sum(ArrayList<Integer> x) {
        int sumFromLoop = 0;
        for (int i = 0; i <= x.size() - 1; i++) {
            sumFromLoop += x.get(i);
        }

        return sumFromLoop;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The sum: " + sum(list));

        list.add(10);

        System.out.println("The sum: " + sum(list));
    }

}
