package $14reflectionAnnotationsGenericArrays.$1annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    /**
     * Accessing Annotations on Fields and Methods
     *      ANNOTATIONS in Java can be thought of as code elements that can be used to annotate or decorate
     *      other bits of code such as classes, parameters, return types or even type parameters.
     *
     *  -   The @Override annotation is used to decorate any method which overrides an implementation
     *      from some base class.
     *  -   The @SuppressWarnings annotation is used to tell the compiler not to flag certain operations
     *      with a warning. What type of warning - those that have to do with unchecked data.
     *  -   The @Deprecated is a way to users if they invoke a function or a method which is no longer
     *      going to be supported in the future versions.
     */

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> employeeClass = Class.forName("$14reflectionAnnotationsGenericArrays.$1annotations.Employee");

        System.out.println("******************* Field annotations");
        Field[] fields = employeeClass.getDeclaredFields();
        for(Field field: fields) {
            Annotation[] annotations = field.getAnnotations();
            if(annotations.length > 0) {
                System.out.println("-------------");
                System.out.println(field.getName());
                System.out.println("Annotations: " + Arrays.toString(annotations));
            }
        }
        System.out.println();

        System.out.println("******************* Method annotations");
        Method[] methods = employeeClass.getDeclaredMethods();
        /* NOTE: @Override and @SuppressWarnings annotations are not available at runtime
        *  The JVM does not have access to these annotations */
        for(Method method: methods) {
            Annotation[] annotations = method.getAnnotations();
            if(annotations.length > 0) {
                System.out.println("----------");
                System.out.println(method.getName());
                System.out.println("Annotations: " + Arrays.toString(annotations));
            }
        }
        System.out.println();

    }

}
