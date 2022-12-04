import java.util.HashMap;
import java.util.ArrayList;

public class Context {

    private HashMap<String, String> persons;
    private ArrayList<User> u;

    public Context() {
        persons = new HashMap<String, String>();
        u = new ArrayList<User>();
    }

    public HashMap<String, String> getPersons() {
        return persons;
    }

    public ArrayList<User> getU() {
        return u;
    }

    public void setU(User obj) {
        u.add(obj);
    }
}
