import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;

        for (int newList : list) {
            sum += newList;
        }

        return sum;
    }

    // Copy here average from exercise 64
    public static double average(ArrayList<Integer> list) {
        double sum = sum(list);
        double size = list.size();

        return (double) sum / size;
    }

    public static double variance(ArrayList<Integer> list) {
        // already got the sample data set in ArrayList

        // search the sample mean/average of data set/ArrayList
        // https://www.wikihow.com/Calculate-Variance

        // do the first portion of the formula
        double sum = 0;
        double sampleMean = average(list);

        for (int newList : list) {
            sum += Math.pow((newList - sampleMean), 2);
        }

        // do the second portion of the formula
        return sum / (list.size() - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
