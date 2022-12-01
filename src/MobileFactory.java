public class MobileFactory implements Factory{

    @Override
    public Services type() {
        return new MobileService();
    }
}
