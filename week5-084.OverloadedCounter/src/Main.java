public class Main {
    public static void main(String[] args) {
        Counter test = new Counter(1, true);
        Counter test2 = new Counter(900, false);
        Counter test3 = new Counter(2, false);
        Counter test4 = new Counter(2, true);
        Counter test5 = new Counter(true);
        Counter test6 = new Counter(200, true);

        test4.decrease(4);
        System.out.println(test4.value());

        test6.decrease(220);
        System.out.println(test6.value());
    }
}
