package $13reflectionConstructorsMethodsFields.$10getterAndSetter;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

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

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        Class<?> employeeClass = Class.forName("$13reflectionConstructorsMethodsFields.$10getterAndSetter.Employee");

        System.out.println("************* accessing getters and setters");
        Method[] methods = employeeClass.getMethods();
        for (Method method: methods) {
            if(isGetter(method))
                System.out.println(method.getName() + " is getter");
            else if (isSetter(method))
                System.out.println(method.getName() + " is setter");
        }

    }

}
