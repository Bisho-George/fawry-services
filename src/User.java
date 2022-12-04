public class User extends Person {
    private Wallet obj;

    private int paymentCount = 0;

    public User(String pass, String user) {
        super(pass, user);
    }

    public User() {
        super();
    }

    public void setObj(Wallet obj) {
        this.obj = obj;
    }

    public Wallet getObj() {
        return obj;
    }

    public void setPaymentCount(int paymentCount) {
        this.paymentCount = paymentCount;
    }

    public int getPaymentCount() {
        return paymentCount;
    }

    public void starttrans() {
        paymentCount++;
    }
}
