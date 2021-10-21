package $1classesandobjects.$22roleofvariableandobjecttype;

public class Main1 {
    public static void main(String[] args) {

        NonFictionBook sapiens = new NonFictionBook();
        Book book = new NonFictionBook();
        Object object = new NonFictionBook();

//        true
        System.out.println("sapiens is instanceof NonFictionBook" + (sapiens instanceof NonFictionBook));
        System.out.println("sapiens is instanceof Book" + (sapiens instanceof Book));
        System.out.println("sapiens is instanceof Object" + (sapiens instanceof Object));
        System.out.println();

//        true
        System.out.println("book is instanceof NonFictionBook" + (book instanceof NonFictionBook));
        System.out.println("book is instanceof Book" + (book instanceof Book));
        System.out.println("book is instanceof Object" + (book instanceof Object));
        System.out.println();

//        true
        System.out.println("object is instanceof NonFictionBook" + (object instanceof NonFictionBook));
        System.out.println("object is instanceof Book" + (object instanceof Book));
        System.out.println("object is instanceof Object" + (object instanceof Object));
        System.out.println();

//        accessing using NonFictionBook class object
        sapiens.checkOutBook();
        sapiens.displaySubject();
        System.out.println();

//        accessing using Book class object
        book.checkOutBook();

        // error cannot access derived class methods because the object type is
        // of higher order
//        book.displaySubject();

        System.out.println();

//        accessing using Object class object
        // error cannot access derived class methods because the object type is
        // of higher order
//        object.checkOutBook();
//        object.displaySubject();

        System.out.println();

    }
}
