package $2constructorandpolymorphism.$4runtimepolymorphism;

public class Main {
    public static void main(String[] args) {

        SmartSpeaker smartSpeaker = new SmartSpeaker("Google Nest");
        AmazonEcho amazonEcho = new AmazonEcho();
        AppleHomePod appleHomePod = new AppleHomePod();

        System.out.println("smartSpeaker name: " + smartSpeaker.getProductName());
        System.out.println("amazonEcho name: " + amazonEcho.getProductName());
        System.out.println("appleHomePod name: " + appleHomePod.getProductName());
        System.out.println();

        amazonEcho.alexa();
        appleHomePod.siri();
        System.out.println();

        smartSpeaker.wakePhrase();
        amazonEcho.wakePhrase();
        appleHomePod.wakePhrase();
        System.out.println();

    }
}
