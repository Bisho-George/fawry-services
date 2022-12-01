public class DonationFactory implements Factory{

    @Override
    public Services type() {
        return new DonationsService();
    }
}
