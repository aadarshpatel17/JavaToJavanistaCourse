package $15reflectionBuildDynamicProxiesAndUnitTests.$5writeunittest;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Using Annotations to Write Unit Test
     *  -
     */

    public static void main(String[] args)
        throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {

        Class<?> employeeTestClass = Class.forName("$15reflectionBuildDynamicProxiesAndUnitTests.$5writeunittest.EmployeeTest");

        Method[] methods = employeeTestClass.getDeclaredMethods();

        Method setupMethod = null;
        Method teardownMethod = null;

        List<Method> testcaseMethods = new ArrayList<>();

        for(Method method: methods) {
            Annotation setupAnnotation = method.getAnnotation(Setup.class);
            Annotation teardownAnnotation = method.getAnnotation(Teardown.class);
            Annotation testcaseAnnotation = method.getAnnotation(TestCase.class);

            if(setupAnnotation != null) {
                setupMethod = method;
            } else if(teardownAnnotation != null) {
                teardownMethod = method;
            } else if(testcaseAnnotation != null) {
                testcaseMethods.add(method);
            }

            System.out.println("------------");

            System.out.println("Found setup method: " + setupMethod);
            System.out.println("Found teardown method: " + teardownMethod);
            System.out.println("Found testcase method: " + testcaseMethods);

            System.out.println();

        }

        System.out.println("------------");

        if(setupMethod == null) {
            System.err.println("Please specify setup method");
            System.exit(1);
        }
        if(teardownMethod == null) {
            System.err.println("Please specify teardown method");
            System.exit(1);
        }
        if(testcaseMethods == null) {
            System.err.println("Please specify testcase method");
            System.exit(1);
        }
        System.out.println();

        System.out.println("------------- Starting tests");

        Object employeeTestInstance = employeeTestClass.getConstructor().newInstance();

        List<Method> failedMethods = new ArrayList<>();

        for(Method method: testcaseMethods) {
            setupMethod.invoke(employeeTestInstance);

            try {
                method.invoke(employeeTestInstance);
                System.out.println("Testcase passed:--) " + method);
            } catch (InvocationTargetException e) {
                failedMethods.add(method);
                System.out.println("Testcase failed:--( " + method);
            }
            teardownMethod.invoke(employeeTestInstance);
        }

        System.out.println("--------------- Tests completed");

        if(!failedMethods.isEmpty()) {
            System.out.println("The following test cases failed");

            for(Method method: failedMethods) {
                System.out.println(method.getName());
            }
        } else {
            System.out.println("All tests passed!");
        }

    }

}
