package $2constructorandpolymorphism.$4runtimepolymorphism;

public class AmazonEcho extends SmartSpeaker {

    public AmazonEcho() {
        super("Amazon Echo");
    }

    public void alexa() {
        System.out.println("Wake phrase: Alexa");
    }

    @Override
    public void wakePhrase() {
        System.out.println("Wake phrase: Alexa");
    }

}
