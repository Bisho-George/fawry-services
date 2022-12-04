public class OverallDiscount extends Discount {
    private User pay;
    public OverallDiscount(IPayment payment) {
        super(payment);
    }
    public void setPay(User pay) {
        this.pay = pay;
    }

    @Override
    public double cost() {
        double totalcost = payment.cost();
        // if(pay.getPaymentCount() <= 1){
            totalcost -= (totalcost * 0.1);
    // }
        return totalcost;
    }
}