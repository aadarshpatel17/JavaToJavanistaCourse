package $15reflectionBuildDynamicProxiesAndUnitTests.$3constructingproxies;

import java.lang.reflect.Proxy;
import java.util.List;

public class Main {

    /**
     * Constructing Proxies to Pass Method Invocations
     *  -
     */

    public static void main(String[] args) {

        List proxyList = (List) Proxy.newProxyInstance(
                Main.class.getClassLoader(),
                new Class[] {List.class},
                new SimplePrintInvocationHandler()
        );

        System.out.println();

        proxyList.add("Java");

        System.out.println();

        proxyList.clear();

        proxyList.remove(12345);

    }
}
