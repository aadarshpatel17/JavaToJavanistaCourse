package $14reflectionAnnotationsGenericArrays.$2customannotations;

import java.lang.annotation.Annotation;

public class Main {

    /**
     * Configuring Custom Annotations for Reflective Access
     *  -
     *
     * Creating custom annotations
     */

    /**
     *  -   Any custom annotation needs to have a retention policy and a target policy.
     *  -   These two policies are defined using annotations on the custom annotation code.
     *  -   If we leave out the target and retention policies, these pick up default values.
     *
     *  TARGET POLICY defines what code elements we can annotate with this particular custom
     *      annotation. If no target policy specified, that means this annotation can be used
     *      as modifier for anything except a type parameter.
     *  RETENTION POLICY is also specified via a @retention annotation. The default value
     *      is retentionPolicy.class. This means that this annotation will only be retained
     *      for up to the point where the code is compiled into byte code i.e., class file.
     *      The annotation will not be available for use at runtime.
     *
     */

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException {

        Class<?> employeeClass = Class.forName("$14reflectionAnnotationsGenericArrays.$2customannotations.Employee");

        /* NOTE: This access annotations that are "present" on an element (or any base class version of itself) */
        System.out.println("********** @Required annotation using getAnnotations()");

        Annotation requiredClassAnnotation = employeeClass.getAnnotation(Required.class);
        Annotation requiredFieldAnnotation = employeeClass.getDeclaredField("employeeId").getAnnotation(Required.class);
        Annotation requiredMethodAnnotation = employeeClass.getDeclaredMethod("getEmployeeId").getAnnotation(Required.class);

        System.out.println("Required class annotation: " + requiredClassAnnotation);
        System.out.println("Required field annotation: " + requiredFieldAnnotation);
        System.out.println("Required method annotation: " + requiredMethodAnnotation);
        System.out.println();

        /* NOTE: This access annotations that are "directly present" on an element */
        System.out.println("********** @Required annotation using getDeclaredAnnotation()");

        requiredClassAnnotation = employeeClass.getDeclaredAnnotation(Required.class);
        requiredFieldAnnotation = employeeClass.getDeclaredField("employeeId").getDeclaredAnnotation(Required.class);
        requiredMethodAnnotation = employeeClass.getDeclaredMethod("getEmployeeId").getDeclaredAnnotation(Required.class);

        System.out.println("Required class annotation: " + requiredClassAnnotation);
        System.out.println("Required field annotation: " + requiredFieldAnnotation);
        System.out.println("Required method annotation: " + requiredMethodAnnotation);
        System.out.println();

    }

}
