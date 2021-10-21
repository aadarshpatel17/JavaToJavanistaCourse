package $2constructorandpolymorphism.$5usingdynamicmethoddispatch;

public class Main {
    public static void main(String[] args) {

        SmartSpeaker googleNestAudio = new GoogleNestAudio();
        SmartSpeaker amazonEcho = new AmazonEcho();
        SmartSpeaker appleHomePod = new AppleHomePod();
        SmartSpeaker sonosOne = new SonosOne();

        System.out.println("amazonEcho wakePhrase()");
        amazonEcho.wakePhrase();

        System.out.println("sonosOne wakePhrase()");
        sonosOne.wakePhrase();

        System.out.println("googleNestAudio wakePhrase()");
        googleNestAudio.wakePhrase();

        System.out.println("appleHomePod wakePhrase()");
        appleHomePod.wakePhrase();

        System.out.println();

        amazonEcho.printDetails();
        sonosOne.printDetails();
        googleNestAudio.printDetails();
        appleHomePod.printDetails();

    }
}
