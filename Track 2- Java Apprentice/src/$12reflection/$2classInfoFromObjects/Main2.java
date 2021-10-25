package $12reflection.$2classInfoFromObjects;

public class Main2 {

    public static void main(String[] args) {

        /**
         * Extracting Classes Information From Objects
         */

        Employee jessica = new Employee("Jessica", "VP", 124000);

        System.out.println("Employee Jessica: " + jessica);

        Class<?> employeeClass = jessica.getClass();

        System.out.println("Class for object Jessica: " + employeeClass );


    }

}
