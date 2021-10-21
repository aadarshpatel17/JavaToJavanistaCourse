package $1classesandobjects.$4methodsoverloadingandconstructors;

public class Main {
    public static void main(String[] args) {
//        Employee e1 = new Employee("Ratan", 2.3, 39999);
//        e1.printDetails();
//
//        Employee e2 = new Employee("Ramesh", 3.3, 54545);
//        e2.printDetails();
//
//        Employee e3 = new Employee("Suresh", 1.3, 88845);
//        e3.printDetails();

//        modify values using setters
//        e1.setName("James");
//        e2.setExperience(4.5);
//        e3.setSalary(100000);
//
//        System.out.println();
//        System.out.println("After Modifications: ");
//        e1.printDetails();
//        e2.printDetails();
//        e3.printDetails();

//        modify fields using update method from Employee class
//        System.out.println();
//        System.out.println("After Modifications: ");
//        e1.update("James", 3.5, 50000);
//        e1.printDetails();

//            After Adding bonus and increment methods
//        Employee first = new Employee("Alex", 3.2, 500000);
//        System.out.println("Bonus: " + first.calculateBonus(10));
//        System.out.println("Increment: " + first.calculateIncrement());
//        System.out.println("Updated Salary: " + first.getSalary());
//        System.out.println();

//        saving to database method
//        Employee first = new Employee("Alex", 3.2, 40000);
//        first.printDetails();
//        System.out.println("After update");
//        first.update("Alix", 4, 50000);
//        first.printDetails();

//        after creating overloaded update methods
        Employee first = new Employee("Alex", 3.2, 40000);
        first.printDetails();
        System.out.println("After update");
        first.update("Alix");
        first.printDetails();
        first.update("Alix", 5);
        first.printDetails();
        first.update("Alex", 6, 70000);
        first.printDetails();

    }
}
