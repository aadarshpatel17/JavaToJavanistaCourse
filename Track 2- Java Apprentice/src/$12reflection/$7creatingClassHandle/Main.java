package $12reflection.$7creatingClassHandle;

public class Main {

    /**
     * Creating Class Handles from Class Names
     *  -
     *
     *
     * How to get a handle to a class from the name of the class in the form of string
     *  - uses to make runtime decisions about which object, you are going to instantiate
     */

    private static class HR extends Department {
        public HR() {
            super("HR");
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> organizationClass = Class.forName("$12reflection.$7creatingClassHandle.Organization");
        Class<?> employeeClass = Class.forName("$12reflection.$7creatingClassHandle.Employee");
        Class<?> hrClass = Class.forName("$12reflection.$7creatingClassHandle.Main$HR");
        Class<?> departmentClass = Class.forName("$12reflection.$7creatingClassHandle.Department");

        System.out.println("***** toString() representations of custom class objects");
        System.out.println("Organization: " + organizationClass);
        System.out.println("Employee: " + employeeClass);
        System.out.println("HR: " + hrClass);
        System.out.println("Department: " + departmentClass);
        System.out.println();

        Class<?> doubleClass = Class.forName("java.lang.Double");
        Class<?> hashSetClass = Class.forName("java.util.HashSet");
        Class<?> stringArrayClass = Class.forName("[[Ljava.lang.String;");
        Class<?> intArrayClass = Class.forName("[I");

        System.out.println("***** toString() representations of Java class objects");
        System.out.println("Double: " + doubleClass);
        System.out.println("HashSet: "+ hashSetClass);
        System.out.println("String array: " + stringArrayClass);
        System.out.println("int array: " + intArrayClass);
        System.out.println();

//        trying to access non-existing class
        Class<?> enggClass = Class.forName("$12reflection.$7creatingClassHandle.Main$Engineering");

    }

}
