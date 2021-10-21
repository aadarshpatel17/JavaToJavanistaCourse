package $1classesandobjects.$5methodoverloadingandcodereuse;

public class Main {
    public static void main(String[] args) {
//        after creating overloaded update methods
        Employee first = new Employee("Alex", 3.2, 40000);
        first.printDetails();
        System.out.println("After update");
//        first.update("Alix");
//        first.printDetails();
//        first.update("Alix", 5);
//        first.printDetails();
        first.update("Alex", 6, 70000);
        first.printDetails();
    }
}
