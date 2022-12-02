public abstract class IPayment {
    private double cost;
    public void setCost(double cost) {
        this.cost = cost;
    }
    public double cost(){
        return cost;
    }
}
