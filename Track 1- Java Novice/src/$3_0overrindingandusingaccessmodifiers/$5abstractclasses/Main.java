package $3_0overrindingandusingaccessmodifiers.$5abstractclasses;

public class Main {
    public static void main(String[] args) {

//        abstract class
//        An abstract class one that cannot be directly instantiated.
//        The only wat to instantiate such a class is to extend that class and
//        then instantiate the derived class.

//        abstract method
//        Abstract classes have often, but not always, have abstract methods.
//        These are methods which are not implemented, they are only defined.


        OnePlus onePlus = new OnePlus(499, true);
        System.out.println("One Plus: " + onePlus);
        IPhone iPhone = new IPhone(1200, true);
        System.out.println("iPhone: " + iPhone);

//        Phone motorola = new Phone("Android", "Moto G", 299);
//        System.out.println("motorola: " + motorola);



        System.out.println();

    }
}
