package $13reflectionConstructorsMethodsFields.$11functions;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    /**
     * Invoking Functions Using Reflection
     *
     * Changing the state of an object by invoking the setter methods on it.
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

        Class<?> employeeClass = Class.forName("$13reflectionConstructorsMethodsFields.$11functions.Employee");

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

        System.out.println("********** setter invocation");
        for(Method method: employeeClass.getDeclaredMethods()) {
            if(method.getName().equals("setName")) {
                method.invoke(employee, "Nora Roberts");
            } else if(method.getName().equals("setTitle")) {
                method.invoke(employee,"Accounts Director");
            } else if(method.getName().equals("setSalary")) {
                method.invoke(employee, 50000);
            }
        }
        System.out.println("Updated employee: " + employee);
        System.out.println();

        System.out.println("********** protected invocation");
        Method saveMethod = employeeClass.getDeclaredMethod("save", String.class, String.class, String.class);
        saveMethod.setAccessible(true);
        saveMethod.invoke(employee, "<some connection string>", "<some username>", "<some password>");

        Method computeBonusInternalMethod = employeeClass.getDeclaredMethod("computeBonusPercentage", float.class);
        computeBonusInternalMethod.setAccessible(true);
        System.out.println(computeBonusInternalMethod.invoke(employee, 0.1f));

    }

}
