package $13reflectionConstructorsMethodsFields.$1constructors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    /**
     * Accessing Constructors Using Reflection
     *  -
     *
     * Instantiating objects of a given class
     */

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {

        /**
         * ClassNotFoundException: occurs when the class loader cannot find a particular class
         *  that we are looking to instantiate.
         * NoSuchMethodException: occurs when we call a method which is not present in the class.
         * IllegalAccessException: occurs if the constructors objects needs to enforce access control
         *  based on access modifier such as public, private, protected, internal and so on.
         * InvocationTargetException: thrown by reflection APIs. If the underlying constructor throws
         *  an exception, you can think of it as a cascaded exception.
         * InstantiationException: is going to result if the class which declared the underlying
         *  constructor is abstract and therefore cannot be instantiated.
         */

        Class<?> employeeClass = Class.forName("$13reflectionConstructorsMethodsFields.$1constructors.Employee");
        System.out.println("************ public constructors");
        Constructor<?>[] constructors = employeeClass.getConstructors();

        for(Constructor<?> constructor: constructors) {
            System.out.println(constructor);
        }

        System.out.println();

        System.out.println("*********** public + protected + private constructors");
        constructors = employeeClass.getDeclaredConstructors();
        for(Constructor<?> constructor: constructors) {
            System.out.println("--- Constructor + Parameter types");
            System.out.println(constructor);

            Class<?>[] parameters = constructor.getParameterTypes();
            for(Class<?> parameter: parameters) {
                System.out.println(parameter);
            }
        }

        System.out.println();

        System.out.println("*********** No argument constructor");

        Constructor<?> noArgumentConstructor = employeeClass.getConstructor();

        System.out.println(noArgumentConstructor);

        Object object = noArgumentConstructor.newInstance();
        System.out.println("Object: " + object);

        Employee employee = (Employee) noArgumentConstructor.newInstance();
        System.out.println("Employee: " + employee);

        System.out.println();

    }

}
