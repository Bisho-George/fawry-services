public class OverallDiscount extends Discount {
    private User pay;
    public OverallDiscount(IPayment payment) {
        super(payment);
    }

    @Override
    public double cost() {
        double totalcost = super.cost();
        if(pay.getPaymentCount() < 1){
            totalcost -= (totalcost * 0.1);
        }
        return totalcost;

    }
}