package $12reflection.$2classInfoFromObjects;


public class Main {

    public static void main(String[] args) {

        /**
         * Extracting Classes Information From Objects
         */

        Employee jessica = new Employee("Jessica", "VP", 124000);

        System.out.println("Employee Jessica: " + jessica);
        System.out.println("ID: " + jessica.getEmployeeId());
        System.out.println("Name: " + jessica.getName());
        System.out.println("Title:" + jessica.getTitle());
        System.out.println("Salary: " + jessica.getSalary());
        System.out.println();

//        class details using type introspection
        System.out.println("Employee Jessica: " + jessica);
        System.out.println("Class for object Jessica: " + jessica.getClass());
        System.out.println("The Employee class: " + Employee.class);
        System.out.println();
//        NOTE: Every class is a variable in java, and we can invoke property on variable like Employee.class

        System.out.println("The class object is of type java.lang.Class: " + (jessica.getClass() instanceof java.lang.Class));
        System.out.println("This is the same class object of type java.lang.Class: " + (Employee.class instanceof java.lang.Class));
        System.out.println();

        System.out.println("Both are exactly the same class objects: " + (jessica.getClass().equals(Employee.class)));

    }

}
