package $2constructorandpolymorphism.$5usingdynamicmethoddispatch;

public class AlexaEnableSpeaker extends SmartSpeaker {

    public AlexaEnableSpeaker(String productName) {
        super(productName);
    }

    @Override
    public void wakePhrase() {
        System.out.println("Wake phrase: Alexa");
    }

    @Override
    public void printDetails() {
        System.out.println("AlexaEnabledSpeaker class: " + getProductName());
    }
}
