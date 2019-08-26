import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {

    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
        // loop through the second/list2
        for (int eachItemInSecond : second) {
            // check if the first/list1 contains each item on the list2
            if (!first.contains(eachItemInSecond)) {
                // if yes, don't pass
                // if no, pass the value to the list1
                first.add(eachItemInSecond);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
        // System.out.println(list1.get(7));
    }

}
