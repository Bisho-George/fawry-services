import java.util.HashMap;

public class Person {
    protected String password;
    protected String username;
    protected Context context;
    // Constructor
    public Person(String pass, String user) {
        this.password = pass;
        this.username = user;
    }
    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void signin() {
        // Search For The Key In Hashmap Of Persons
        if (context.getPersons().get(this.username).equals(this.password)) {
            System.out.println("Signed In Successfully");
        }
        // If Not Found
        else {
            System.out.println("Invalid Username Or Password");
        }
    }

    public void signout() {
        System.out.println("Signed Out Successfully");
    }

    public void signup() {
        // Search If The Key Exists In The Hashmap
        if (context.getPersons().containsKey(this.username)) {
            System.out.println("This username is already existed");
        }
        // Create New Person
        else {
            context.getPersons().put(this.username, this.password);
        }
    }


}
