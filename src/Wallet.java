public class Wallet {
    private double amount;

    private Form form;

    // constructor
    public Wallet(double am, Form form) {
        this.amount = am;
        this.form = form;
    }

    // getter
    public double getWalletamount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Consume the money you want to send from your wallet
    public void consume() {
        // consume amount of money from the wallet.
        double consume = getWalletamount() - form.getAmount();
    }

    // add the refunded money back to your wallet.
    public void put(RefundTransactions obj) {
        if (obj.getState()) {
            amount += obj.getAmount();
            System.out.println("Money refund accepted by the admin and money got back to the wallet successfully");

        } else {


            System.out.println("Money refund rejected by the admin");
        }

    }
}

