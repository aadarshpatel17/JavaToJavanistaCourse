package $13reflectionConstructorsMethodsFields.$7methodParameterAnnotations;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    /**
     * Viewing Method Parameters, Annotations, and More
     */

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> employeeClass = Class.forName("$13reflectionConstructorsMethodsFields.$7methodParameterAnnotations.Employee");

        System.out.println("*************** accessing method properties");
        Method[] methods = employeeClass.getMethods();
        for(Method method: methods) {
            System.out.println("------------");
            System.out.println(method.getName());
            System.out.println("Parameter count: " + method.getParameterCount());
            System.out.println("Parameter type: " + method.getParameterTypes());
            System.out.println("Return type: " + method.getReturnType());
            System.out.println("Exception types: " + Arrays.toString(method.getExceptionTypes()));
            System.out.println(method);
        }
        System.out.println();

    }

}
