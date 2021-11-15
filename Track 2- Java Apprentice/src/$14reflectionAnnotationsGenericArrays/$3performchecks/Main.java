package $14reflectionAnnotationsGenericArrays.$3performchecks;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {

    /**
     * Scenario: Accessing Annotations to Perform Checks
     *
     * Define a custom annotation, use this annotation to impose a constraint on a field in our class.
     *  And then, using Reflection to check whether this constraint has been satisfied or not.
     */

    public static void printParameterDetailsAndAnnotations(
            Class<?>[] parameterTypes, Annotation[][] parameterAnnotations) {

        int index = 0;
        for(Class<?> parameterType: parameterTypes) {
            System.out.println("--------------");
            System.out.println(parameterType);

            Annotation[] parameterAnnotation = parameterAnnotations[index];
            for(Annotation annotation: parameterAnnotation) {
                System.out.println(annotation);
            }
            index++;
        }
        System.out.println();
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {

        Class<?> employeeClass = Class.forName("$14reflectionAnnotationsGenericArrays.$3performchecks.Employee");

        System.out.println("********** Annotations on constructor parameters");
        Constructor<?> constructor = employeeClass.getConstructor(String.class, String.class, double.class);
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        printParameterDetailsAndAnnotations(parameterTypes, parameterAnnotations);

        System.out.println("********** Annotations on method parameters");
        Method setNameMethod = employeeClass.getMethod("setName", String.class);
        printParameterDetailsAndAnnotations(setNameMethod.getParameterTypes(), setNameMethod.getParameterAnnotations());

        Method setTitleMethod = employeeClass.getMethod("setTitle", String.class);
        printParameterDetailsAndAnnotations(setTitleMethod.getParameterTypes(), setTitleMethod.getParameterAnnotations());

    }

}
