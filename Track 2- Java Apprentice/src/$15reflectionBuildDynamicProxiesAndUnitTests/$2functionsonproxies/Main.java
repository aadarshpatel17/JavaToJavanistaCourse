package $15reflectionBuildDynamicProxiesAndUnitTests.$2functionsonproxies;

import java.lang.reflect.Proxy;

public class Main {

    /**
     * Invoking Interface and Object Functions on Proxies
     *  -
     */

    public static void main(String[] args) {

        /* down-casting Object to Repository interface which is return by Proxy.newProxyInstance which is
         * static method in Proxy class */
        Repository proxyRepository = (Repository) Proxy.newProxyInstance(
                /* first argument class loader instance ClassLoader is abstract class but
                 * Main.class.getClassLoader() gives us a concrete instance of this abstract class */
                Main.class.getClassLoader(),
                /* Array of interface object which is basically a class object */
                new Class[] {Repository.class},
                /* InvocationHandler (interface which comes as a part of the reflection APIs) */
                new SimplePrintInvocationHandler()
        );

        System.out.println();

        proxyRepository.create("Hello");

        System.out.println();

        proxyRepository.read(12345);

        System.out.println();

        proxyRepository.update("World");

        System.out.println();

        proxyRepository.delete(67890);

        System.out.println();

        /* can also invoke methods from universal base class */
        proxyRepository.toString();

        System.out.println();

        System.out.println(proxyRepository);

        System.out.println();

        /* exception: exceptions can be understood properly while using Reflection APIs
        *  here, exception occurs due to return type of SimpleInputInvocationHandler invoke method return type
        *  which is string and hashCode() return integer */
//        proxyRepository.hashCode();

    }

}
