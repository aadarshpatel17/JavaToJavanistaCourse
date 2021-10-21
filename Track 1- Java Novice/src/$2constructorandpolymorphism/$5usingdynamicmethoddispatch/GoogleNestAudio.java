package $2constructorandpolymorphism.$5usingdynamicmethoddispatch;

public class GoogleNestAudio extends SmartSpeaker {
    public GoogleNestAudio() {
        super("Google Nest Audio");
    }

    @Override
    public void wakePhrase() {
        System.out.println("Wake phrase: Ok Google");
    }
}
