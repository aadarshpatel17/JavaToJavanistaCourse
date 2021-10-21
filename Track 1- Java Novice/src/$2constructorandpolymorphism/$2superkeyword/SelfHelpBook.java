package $2constructorandpolymorphism.$2superkeyword;

public class SelfHelpBook extends Book {

    public SelfHelpBook() {
//        super("Book Name here");
        System.out.println("SelfHelpBook()");
    }

    public SelfHelpBook(String name) {
        super(name);

//        super();
//        setName(name);

        System.out.println("SelfHelpBook(String name)");
    }

}
