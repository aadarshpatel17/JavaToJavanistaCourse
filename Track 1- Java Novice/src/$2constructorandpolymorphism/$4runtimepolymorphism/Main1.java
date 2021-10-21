package $2constructorandpolymorphism.$4runtimepolymorphism;

public class Main1 {
    public static void main(String[] args) {

//        Notice the variables type here
//        variable which are of the base class type
//        and the whole objects of derived class types.
        SmartSpeaker smartSpeaker = new SmartSpeaker("Google Nest");
        SmartSpeaker amazonEcho = new AmazonEcho();
        SmartSpeaker appleHomePod = new AppleHomePod();

        System.out.println("smartSpeaker name: " + smartSpeaker.getProductName());
        System.out.println("amazonEcho name: " + amazonEcho.getProductName());
        System.out.println("appleHomePod name: " + appleHomePod.getProductName());
        System.out.println();

//        runtime polymorphism
//        the reason that this is called runtime polymorphism is because
//        Java determines at runtime what version of the wake-phrase method
//        should be executed.
        smartSpeaker.wakePhrase();
        amazonEcho.wakePhrase();
        appleHomePod.wakePhrase();
        System.out.println();

//        Java makes this all possible by determining which methods to call
//        at runtime rather than at compile time and this process is known
//        as DYNAMIC METHOD DISPATCH.

//        Dynamic method dispatch and runtime polymorphism are both two sides
//        of the same coin.

    }
}
