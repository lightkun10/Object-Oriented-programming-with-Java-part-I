import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("\nTop 25 by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("\n");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("\n");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("\n");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
