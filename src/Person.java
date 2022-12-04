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

    public Person(){}
    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setClient(client context) {
        this.cl = context;}

    public client getclient() {
        return cl;}
//htrg3 mn type user
    public User signin() {
        // Search For The Key In Hashmap Of Persons
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username ");
        String userName=myObj.nextLine();
        System.out.println("Enter password ");
        String pass=myObj.nextLine();
        this.username=userName;
        this.password=pass;
       // if (context.getPersons().get(this.username).equals(this.password)) {
          //  System.out.println("Signed In Successfully");
            ArrayList<User> us = cl.getCont().getU();
        System.out.println(us.get(0).getUsername());
            for(int i=0; i<us.size();i++){
              //  System.out.println("loool" + pass + "--- " + us.get(i).getPassword());
               // System.out.println("loool" + userName + "--- " + us.get(i).getUsername());
                if(Objects.equals(us.get(i).getPassword(), pass) && Objects.equals(us.get(i).getUsername(), userName)){
                    System.out.println("Signed In Successfully");
                    return us.get(i);
                }
            }
      //  }
        // If Not Found
       // else {
            System.out.println("Invalid Username Or Password");
            signin();
       // }
        return new User();
    }

    public void signout() {
        System.out.println("Signed Out Successfully");
    }

    public void signup() {
        // Search If The Key Exists In The Hashmap

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username ");
        String userName=myObj.nextLine();
        System.out.println("Enter password ");
        String pass=myObj.nextLine();
        this.username=userName;
        this.password=pass;
        User us = new User(userName,pass);
        //if (context.getPersons().containsKey(this.username)) {
          //  System.out.println("This username is already existed");}
        // Create New Person
       // else {
            System.out.println("Successfully Your Account Got Created");
            cl.getCont().getPersons().put(this.username, this.password);
            cl.go(us);
       // }
    }



}
