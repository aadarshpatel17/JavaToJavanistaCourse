package $1classesandobjects.$20instantiatingobjectofbaseandderivedclass;

public class Main {
    public static void main(String[] args) {

        Book headFirstJava = new Book();
        System.out.println("headFirstJava bindingType: " + headFirstJava.getBindingType());
        headFirstJava.checkOutBook();

        System.out.println();

        Book effectiveJava = new Book();
        System.out.println("effectiveJava bindingType: " + effectiveJava.getBindingType());
        effectiveJava.checkOutBook();

        System.out.println();

        System.out.println("headFirstJava's class: " + headFirstJava.getClass());
        System.out.println("effectiveJava's class: " + effectiveJava.getClass());

        System.out.println();

//        base class can hold variable of derived class
//        but can't call any fields or methods from derived class

        Object headFirstJavaObject = headFirstJava;
        Object effectiveJavaObject = effectiveJava;

        System.out.println("headFirstJavaObject's class: " + headFirstJavaObject.getClass());
        System.out.println("effectiveJavaObject's class: " + effectiveJavaObject.getClass());

        System.out.println();

//        this will produce error
//        NOTE: we can't call derived class functions with the help of base class
//        object - headFirstJavaObject or effectiveJavaObject

//        headFirstJavaObject.checkOutBook();
//        System.out.println("headFirstJavaObject bindingType: " + headFirstJavaObject.getBindingType());


    }
}
