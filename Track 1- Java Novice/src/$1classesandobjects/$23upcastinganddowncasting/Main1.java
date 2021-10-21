package $1classesandobjects.$23upcastinganddowncasting;

public class Main1 {

    public static void main(String[] args) {

//        up-casting
        NonFictionBook sapiens = new NonFictionBook();
        Book sapiensBook = sapiens;
        Object sapiensObject = sapiens;

        System.out.println("sapiens class: " + sapiens.getClass());
        System.out.println("sapiens class: " + sapiensBook.getClass());
        System.out.println("sapiens class: " + sapiensObject.getClass());

        System.out.println();

//        up-casting
        Book onTheOriginOfSpeciesBook = new NonFictionBook();
//        down-casting
        NonFictionBook onTheOriginOfSpecies = (NonFictionBook) onTheOriginOfSpeciesBook;
        Object onTheOriginOfSpeciesObject = onTheOriginOfSpeciesBook;

        System.out.println("onTheOriginOfSpecies class: " + onTheOriginOfSpecies.getClass());
        System.out.println("onTheOriginOfSpeciesBook class: " + onTheOriginOfSpeciesBook.getClass());
        System.out.println("onTheOriginOfSpeciesObject class: " + onTheOriginOfSpeciesObject.getClass());

        System.out.println();

//        up-casting
        Object effectiveJavaObject = new NonFictionBook();
//        down-casting
        Book effectiveJavaBook = (Book) effectiveJavaObject;
        NonFictionBook effectiveJava = (NonFictionBook) effectiveJavaObject;

        System.out.println("effectiveJava class: " + effectiveJava.getClass());
        System.out.println("effectiveJavaBook class: " + effectiveJavaBook.getClass());
        System.out.println("effectiveJavaObject class: " + effectiveJavaObject.getClass());

        System.out.println();



    }
}
