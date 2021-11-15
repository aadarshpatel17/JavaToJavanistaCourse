package $13reflectionConstructorsMethodsFields.$10getterAndSetter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main2 {

    /**
     * Identifying Getters and Setters Using Heuristics
     *
     * Using reflection to invoke methods on a specific object.
     */

    private static boolean isGetter(Method method) {
        if(!method.getName().startsWith("get"))
            return false;
        if(!((method.getModifiers() & Modifier.PUBLIC) == Modifier.PUBLIC))
            return false;
        if(method.getReturnType().equals(void.class))
            return false;
        if(method.getParameterCount() != 0)
            return false;

        return true;
    }

    private static boolean isSetter(Method method) {
        if(!method.getName().startsWith("set"))
            return false;
        if(!((method.getModifiers() & Modifier.PUBLIC) == Modifier.PUBLIC))
            return false;
        if(!method.getReturnType().equals(void.class))
            return false;
        if(method.getParameterCount() != 1)
            return false;

        return true;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {

        Class<?> employeeClass = Class.forName("$13reflectionConstructorsMethodsFields.$10getterAndSetter.Employee");

        System.out.println("************* public static invocation");
        Method createEmployeeMethod = employeeClass.getMethod("createEmployee", String.class, String.class, double.class);

        /* NOTE: For static method invocations, pass in "null" as the first input argument, there is no
        *  object against which the method is invoked */
        Employee employee = (Employee) createEmployeeMethod.invoke(null, "Nora", "Accounts Manager", 45000);

        System.out.println("Employee: " + employee);
        System.out.println();

        System.out.println("************ getter invocation");

        for(Method method: employeeClass.getDeclaredMethods()) {
            if(isGetter(method))
                System.out.println(method.invoke(employee));
        }
        System.out.println();

    }

}
