package $13reflectionConstructorsMethodsFields.$9annotationRuntimePolicy;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {

    /**
     * Recognizing Annotation Runtime Policy Implications
     */

    public static void printMethodProperties(Method method) {

        System.out.println("--------------");
        System.out.println(method.getName());
        System.out.println("Parameter count: " + method.getParameterCount());
        System.out.println("Parameter types: " + method.getParameterTypes());
        System.out.println("Return type: " + method.getReturnType());
        System.out.println("Exception types: " + Arrays.toString(method.getExceptionTypes()));

        /* NOTE: Returns annotations that are directly present on this element.
         *  NOTE: The @Override and @SuppressWarnings annotation is not retained for reflective access */
        System.out.println("Annotations: " + Arrays.toString(method.getDeclaredAnnotations()));
        System.out.println("Check for @Override annotations: " + method.getAnnotation(Override.class));
        System.out.println("Check for @SuppressWarning annotations: " + method.getAnnotation(SuppressWarnings.class));
        System.out.println("Check for @Deprecated annotations: " + method.getAnnotation(Deprecated.class));

        int modifiers = method.getModifiers();
        System.out.println("Modifiers: " + Integer.toBinaryString(modifiers));
        System.out.println("Modifiers (string representation): " + Modifier.toString(modifiers));
        System.out.println();

    }


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        Class<?> employeeClass = Class.forName("$13reflectionConstructorsMethodsFields.$9annotationRuntimePolicy.Employee");

        System.out.println("*************** accessing method by name");
        Method toStringMethod = employeeClass.getMethod("toString");
        printMethodProperties(toStringMethod);

        Method createEmployeeMethod = employeeClass.getMethod("createEmployee", String.class, String.class, double.class);
        printMethodProperties(createEmployeeMethod);

        Method saveFilenameMethod = employeeClass.getMethod("save", String.class);
        printMethodProperties(saveFilenameMethod);

        /* NOTE: The @Deprecated annotation is retained at runtime (retention policy set to RUNTIME) */
        Method printEmployeeDetailsMethod = employeeClass.getMethod("printEmployeeDetails");
        printMethodProperties(printEmployeeDetailsMethod);

        Method saveDatabaseMethod = employeeClass.getDeclaredMethod("save", String.class, String.class, String.class);
        printMethodProperties(saveDatabaseMethod);

        /* NOTE: The modifiers include strictfp for strict, floating point calculations */
        Method toRadiansMethod = StrictMath.class.getMethod("toRadians", double.class);
        printMethodProperties(toRadiansMethod);

    }

}
