package $2constructorandpolymorphism.$2superkeyword;

public class Main {

    public static void main(String[] args) {

        Book headFirstJava = new Book();
        System.out.println("headFirstJava name: " + headFirstJava.getName());
        System.out.println();

        Book effectiveJava = new Book("Book Name here");
        System.out.println("effectiveJava name: " + effectiveJava.getName());
        System.out.println();

        SelfHelpBook algorithmsToLiveBy = new SelfHelpBook();
        System.out.println("algorithmToLiveBy name: " + algorithmsToLiveBy.getName());
        System.out.println();

        SelfHelpBook twoAwesomeHours = new SelfHelpBook("anything book");
        System.out.println("twoAwesomeHours name: " + twoAwesomeHours.getName());
        System.out.println();

    }
}
