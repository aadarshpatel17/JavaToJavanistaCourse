package $15reflectionBuildDynamicProxiesAndUnitTests.$1dynamicproxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class SimplePrintInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---------------");

        System.out.println("Proxy: " + proxy.getClass());
        System.out.println("Method invoked: " + method);
        System.out.println("Arguments: " + Arrays.toString(args));

        System.out.println("---------------");

        return "Any return value is fine here";
    }

}
