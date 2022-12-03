public class RefundTransactions {

    private String mobileNumber;
    private double amount;
    private Boolean state;

    public RefundTransactions(String mn, double am, Boolean st) {
        this.mobileNumber = mn;
        this.amount = am;
        this.state = st;
    }

    public double getAmount() {
        return amount;
    }

    public String getMobileNumber(){
        return mobileNumber;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getState() {
        return state;
    }

    //
    public void startRefund(Admin obj) {
        obj.added(this);

    }
}
