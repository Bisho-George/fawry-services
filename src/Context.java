import java.util.HashMap;
import java.util.ArrayList;

public class Context {
    private ArrayList<User> u;

    public Context() {
        u = new ArrayList<User>();
    }

    public ArrayList<User> getU() {
        return u;
    }

    public void setU(User obj) {
        u.add(obj);
    }
}
