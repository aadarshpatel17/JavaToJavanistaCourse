package $1classesandobjects.$21creatinginheritancehierarchies;

public class Main {
    public static void main(String[] args) {

//        NonFictionBook sapiens = new NonFictionBook();
//        NonFictionBook onTheOriginOfSpecies = new NonFictionBook();
//
////        true
//        System.out.println("sapiens instanceof NonFicitonBook: " + (sapiens instanceof NonFictionBook));
//        System.out.println("sapiens instanceof Book: " + (sapiens instanceof Book));
//        System.out.println("sapiens instanceof Object: " + (sapiens instanceof Object));
//
//        System.out.println();
//
////        true
//        System.out.println("onTheOriginOfSpecies instanceof NonFicitonBook: " + (onTheOriginOfSpecies instanceof NonFictionBook));
//        System.out.println("onTheOriginOfSpecies instanceof Book: " + (onTheOriginOfSpecies instanceof Book));
//        System.out.println("onTheOriginOfSpecies instanceof Object: " + (onTheOriginOfSpecies instanceof Object));
//
//        System.out.println();
//
////        derived class object can access fields and methods of base class of any level
//        System.out.println("sapiens bindingType: " + sapiens.getBindingType());
//        sapiens.checkOutBook();
//
//        System.out.println("onTheOriginOfSpecies bindingType: " + onTheOriginOfSpecies.getBindingType());
//        onTheOriginOfSpecies.checkOutBook();
//
//        System.out.println();
//
//        System.out.println("sapiens's class: " + sapiens.getClass());
//        System.out.println("onTheOriginOfSpecies's class: " + onTheOriginOfSpecies.getClass());
////        output: NonFictionBook

        System.out.println();




//        now accessing every level of hierarchy using most grand child class
        NonFictionBook sapiens = new NonFictionBook();
        NonFictionBook onTheOriginOfSpecies = new NonFictionBook();

//        values of same class NonFictionBook
        System.out.println("sapiens subject: " + sapiens.getSubject());
        sapiens.displaySubject();
        System.out.println("onTheOriginOfSpecies subject: " + onTheOriginOfSpecies.getSubject());
        onTheOriginOfSpecies.displaySubject();

        System.out.println();

//        one level up Book class
        System.out.println("sapiens bindingType: " + sapiens.getBindingType());
        sapiens.checkOutBook();
        System.out.println("onTheOriginOfSpecies bindingType: " + onTheOriginOfSpecies.getBindingType());
        onTheOriginOfSpecies.checkOutBook();

        System.out.println();

//        one level up Object class
        System.out.println("sapiens's class: " + sapiens.getClass());
        System.out.println("onTheOriginOfSpecies's class: " + onTheOriginOfSpecies.getClass());

        System.out.println();

    }
}
