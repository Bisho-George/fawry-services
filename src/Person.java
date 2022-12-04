import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Person {
    protected String password;
    protected String username;
    // protected Context context;
    protected client cl;

    // Constructor
    public Person(String user, String pass) {
        this.username = user;
        this.password = pass;

    }

    public Person() {
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setClient(client context) {
        this.cl = context;
    }

    public client getClient() {
        return cl;
    }

    // return user
    public User signin() {
        // Search For The Key In Hashmap Of Persons
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username ");
        String userName = myObj.nextLine();
        System.out.println("Enter password ");
        String pass = myObj.nextLine();
        this.username = userName;
        this.password = pass;
        ArrayList<User> us = cl.getCont().getU();
        for (int i = 0; i < us.size(); i++) {
            if (Objects.equals(us.get(i).getPassword(), pass) && Objects.equals(us.get(i).getUsername(), userName)) {
                System.out.println("Signed In Successfully");
                return us.get(i);
            }
        }
        // If Not Found
        System.out.println("Invalid Username Or Password");
        System.out.println("1- sign in");
        System.out.println("2- sign up");
        int choice ;
        choice = myObj.nextInt();
        if (choice == 1) {
            signin();
        }
        else if (choice == 2) {
            signup();
        }
        else {
            System.out.println("wrong choice");
            while (choice != 1 || choice != 2) {
                System.out.println("please enter correct choice");
                System.out.println("1- sign in");
                System.out.println("2- sign up");
                choice = myObj.nextInt();
                if (choice == 1) {
                    signin();
                }
                else if (choice == 2) {
                    signup();
                    signin();
                    break;
                }
            }
        }
        return new User();
    }

    public void signout() {
        System.out.println("Signed Out Successfully");
    }

    public void signup() {
        // Search If The Key Exists In The Hashmap
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username ");
        String userName = myObj.nextLine();
        System.out.println("Enter password ");
        String pass = myObj.nextLine();
        this.username = userName;
        this.password = pass;
        User us = new User(userName, pass);
        System.out.println("Successfully Your Account Got Created");
        cl.go(us);
    }


}
