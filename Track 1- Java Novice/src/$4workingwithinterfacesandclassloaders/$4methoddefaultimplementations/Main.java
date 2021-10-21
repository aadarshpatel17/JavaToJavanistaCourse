package $4workingwithinterfacesandclassloaders.$4methoddefaultimplementations;

public class Main {

    public static void main(String[] args) {

//        METHOD-IMPLEMENTATION IN INTERFACES:
//          using default/static as a keyword and implement method in interface
//          same as Automobile

//        OPEN_CLOSE_PRINCIPLE:
//          Classes should open for extension but closed for modification.

        Automobile huracan = new Lamborghini("Huracan", 70000.0, 320);

        System.out.println("Huracan: " + huracan);
        System.out.println("Huracan release date: " + huracan.getReleaseDate());

    }

}