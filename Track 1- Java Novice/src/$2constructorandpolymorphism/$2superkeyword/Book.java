package $2constructorandpolymorphism.$2superkeyword;

public class Book {
    private String name = "unknown";

//    default no-argument constructor
    public Book() {
        System.out.println("Book()");
    }

//    parameterized constructor
    public Book(String name) {
        this.name = name;

        System.out.println("Book(String name)");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkOutBook() {
        System.out.format("The book: %s has been checked out successfully!", name);
    }

    @Override
    public String toString() {
        return String.format("Name: %s", name);
    }

}
