package $2constructorandpolymorphism.$5usingdynamicmethoddispatch;

public class AmazonEcho extends AlexaEnableSpeaker {

    public AmazonEcho() {
        super("Amazon Echo");
    }

    @Override
    public void printDetails() {
        System.out.println("AmazonEcho class: " + getProductName());
    }

}
