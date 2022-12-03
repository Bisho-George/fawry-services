import java.util.HashMap;
import java.util.ArrayList;

public class Context {

    private HashMap<String, String> persons;

   public Context(){
        persons = new HashMap<String, String>();
   }

    public HashMap<String, String> getPersons() {
        return persons;
    }
}
