public class Wallet {
    private double amount;

    //constructor
    public Wallet(double am) {
        this.amount = am;
    }

    //getter
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    //Consume the money you want to send from your wallet
    public void consume() {

    }

    //add the refunded money back to your wallet
    public void put(RefundTransactions obj) {
        if (obj.getState()) {
            amount += obj.getAmount();
            System.out.println("Money refund accepted by the admin and money got back to the wallet successfully");

        } else {


            System.out.println("Money refund rejected by the admin");
        }

    }
}
