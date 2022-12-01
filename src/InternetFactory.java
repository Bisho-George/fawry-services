public class InternetFactory implements Factory{

    @Override
    public Services type() {
        return new InternetServices();
    }
}
