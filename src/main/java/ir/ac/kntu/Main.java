package ir.ac.kntu;

import ir.ac.kntu.maputil.MapUtil;
import ir.ac.kntu.maputil.Tour;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Leader> leaders = new ArrayList<Leader>();
    static Leader leader0 = new Leader();
    static ArrayList<Tour> tours = new ArrayList<Tour>();
    static ArrayList<Regions> regions = new ArrayList<Regions>();
    static Admin admin = new Admin();
    static ArrayList<Costumer> costumers = new ArrayList<Costumer>();
    static Costumer costumer = new Costumer();
    static Employee employee = new Employee();

    static void menu() {
        System.out.println("\n\n                   Hello!\n        -------------------------------");
        System.out.println("    Welcome to our tour management program!");
        System.out.println(" _____________________________________________\n" +
                "|                                             |\n" +
                "|                                             |\n" +
                "|   ■ Enter 1 if you're admin                 |\n" +
                "|   ■ Enter 2 if you're leader                |\n" +
                "|   ■ Enter 3 if you're employee              |\n" +
                "|   ■ Enter 4 if you're costumer              |\n" +
                "|                                             |\n" +
                "|                                             |\n" +
                " ---------------------------------------------");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("Enter your username :");
                String user = sc.next();
                System.out.println("Enter your password :");
                String pass = sc.next();
                if (user.equals(admin.getUserName()) && pass.equals(admin.getPassWord())) {
                    System.out.println("Successful Entrance !");
                    System.out.println("If you want to edit your information enter 1 and if not any other keys :");
                    int editable = sc.nextInt();
                    if (editable == 1) {
                        admin.editAdmin(admin);
                    } else {
                        firstMenu();
                    }
                } else {
                    System.out.println("Invalid username or password...Try again !");
                }
                break;
            case 2:
                System.out.println("Enter your username :");
                String leadUser = sc.next();
                System.out.println("Enter your password :");
                String leadPass = sc.next();
                if (leadUser.equals(leader0.getUserName()) && leadPass.equals(leader0.getPassWord())) {
                    System.out.println("Successful Entrance !");
                    System.out.println("If you want to edit your information enter 1 and if not any other keys :");
                    int editable = sc.nextInt();
                    if (editable == 1) {
                        leader0.editLeader(leader0);
                    } else {
                        secondMenu();
                    }
                } else {
                    System.out.println("Invalid username or password...Try again !");
                }
                break;
            case 3:
                System.out.println("Enter your username :");
                String emUser = sc.next();
                System.out.println("Enter your password :");
                String emPass = sc.next();
                if (emUser.equals(employee.getUserName()) && emPass.equals(employee.getPassWord())) {
                    System.out.println("Successful Entrance !");
                    System.out.println("If you want to edit your information enter 1 and if not any other keys :");
                    int editable = sc.nextInt();
                    if (editable == 1) {
                        employee.editEmployee(employee);
                    } else {
                        thirdMenu();
                    }
                } else {
                    System.out.println("Invalid username or password...Try again !");
                }
                break;
            case 4:
                System.out.println("Enter your username :");
                String cosUser = sc.next();
                System.out.println("Enter your password :");
                String cosPass = sc.next();
                if (cosUser.equals(costumer.getUserName()) && cosPass.equals(costumer.getPassWord())) {
                    System.out.println("Successful Entrance !");
                    System.out.println("If you want to edit your information enter 1 and if not any other keys :");
                    int editable = sc.nextInt();
                    if (editable == 1) {
                        costumer.editCostumer(costumer);
                    } else {
                        fourthMenu();
                    }
                } else {
                    System.out.println("Invalid username or password...Try again !");
                }
                break;

        }

    }

    static void firstMenu() {
        while (true) {
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
                    leader0.leadersMenu(leaders);
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
    }

    static void secondMenu() {
        while (true) {
            System.out.println(" _____________________________________________\n" +
                    "|                                             |\n" +
                    "|                                             |\n" +
                    "|   ■ Enter 1 to see leaders menu             |\n" +
                    "|   ■ Enter 2 to see tours menu               |\n" +
                    "|   ■ Enter 3 for the map features            |\n" +
                    "|   ■ Enter 4 to add a costumer               |\n" +
                    "|                                             |\n" +
                    "|                                             |\n" +
                    " ---------------------------------------------");
            int in = sc.nextInt();
            switch (in) {
                case 1:
                    leader0.leadersPublicMenu(leaders);
                    break;
                case 2:
                    Tour.toursPublicMenu(tours);
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
                case 4:
                    System.out.println("Enter costumer's username :");
                    String cosUser = sc.next();
                    System.out.println("Enter costumer's password :");
                    String cosPass = sc.next();
                    System.out.println("Enter costumer's email :");
                    String cosEmail = sc.next();
                    System.out.println("Enter costumer's mobile :");
                    String cosMobile = sc.next();
                    Costumer newCos = new Costumer(cosUser,cosPass,cosEmail,cosMobile);
                    costumers.add(newCos);
                    System.out.println("Successfully Done !");
                    break;
            }
        }
    }

    static void thirdMenu() {
        while (true) {
            System.out.println(" _____________________________________________\n" +
                    "|                                             |\n" +
                    "|                                             |\n" +
                    "|   ■ Enter 1 to see leaders menu             |\n" +
                    "|   ■ Enter 2 to see tours menu               |\n" +
                    "|   ■ Enter 3 for the map features            |\n" +
                    "|   ■ Enter 4 to add or remove a costumer     |\n" +
                    "|                                             |\n" +
                    "|                                             |\n" +
                    " ---------------------------------------------");
            int in = sc.nextInt();
            switch (in) {
                case 1:
                    leader0.leadersPublicMenu(leaders);
                    break;
                case 2:
                    Tour.toursPublicMenu(tours);
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
                case 4:
                    System.out.println("\n\nEnter 1 to add a costumer\nEnter 2 to remove a costumer");
                    int addRem = sc.nextInt();
                    switch (addRem) {
                        case 1:
                            System.out.println("Enter costumer's username :");
                            String cosUser = sc.next();
                            System.out.println("Enter costumer's password :");
                            String cosPass = sc.next();
                            System.out.println("Enter costumer's email :");
                            String cosEmail = sc.next();
                            System.out.println("Enter costumer's mobile :");
                            String cosMobile = sc.next();
                            Costumer newCos = new Costumer(cosUser,cosPass,cosEmail,cosMobile);
                            costumers.add(newCos);
                            System.out.println("Successfully Done !");
                            break;
                        case 2:
                            for (int i = 0; i < costumers.size(); i++) {
                                System.out.println((i + 1) +"-" + costumers.get(i).toString());
                            }
                            System.out.println("Enter the number of costumer yo want them to be removed :");
                            int remove = sc.nextInt() - 1;
                            costumers.remove(remove);
                            System.out.println("Successfully Done !");
                            break;
                    }
                    break;
            }
        }
    }

    static void fourthMenu() {
        while (true) {
            System.out.println(" _____________________________________________\n" +
                    "|                                             |\n" +
                    "|                                             |\n" +
                    "|   ■ Enter 1 to see leaders                  |\n" +
                    "|   ■ Enter 2 to see tours                    |\n" +
                    "|   ■ Enter 3 for the map features            |\n" +
                    "|                                             |\n" +
                    "|                                             |\n" +
                    " ---------------------------------------------");
            int in = sc.nextInt();
            switch (in) {
                case 1:
                    for (int i = 0; i < leaders.size(); i++) {
                        System.out.println(leaders.get(i).toString());
                    }
                    break;
                case 2:
                    for (int i = 0; i < tours.size(); i++) {
                        System.out.println(tours.get(i).toString());
                    }
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
    }

    public static void main(String[] args) {

        while (true) {
            menu();
        }
    }
}
