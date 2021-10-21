package $1classesandobjects.$24inheritanceoffieldsandmethods;

public class Main {
    public static void main(String[] args) {

        Book headFirstJava = new Book();
        NonFictionBook sapiens = new NonFictionBook();
        FictionBook lifeOfPi = new FictionBook();
        TextBook effectiveJava = new TextBook();

        System.out.println("headFirstJava bindingType: " + headFirstJava.bindingType);
        System.out.println("sapiens bindingType: " + sapiens.bindingType);
        System.out.println("lifeOfPi bindingType: " + lifeOfPi.bindingType);
        System.out.println("effectiveJava bindingType: " + effectiveJava.bindingType);

        System.out.println();

//        invoking base class Book method
        headFirstJava.checkOutBook();
        sapiens.checkOutBook();
        lifeOfPi.checkOutBook();
        effectiveJava.checkOutBook();

        System.out.println();

        headFirstJava.setBindingType("Paperback");
        sapiens.setBindingType("Hardcover");
        lifeOfPi.setBindingType("Leather");

        System.out.println("headFirstJava bindingType (updated): " + headFirstJava.getBindingType());
        System.out.println("sapiens bindingType (updated): " + sapiens.getBindingType());
        System.out.println("lifeOfPi bindingType (updated): " + lifeOfPi.getBindingType());
        System.out.println("effectiveJava bindingType: " + effectiveJava.getBindingType());

        System.out.println();

        System.out.println("sapiens subject is: " + sapiens.getSubject());
        System.out.println("lifeOfPi plot is: " + lifeOfPi.getPlot());
        System.out.println("effectiveJava course is: " + effectiveJava.getCourse());

        System.out.println();

        sapiens.displayType();
        lifeOfPi.displayType();
        effectiveJava.displayType();

        System.out.println();

    }
}
