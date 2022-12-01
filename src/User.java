public class User extends Person {

    private Wallet obj;

    public User(String pass, String user) {
        super(pass, user);
    }

    public void setObj(Wallet obj) {
        this.obj = obj;
    }



    public Wallet getObj() {
        return obj;
    }

    public void starttrans(){

    }


}
