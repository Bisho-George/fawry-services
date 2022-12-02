public class SpecificDiscount extends Discount {
    public SpecificDiscount(IPayment payment) {
        super(payment);
    }
    @Override
    public double cost() {
        double totalcost = super.cost();
        totalcost -= (totalcost * 0.2);
        return totalcost;
    }
}
