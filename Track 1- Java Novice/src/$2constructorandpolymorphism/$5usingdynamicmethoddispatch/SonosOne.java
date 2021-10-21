package $2constructorandpolymorphism.$5usingdynamicmethoddispatch;

public class SonosOne extends AlexaEnableSpeaker {
    public SonosOne() {
        super("SonosOne");
    }

    @Override
    public void printDetails() {
        System.out.println("SonosOne class: " + getProductName());
    }
}
