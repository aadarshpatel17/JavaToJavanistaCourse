package $2constructorandpolymorphism.$4runtimepolymorphism;

public class AppleHomePod extends SmartSpeaker {
    public AppleHomePod() {
        super("Apple HomePod");
    }

    public void siri() {
        System.out.println("Wake phrase: Hey Siri");
    }

    @Override
    public void wakePhrase() {
        System.out.println("Wake phrase: Hey Siri");
    }


}
