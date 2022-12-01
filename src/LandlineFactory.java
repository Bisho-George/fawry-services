public class LandlineFactory implements Factory{

    @Override
    public Services type() {
        return new LandlineServices();
    }
}
