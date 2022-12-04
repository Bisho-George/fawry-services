public class OverallDiscount extends Discount {
    public OverallDiscount(IPayment payment) {
        super(payment);
    }

    @Override
    public double cost() {
        double totalcost = payment.cost();
        totalcost -= (totalcost * 0.1);
        return totalcost;
    }
}