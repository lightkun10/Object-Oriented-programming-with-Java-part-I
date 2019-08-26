
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;

        // using for-each
        for (int l : list) {
            sum += l;
        }

        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double sum = sum(list);
        double size = list.size();

        // double average = ((double) sum(list) / list.size());

        // return sum(list) / list.size();
        return (double) sum / size;
        // return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
