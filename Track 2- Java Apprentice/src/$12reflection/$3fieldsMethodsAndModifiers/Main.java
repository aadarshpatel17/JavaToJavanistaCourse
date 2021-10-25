package $12reflection.$3fieldsMethodsAndModifiers;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    /**
     * Viewing Class Fields, Methods, and Their Modifiers
     *  Reflection Field Class:
     *      -   Field : only includes member variables
     *      -   getFields() method returns an array of public fields
     *      -   getDeclaredFields() method returns an array of all kind of fields (public, private, etc.)
     *  Reflection Method Class:
     *      -   getMethods() method returns an array of public methods
     *      -   getDeclaredMethods() method returns an array of all kind of methods (public, private, etc.)
     *  Reflection Constructor:
     *      -   getConstructors() method returns an array of public constructors
     *      -   getDeclaredConstructors() method returns an array of all kind of constructors (public, private, etc.)
     */

    public static void main(String[] args) {

        /**
         * The starting point for the use of Reflection is getting a handle to the class that a particular objects
         * belongs to. And that class is itself an object of a class 'Class' which the entry point from which we
         * can access whole host of Reflection APIs in Java.
         */

        Employee jessica = new Employee("Jessica", "VP", 124000);

        System.out.println("Employee Jessica: " + jessica);

        Class<?> employeeClass = jessica.getClass();

        System.out.println("Class for object Jessica: " + employeeClass);

//        Implementing Reflection Field class--
        Field[] fields = employeeClass.getFields();
        Field[] allFields = employeeClass.getDeclaredFields();

        System.out.println("Fields of the Employee class: " + fields);
        System.out.println();

        for(Field field: fields) {
            System.out.println(field);
        }
        System.out.println();


//        Implementing Reflection Method class--
        Method[] methods = employeeClass.getMethods();
        Method[] allMethods = employeeClass.getDeclaredMethods();

        System.out.println("Methods of the Employee class: " + methods);
        System.out.println();

        for(Method method: methods) {
            System.out.println(method);
        }
        System.out.println();

//        Implementing Reflection Constructor class--
        Constructor<?>[] constructors = employeeClass.getConstructors();
        Constructor<?>[] allConstructors = employeeClass.getDeclaredConstructors();

        System.out.println("Constructors of the Employee class: " + constructors);
        System.out.println();

        for(Constructor<?> constructor: constructors) {
            System.out.println(constructor);
        }
        System.out.println();

    }

}
