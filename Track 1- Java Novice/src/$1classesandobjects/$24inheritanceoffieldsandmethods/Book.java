package $1classesandobjects.$24inheritanceoffieldsandmethods;

public class Book {

    public String bindingType = "Paperback";

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public void checkOutBook() {
        System.out.println("The book has been checked out successfully!");
    }

}
