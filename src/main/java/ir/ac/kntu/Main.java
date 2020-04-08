package ir.ac.kntu;

import ir.ac.kntu.maputil.MapUtil;
import ir.ac.kntu.maputil.Tour;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Leader> leaders = new ArrayList<Leader>();
    static Leader leader = new Leader();
    static ArrayList<Tour> tours = new ArrayList<Tour>();
    static Tour tour = new Tour();
    static void menu() {
        System.out.println("\n\n\n\n                   Hello!\n        -------------------------------");
        System.out.println("    Welcome to our tour management program!");
        System.out.println(" _____________________________________________\n" +
                "|                                             |\n" +
                "|                                             |\n" +
                "|   ■ Enter 1 to see leaders menu             |\n" +
                "|   ■ Enter 2 to see tours menu               |\n" +
                "|   ■ Enter 3 for the map features            |\n" +
                "|                                             |\n" +
                "|                                             |\n" +
                "|                                             |\n" +
                " ---------------------------------------------");
        int in = sc.nextInt();
        switch (in) {
            case 1:
                leader.leadersMenu(leaders);
                break;
            case 2:
                Tour.toursMenu(tours);
                break;
            case 3:
                System.out.println("\nEnter 1 for see one specific location on map\nEnter 2 for see two location and their details");
                int in3 = sc.nextInt();
                switch (in3) {
                    case 1:
                        System.out.println("\nEnter the city or region you want to see on map :");
                        String inputLoc = sc.next();
                        MapUtil.showMap(inputLoc);
                        break;
                    case 2:
                        System.out.println("\nEnter the location where you start from :");
                        String startLoc = sc.next();
                        System.out.println("\nEnter the destination's location :");
                        String destination = sc.next();
                        MapUtil.showMap(startLoc,destination);
                        break;
                }
                break;
        }
    }

    public static void main(String[] args) {

        while (true) {
            menu();
        }
    }
}
