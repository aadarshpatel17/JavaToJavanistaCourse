package $15reflectionBuildDynamicProxiesAndUnitTests.$3constructingproxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class ListInvocationHandler implements InvocationHandler {

    private final List<String> list;

    public ListInvocationHandler(List<String> list) {
        this.list = list;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----------");

        System.out.println("Method invoked: " + method);
        System.out.println("Arguments: " + Arrays.toString(args));

        System.out.println("-----------");

        return method.invoke(list, args);
    }

}
