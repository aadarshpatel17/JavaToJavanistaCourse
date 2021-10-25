package $12reflection.$6qualifiedClassName;

public class Main {

    /**
     * Viewing Fully Qualified Class Names
     *  -
     *
     * Accessing objects of user-defined class
     */

    private static class HR extends Department {
        public HR() {
            super("HR");
        }
    }

    public static void main(String[] args) {

        Organization organization = new Organization();
        Employee employee = new Employee();
        HR hr = new HR();

//        NOTE: The Department class is abstract and so cannot be instantiated
//              So, the preferred way of getting access to class object is Department.class

        Class<?> organizationClass = organization.getClass();
        Class<?> employeeClass = employee.getClass();
        Class<?> hrClass = hr.getClass();
        Class<?> departmentClass = Department.class;

        System.out.println("***** toString() representations of class object");
        System.out.println("Organization: " + organizationClass);
        System.out.println("Employee: " + employeeClass);
        System.out.println("HR: " + hrClass);      // HR is inner class, output: ...Main$HR
        System.out.println("Department: " + departmentClass);

        System.out.println();

//        NOTE: This gives us the fully qualified name of the class--
        System.out.println("***** Fully-qualified names of the classes");
        System.out.println("Organization class name: " + organizationClass.getName());
        System.out.println("Employee class name: " + employeeClass.getName());
        System.out.println("HR class name: " + hrClass.getName());
        System.out.println("Department class name: " + departmentClass.getName());
        System.out.println();

//        NOTE: This gives us only the class name--
        System.out.println("***** Fully-qualified names of the classes");
        System.out.println("Organization class name: " + organizationClass.getSimpleName());
        System.out.println("Employee class name: " + employeeClass.getSimpleName());
        System.out.println("HR class name: " + hrClass.getSimpleName());
        System.out.println("Department class name: " + departmentClass.getSimpleName());
        System.out.println();

    }

}
