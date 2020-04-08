package ir.ac.kntu.maputil;

import ir.ac.kntu.Regions;

import java.util.ArrayList;
import java.util.Scanner;

public class Tour {
    private String name;
    private Integer length;
    private Integer price;
    private Integer maxAttenders;
    private Integer minAttenders;
    private String whereStarts;
    private String destination;
    private boolean isAerial;
    public Regions regions;

    public Tour() {
    }

    public Tour(String name,Integer length, Integer price, Integer maxAttenders, Integer minAttenders, String whereStarts, String destination, boolean isAerial) {
        setName(name);
        if (length > 0) {
            setLength(length);
        }
        if (price > 0) {
            setPrice(price);
        }
        if (maxAttenders > 0) {
            setMaxAttenders(maxAttenders);
        }
        if (minAttenders > 0 && minAttenders < maxAttenders) {
            setMinAttenders(minAttenders);
        }
        setWhereStarts(whereStarts);
        setDestination(destination);
        setAerial(isAerial);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getMaxAttenders() {
        return maxAttenders;
    }

    public void setMaxAttenders(Integer maxAttenders) {
        this.maxAttenders = maxAttenders;
    }

    public Integer getMinAttenders() {
        return minAttenders;
    }

    public void setMinAttenders(Integer minAttenders) {
        this.minAttenders = minAttenders;
    }

    public String getWhereStarts() {
        return whereStarts;
    }

    public void setWhereStarts(String whereStarts) {
        this.whereStarts = whereStarts;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isAerial() {
        return isAerial;
    }

    public void setAerial(boolean aerial) {
        isAerial = aerial;
    }

    public String toString() {
        return " name = " + name +
                "length = " + length +
                ", price = " + price +
                ", maxAttenders = " + maxAttenders +
                ", minAttenders = " + minAttenders +
                ", whereStarts = '" + whereStarts + '\'' +
                ", destination = '" + destination + '\'' +
                ", isAerial = " + isAerial +
                '}' + "\n";
    }


    public static void edit(Tour inputTour) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which field you want to edit?\n1-Name\n2-Length of tour\n3-Price of tour\n4-Maximum attenders\n5-Minimum attenders"+
                "\n6-Where the tour starts from\n7-Destination\n8-Aerial being or not");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("\n\nEnter the new name :");
                inputTour.name = sc.next();
                break;
            case 2:
                System.out.println("\n\nEnter the new length of tour :");
                inputTour.length = sc.nextInt();
                break;
            case 3:
                System.out.println("\n\nEnter the new price of tour:");
                inputTour.price = sc.nextInt();
                break;
            case 4:
                System.out.println("\n\nEnter the new maximum number of attenders :");
                inputTour.maxAttenders = sc.nextInt();
                break;
            case 5:
                System.out.println("\n\nEnter the new minimum number of attenders :");
                inputTour.maxAttenders = sc.nextInt();
                break;
            case 6:
                System.out.println("\n\nEnter the new place where starts :");
                inputTour.whereStarts = sc.next();
                break;
            case 7:
                System.out.println("\n\nEnter the new destination :");
                inputTour.destination = sc.next();
                break;
            case 8:
                System.out.println("\n\nEnter 'Y' if the tour is aerial and 'N' if not :");
                String boo = sc.next();
                if(boo.equals("Y")) {
                    inputTour.isAerial = true;
                } else if (boo.equals("N")) {
                    inputTour.isAerial = false;
                }
                break;
        }
    }

    public static void toursMenu(ArrayList<Tour> tours) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nThis is tour menu :\nEnter 1 to see tours\nEnter 2 to add tours\nEnter 3 to remove a tour\nEnter 4 to edit a tour\n" +
                "Enter 5 to search a tour\nEnter 6 to see the region's menu");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                for (int i = 0; i < tours.size(); i++) {
                    System.out.println((i+1) + "-" + tours.get(i).toString());
                }
                break;
            case 2:
                System.out.println("Enter the name of tour :");
                String name = sc.next();
                System.out.println("Enter the length of tour :");
                int length = sc.nextInt();
                System.out.println("Enter the price of tour :");
                int price = sc.nextInt();
                System.out.println("Enter the maximum attenders of tour :");
                int max = sc.nextInt();
                System.out.println("Enter the minimum attenders of tour :");
                int min = sc.nextInt();
                System.out.println("Enter where the tour starts from :");
                String start = sc.next();
                System.out.println("Enter destination :");
                String des = sc.next();
                System.out.println("If the tour is aerial enter 'Y' and if not 'N' :");
                String are = sc.next();
                if (are.equals("y")) {
                    Tour newTour = new Tour(name,length, price, max, min, start, des, true);
                    tours.add(newTour);
                } else {
                    Tour newTour = new Tour(name,length, price, max, min, start, des, false);
                    tours.add(newTour);
                }
                break;
            case 3:
                for (int i = 0; i < tours.size(); i++) {
                    System.out.println((i+1) + "-" + tours.get(i).toString());
                }
                System.out.println("Which tour you want to be removed?");
                int remTour = sc.nextInt() - 1;
                if (remTour < tours.size()) {
                    tours.remove(remTour);
                    System.out.println("Successfully Done !");
                } else {
                    System.out.println("Invalid index entered ! Try again");
                }
                break;
            case 4:
                for (int i = 0; i < tours.size(); i++) {
                    System.out.println((i+1) + "-" + tours.get(i).toString());
                }
                System.out.println("Which leader you want to edit?");
                int edTour = sc.nextInt() - 1;
                if (edTour < tours.size()) {
                    Tour.edit(tours.get(edTour));
                    System.out.println("Successfully Done !");
                } else {
                    System.out.println("Invalid index entered ! Try again");
                }
                break;
            case 5:
                System.out.println("By which field you want to search tour?\n1-Length of tour\n2-Maximum number of attenders\n3-Minimum number of attenders\n4-A specific price\n" +
                        "5-Price below an amount\n6-Price above an amount\n7-Price between two amounts\n");
                int serInput = sc.nextInt();
                switch (serInput) {
                    case 1:
                        System.out.println("Enter length :");
                        int len = sc.nextInt();
                        for (int i = 0; i < tours.size(); i++) {
                            if (tours.get(i).getLength() == len) {
                                System.out.println(tours.get(i));
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Enter maximum attenders :");
                        int maxi = sc.nextInt();
                        for (int i = 0; i < tours.size(); i++) {
                            if (tours.get(i).getMaxAttenders() == maxi) {
                                System.out.println(tours.get(i));
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Enter maximum attenders :");
                        int mini = sc.nextInt();
                        for (int i = 0; i < tours.size(); i++) {
                            if (tours.get(i).getMinAttenders() == mini) {
                                System.out.println(tours.get(i));
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Enter a price :");
                        int pri = sc.nextInt();
                        for (int i = 0; i < tours.size(); i++) {
                            if (tours.get(i).getPrice() == pri) {
                                System.out.println(tours.get(i));
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Enter the price :");
                        int upPrice = sc.nextInt();
                        for (int i = 0; i < tours.size(); i++) {
                            if (tours.get(i).getPrice() < upPrice) {
                                System.out.println(tours.get(i));
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Enter the price :");
                        int lowPrice = sc.nextInt();
                        for (int i = 0; i < tours.size(); i++) {
                            if (tours.get(i).getPrice() > lowPrice) {
                                System.out.println(tours.get(i));
                            }
                        }
                        break;
                    case 7:
                        System.out.println("Enter the upper line of age :");
                        int upp = sc.nextInt();
                        System.out.println("Enter the lower line of age :");
                        int low = sc.nextInt();
                        for (int i = 0; i < tours.size(); i++) {
                            if ((tours.get(i).getPrice() > low) && (tours.get(i).getPrice() < upp)) {
                                System.out.println(tours.get(i));
                            }
                        }
                        break;
                }
                break;
            case 6:
                System.out.println("Enter 1 to add a region to a tour");
                break;
        }
    }


}
