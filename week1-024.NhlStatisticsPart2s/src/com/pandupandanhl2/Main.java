package com.pandupandanhl2;
import nhlstats.NHLStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");
        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
            } else if (command.equals("player")) {
                System.out.println("Please enter the player's name");
                String player = reader.nextLine();
                NHLStatistics.searchByPlayer(player);
            } else if (command.equals("club")) {
                System.out.println("Please enter the club abbreviation");
                String club = reader.nextLine();
                NHLStatistics.sortByPoints();
                NHLStatistics.teamStatistics(club);
            }
        }
    }
}
