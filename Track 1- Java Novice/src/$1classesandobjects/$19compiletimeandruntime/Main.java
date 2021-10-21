package $1classesandobjects.$19compiletimeandruntime;

public class Main {
    public static void main(String[] args) {
        Book headFirstJava = new Book();
        Book effectiveJava = new Book();
        Book javaCookBook = new Book();

        // true
        System.out.println("Is headFirstJava an instance of Book Class?: " + (headFirstJava instanceof Book));
        System.out.println("Is effectiveJava an instance of Book Class?: " + (effectiveJava instanceof Book));
        System.out.println("Is javaCookBook an instance of Book Class?: " + (javaCookBook instanceof Book));

        System.out.println();

        // true
        System.out.println("Is headFirstJava an instance of Object Class?: " + (headFirstJava instanceof Object));
        System.out.println("Is effectiveJava an instance of Object Class?: " + (effectiveJava instanceof Object));
        System.out.println("Is javaCookBook an instance of Object Class?: " + (javaCookBook instanceof Object));

        System.out.println();

        Object headFirstJavaObject = headFirstJava;
        Object effectiveJavaObject = effectiveJava;
        Object javaCookBookObject = javaCookBook;

        // true
        System.out.println("Is headFirstJavaObject an instance of Book Class?: " + (headFirstJavaObject instanceof Object));
        System.out.println("Is effectiveJavaObject an instance of Book Class?: " + (effectiveJavaObject instanceof Object));
        System.out.println("Is javaCookBookObject an instance of Book Class?: " + (javaCookBookObject instanceof Object));

        System.out.println();

        System.out.println("headFirstJava's class: " + headFirstJava.getClass());
        System.out.println("effectiveJava's class: " + effectiveJava.getClass());
        System.out.println("javaCookBook's class: " + javaCookBook.getClass());

//        output
//        headFirstJava's class: class classesandobjects.$19compiletimeandruntime.Book
//        effectiveJava's class: class classesandobjects.$19compiletimeandruntime.Book
//        javaCookBook's class: class classesandobjects.$19compiletimeandruntime.Book

        System.out.println();

        System.out.println("headFirstJavaObject's class: " + headFirstJavaObject.getClass());
        System.out.println("effectiveJavaObject's class: " + effectiveJavaObject.getClass());
        System.out.println("javaCookBookObject's class: " + javaCookBookObject.getClass());

//        output
//        headFirstJavaObject's class: class classesandobjects.$19compiletimeandruntime.Book
//        effectiveJavaObject's class: class classesandobjects.$19compiletimeandruntime.Book
//        javaCookBookObject's class: class classesandobjects.$19compiletimeandruntime.Book

        System.out.println();

    }
}
