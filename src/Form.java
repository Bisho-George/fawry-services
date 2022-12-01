import java.security.PrivateKey;

public class Form {

    private String mobilenumber;
    private double amount;

    private User user;

    public Form(String mn,double am){
        this.mobilenumber=mn;
        this.amount=am;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public double getAmount() {
        return amount;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }
}
