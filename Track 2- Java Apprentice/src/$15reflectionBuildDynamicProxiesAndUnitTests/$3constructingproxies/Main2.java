package $15reflectionBuildDynamicProxiesAndUnitTests.$3constructingproxies;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

    /**
     * Constructing Proxies to Pass Method Invocations
     *  -
     */

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        List proxyList = (List) Proxy.newProxyInstance(
                Main2.class.getClassLoader(),
                new Class[] {List.class},
                new ListInvocationHandler(list)
        );

        proxyList.add("Java");
        System.out.println(list);

        proxyList.add("Python");
        proxyList.add("C++");
        proxyList.add("C#");
        proxyList.add("JavaScript");
        System.out.println(list);

        proxyList.remove("Java");
        System.out.println(list);

        proxyList.remove("JavaScript");
        System.out.println(list);

        System.out.println("Index 2: " + proxyList.get(2));
        System.out.println("Index 0: " + proxyList.get(0));

    }
}
