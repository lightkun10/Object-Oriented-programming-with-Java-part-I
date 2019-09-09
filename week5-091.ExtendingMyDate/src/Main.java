public class Main {
    public static void main(String[] args) throws Exception {
        MyDate someday = new MyDate(29, 12, 2011);
        System.out.println(someday);

        someday.advance(); // 30.12.2011
        System.out.println(someday);
        someday.advance(); // 1.1.2012
        System.out.println(someday);

        MyDate otherDay = new MyDate(29, 12, 2011);
        System.out.println(otherDay);

        otherDay.advance(5);
        System.out.println(otherDay);

        MyDate day = new MyDate(25, 2, 2011);
        MyDate newDate = day.afterNumberOfDays(7);

        for (int i = 1; i <= 7; i++) {
            System.out.println("Friday after  " + i + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
        }
        System.out.println("This week's Friday is " + day);
        System.out.println("The date 790 days from this week's Friday is  " + day.afterNumberOfDays(790));
    }
}