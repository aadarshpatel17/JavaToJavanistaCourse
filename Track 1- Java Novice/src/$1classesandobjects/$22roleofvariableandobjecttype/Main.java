package $1classesandobjects.$22roleofvariableandobjecttype;

public class Main {
    public static void main(String[] args) {

        Book headFirstJava = new Book();
        NonFictionBook sapiens = new NonFictionBook();

        System.out.println();

        System.out.println("headFirstJava bindingType: " + headFirstJava.getBindingType());
        headFirstJava.checkOutBook();
        System.out.println("sapiens bindingType: " + sapiens.getBindingType());
        sapiens.checkOutBook();

        System.out.println();

        System.out.println("sapiens bindingType: " + sapiens.getSubject());
        sapiens.displaySubject();

//        error
//        System.out.println("headFirstJava bindingType: " + headFirstJava.getSubject());
//        headFirstJava.displaySubject();


        System.out.println();

    }
}
