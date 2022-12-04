public abstract class Discount extends IPayment {
    public IPayment payment;

    public Discount(IPayment payment) {
        this.payment = payment;
    }

    public double cost() {
        return payment.cost();
    }

}
