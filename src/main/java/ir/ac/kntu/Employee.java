package ir.ac.kntu;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Employee extends User {

    private String userName = "employee";
    private String passWord = "employee";
    private String email;
    private String mobile;
    private Date recruitmentDate;
    private int salary;

    public void editEmployee (Employee employee) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new username :");
        String newUser = sc.next();
        System.out.println("Enter the new password :");
        String newPass = sc.next();
        setUserName(newUser);
        setPassWord(newPass);
        System.out.println("Enter the new email :");
        String newEmail = sc.next();
        setEmail(newEmail);
        System.out.println("Enter the new mobile phone :");
        String newMob = sc.next();
        setMobile(newMob);
        System.out.println("Enter the salary :");
        int salary = sc.nextInt();
        setSalary(salary);
        System.out.println("Enter the date of recruitment :\nEnter year :");
        int year = sc.nextInt();
        System.out.println("Enter month :");
        int month = sc.nextInt();
        System.out.println("Enter day :");
        int day = sc.nextInt();
        Date date = new Date(year,month,day);
        setRecruitmentDate(date);
        System.out.println("Successfully Done !");
    }

    @Override
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (Pattern.matches("^\\w+[\\w-\\.]*\\@\\w+((-\\w+)|(\\w*))\\.com$",email)) {
            this.email = email;
        }
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        if (Pattern.matches("^(\\+98|0)?9\\d{9}$",mobile)) {
            this.mobile = mobile;
        }
    }

    public Date getRecruitmentDate() {
        return recruitmentDate;
    }

    public void setRecruitmentDate(Date recruitmentDate) {
        this.recruitmentDate = recruitmentDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
