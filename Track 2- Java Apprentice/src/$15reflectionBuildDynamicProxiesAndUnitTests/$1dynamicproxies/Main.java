package $15reflectionBuildDynamicProxiesAndUnitTests.$1dynamicproxies;

import java.lang.reflect.Proxy;

public class Main {

    /**
     * Working with Dynamic Proxies
     *  -   What is dynamic proxy?
     *  -   It is an object which implements or seems to implement any interface that you like.
     *      You can invoke any interface method on that object. But under the hood, that object
     *      is relaying that call onto some underlying method.
     *  -   The important point is that no matter which interface control goes down to the same
     *      method inside the invocation handler object. And the mediation of this entire process
     *      is carried out by another object called the proxy.
     *  -   The invocation handler as well as the proxy are both provided by the Java reflection
     *      APIs.
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

    }

}
