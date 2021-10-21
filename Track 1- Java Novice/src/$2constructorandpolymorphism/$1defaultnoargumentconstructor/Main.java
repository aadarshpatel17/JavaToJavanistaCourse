package $2constructorandpolymorphism.$1defaultnoargumentconstructor;

public class Main {

    public static void main(String[] args) {

        Book headFirstJava = new Book();
        System.out.println("headFirstJava name: " + headFirstJava.getName());

        Book effectiveJava = new Book();
        System.out.println("effectiveJava name: " + effectiveJava.getName());

        SelfHelpBook algorithmsToLiveBy = new SelfHelpBook();
        System.out.println("algorithmToLiveBy name: " + algorithmsToLiveBy.getName());

        SelfHelpBook twoAwesomeHours = new SelfHelpBook();
        System.out.println("twoAwesomeHours name: " + twoAwesomeHours.getName());



        System.out.println();

    }
}
