package ir.ac.kntu;

import java.util.Scanner;
import java.util.regex.*;

public class Admin extends User {

    private String userName = "admin";
    private String passWord = "admin";
    private String email;
    private String mobile;

    public void editAdmin(Admin inputAdmin) {
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
        System.out.println("Successfully Done !");
    }

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

}
