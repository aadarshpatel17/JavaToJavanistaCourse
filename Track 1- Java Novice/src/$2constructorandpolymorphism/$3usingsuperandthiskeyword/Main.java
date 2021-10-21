package $2constructorandpolymorphism.$3usingsuperandthiskeyword;

public class Main {

    public static void main(String[] args) {

        Book headFirstJava = new Book();
        System.out.println("headFirstJava name: " + headFirstJava);
        System.out.println();

        Book effectiveJava = new Book("Effective Java");
        System.out.println("effectiveJava name: " + effectiveJava);
        System.out.println();

        Book coreJava = new Book("Core Java", "Cay S. Horstmann");
        System.out.println("coreJava name: " + coreJava);
        System.out.println();

        SelfHelpBook algorithmsToLiveBy = new SelfHelpBook();
        System.out.println("algorithmToLiveBy name: " + algorithmsToLiveBy.getName());
        System.out.println();

        SelfHelpBook twoAwesomeHours = new SelfHelpBook("Two Awesome Hours");
        System.out.println("twoAwesomeHours name: " + twoAwesomeHours.getName());
        System.out.println();

        SelfHelpBook thePowerOfHabit = new SelfHelpBook("The Power of Habit", "Charles Duhigg");
        System.out.println("twoAwesomeHours name: " + twoAwesomeHours.getName());
        System.out.println();

        SelfHelpBook thePowerOfHabit1 = new SelfHelpBook("The Power of Habit1", "Charles Duhigg", 500);
        System.out.println("twoAwesomeHours name: " + twoAwesomeHours.getName());
        System.out.println();

    }
}
