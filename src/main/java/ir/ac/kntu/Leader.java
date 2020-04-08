package ir.ac.kntu;

import ir.ac.kntu.maputil.Tour;

import java.util.ArrayList;
import java.util.Scanner;

public class Leader {
    private String name;
    private String lastName;
    private Integer nationalCode;
    private Integer identityCode;
    private Date birthDate;
    private Date recruitmentDate;
    private boolean isMarried;
    private boolean isBusy = false;


    public Leader(){}

    public Leader (String name,String lastName,Integer nationalCode,Integer identityCode,Date birthDate,Date recruitmentDate,boolean isMarried,boolean isBusy) {
        setName(name);
        setLastName(lastName);
        setNationalCode(nationalCode);
        setIdentityCode(identityCode);
        setBirthDate(birthDate);
        setRecruitmentDate(recruitmentDate);
        setMarried(isMarried);
        setBusy(isBusy);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNationalCode(Integer nationalCode) {
        this.nationalCode = nationalCode;
    }

    public void setIdentityCode(Integer identityCode) {
        this.identityCode = identityCode;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setRecruitmentDate(Date recruitmentDate) {
        this.recruitmentDate = recruitmentDate;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getNationalCode() {
        return nationalCode;
    }

    public Integer getIdentityCode() {
        return identityCode;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getRecruitmentDate() {
        return recruitmentDate;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public String toString() {
        return "Leader " +
                "name = '" + name + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", nationalCode = " + nationalCode +
                ", identityCode = " + identityCode +
                ", birthDate = " + birthDate +
                ", recruitmentDate = " + recruitmentDate +
                ", isMarried = " + isMarried +
                ", isBusy = " + isBusy ;
//                ", places = " + places;
    }

    public void leadersMenu(ArrayList<Leader> leaders) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nThis is leaders menu :\nEnter 1 to see the leaders\nEnter 2 to add leader\nEnter 3 to remove a leader\nEnter 4 to edit a leader\n" +
                "Enter 5 to search a leader\n");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                for (int i = 0; i < leaders.size(); i++) {
                    System.out.println((i+1) + "-" + leaders.get(i).name + " " + leaders.get(i).lastName);
                }
                break;
            case 2:
                System.out.println("Enter name :");
                String name = sc.next();
                System.out.println("Enter last name :");
                String lastName = sc.next();
                System.out.println("Enter national code :");
                Integer natCode = sc.nextInt();
                System.out.println("Enter identity code :");
                Integer ideCode = sc.nextInt();
                System.out.println("Enter birth date :");
                System.out.println("Enter day :");
                int day = sc.nextInt();
                System.out.println("Enter month :");
                int month = sc.nextInt();
                System.out.println("Enter year :");
                int year = sc.nextInt();
                Date birth = new Date(year,month,day);
                System.out.println("Enter recruitment date :");
                System.out.println("Enter day :");
                int dayR = sc.nextInt();
                System.out.println("Enter month :");
                int monthR = sc.nextInt();
                System.out.println("Enter year :");
                int yearR = sc.nextInt();
                Date rec = new Date(yearR,monthR,dayR);
                System.out.println("If the leader is married type 'Y' and if not 'N' ");
                String boolM = sc.next();
                System.out.println("If the leader is busy now type 'Y' and if not 'N' ");
                String boolB = sc.next();
                if (boolM.equals("Y")) {
                    if (boolB.equals("Y")) {
                        Leader newLeader = new Leader(name,lastName,nationalCode,identityCode,birth,rec,true,true);
                        leaders.add(newLeader);
                    } else if (boolB.equals("N")) {
                        Leader newLeader = new Leader(name,lastName,nationalCode,identityCode,birth,rec,true,false);
                        leaders.add(newLeader);
                    }
                } else if (boolM.equals("N")) {
                    if (boolB.equals("Y")) {
                        Leader newLeader = new Leader(name,lastName,nationalCode,identityCode,birth,rec,false,true);
                        leaders.add(newLeader);
                    } else if (boolB.equals("N")) {
                        Leader newLeader = new Leader(name,lastName,nationalCode,identityCode,birth,rec,false,false);
                        leaders.add(newLeader);
                    }
                }
                break;
            case 3:
                for (int i = 0; i < leaders.size(); i++) {
                    System.out.println((i+1) + "-" + leaders.get(i).name + leaders.get(i).lastName);
                }
                System.out.println("Which leader you want to be removed?");
                int in = sc.nextInt() - 1;
                if (in < leaders.size()) {
                    leaders.remove(in);
                    System.out.println("Successfully Done !");
                } else {
                    System.out.println("Invalid index entered ! Try again");
                }
                break;
            case 4:
                for (int i = 0; i < leaders.size(); i++) {
                    System.out.println((i+1) + "-" + leaders.get(i).getName() + leaders.get(i).getLastName());
                }
                System.out.println("Which leader you want to edit?");
                int inp = sc.nextInt() - 1;
                Leader.edit(leaders.get(inp));
                break;
            case 5:
                System.out.println("By which field you want to search leader?\n1-Name\n2-Last name\n3-A specific age\n4-Age older than a number\n5-Age younger than a number" +
                        "\n6-Age between two numbers\n7-The place where he or she knows about");
                int input0 = sc.nextInt();
                switch (input0) {
                    case 1:
                        String n = sc.next();
                        for (int i = 0; i < leaders.size(); i++) {
                            if (leaders.get(i).getName().equals(n)) {
                                System.out.println(leaders.get(i));
                            }
                        }
                        break;
                    case 2:
                        String ln = sc.next();
                        for (int i = 0; i < leaders.size(); i++) {
                            if (leaders.get(i).getLastName().equals(ln)) {
                                System.out.println(leaders.get(i));
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Enter the age :");
                        int inputAge = sc.nextInt();
                        for (int i = 0; i < leaders.size(); i++) {
                            if (inputAge == 2020 - leaders.get(i).getBirthDate().getYear()) {
                                System.out.println(leaders.get(i));
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Enter the age :");
                        int inputAge0 = sc.nextInt();
                        for (int i = 0; i < leaders.size(); i++) {
                            if (2020 - leaders.get(i).getBirthDate().getYear() > inputAge0) {
                                System.out.println(leaders.get(i));
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Enter the age :");
                        int inputAge1 = sc.nextInt();
                        for (int i = 0; i < leaders.size(); i++) {
                            if (2020 - leaders.get(i).getBirthDate().getYear() < inputAge1) {
                                System.out.println(leaders.get(i));
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Enter the upper line of age :");
                        int upp = sc.nextInt();
                        System.out.println("Enter the lower line of age :");
                        int low = sc.nextInt();
                        for (int i = 0; i < leaders.size(); i++) {
                            if ((2020 - leaders.get(i).getBirthDate().getYear() <upp) && (2020 - leaders.get(i).getBirthDate().getYear() > low)) {
                                System.out.println(leaders.get(i));
                            }
                        }
                        break;
                    case 7:
                        ///////////////TODO
                        break;
                }
                break;
        }
    }

    public static void edit(Leader inputLeader) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which field you want to edit?\n1-Name\n2-Last name\n3-National code\n4-Identity code\n5-Birth date"+
                "\n6-Recruitment date\n7-Marriage state\n8-Business state\n9-Places that the leader knows about");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("\n\nEnter the new name :");
                inputLeader.name = sc.next();
                break;
            case 2:
                System.out.println("\n\nEnter the new last name :");
                inputLeader.lastName = sc.next();
                break;
            case 3:
                System.out.println("\n\nEnter the new national code :");
                inputLeader.nationalCode = sc.nextInt();
                break;
            case 4:
                System.out.println("\n\nEnter the new identity code :");
                inputLeader.identityCode = sc.nextInt();
                break;
            case 5:
                System.out.println("\n\nEnter the new birth date :");
                System.out.println("Enter new year :");
                inputLeader.birthDate.setYear(sc.nextInt());
                System.out.println("Enter new month :");
                inputLeader.birthDate.setMonth(sc.nextInt());
                System.out.println("Enter new day :");
                inputLeader.birthDate.setDay(sc.nextInt());
                break;
            case 6:
                System.out.println("\n\nEnter the new recruitment date :");
                System.out.println("Enter new year :");
                inputLeader.recruitmentDate.setYear(sc.nextInt());
                System.out.println("Enter new month :");
                inputLeader.recruitmentDate.setMonth(sc.nextInt());
                System.out.println("Enter new day :");
                inputLeader.recruitmentDate.setDay(sc.nextInt());
                break;
            case 7:
                System.out.println("\n\nEnter 'Y' if he or she is married and 'N' if not :");
                String bool = sc.next();
                if(bool.equals("Y")) {
                    inputLeader.isMarried = true;
                } else if (bool.equals("N")) {
                    inputLeader.isMarried = false;
                }
                break;
            case 8:
                System.out.println("\n\nEnter 'Y' if he or she is busy now and 'N' if not :");
                String boo = sc.next();
                if(boo.equals("Y")) {
                    inputLeader.isBusy = true;
                } else if (boo.equals("N")) {
                    inputLeader.isBusy = false;
                }
                break;
            case 9:
                /////////////////////////TODO
                break;
        }
    }

}