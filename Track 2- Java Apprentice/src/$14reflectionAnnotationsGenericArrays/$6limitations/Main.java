package $14reflectionAnnotationsGenericArrays.$6limitations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class Main {

    /**
     * Exploring Limitations of Reflection and Generics
     *  -
     *
     * The Reflection APIs simply are not able to correctly detect the type.
     */

    private static void printParameterizedTypeDetails(ParameterizedType parameterizedType) {
        Type[] typeArguments = parameterizedType.getActualTypeArguments();
        for(Type typeArgument: typeArguments) {
            System.out.println("Type: " + typeArgument);
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {

        Container<String> container = new Container<>("Hello");
        ContainerWrapper<String> containerWrapper = new ContainerWrapper<>(container);

        System.out.println("*************** Parameterized return type");
        Method getContainerMethod = containerWrapper.getClass().getMethod("getContainer");

        System.out.println("getContainer() return type: " + getContainerMethod.getReturnType());
        System.out.println("getContainer() generic return type: " + getContainerMethod.getGenericReturnType());

        /* NOTE: The actual information of type parameter i.e., java.lang.String has been lost. */
        printParameterizedTypeDetails((ParameterizedType) getContainerMethod.getGenericReturnType());
        System.out.println();

        System.out.println("*************** Parameterized input parameters");
        Method setContainerMethod = containerWrapper.getClass().getMethod("setContainer", Container.class);

        System.out.println("setContainer(Container) parameter type: " + Arrays.toString(setContainerMethod.getParameterTypes()));
        System.out.println("setContainer(Container) generic parameter type: " + Arrays.toString(setContainerMethod.getGenericParameterTypes()));

        printParameterizedTypeDetails((ParameterizedType) (setContainerMethod.getGenericParameterTypes()[0]));
        System.out.println();

        System.out.println("*************** Parameterized field");
        Field containerField = containerWrapper.getClass().getDeclaredField("container");

        System.out.println("container field type: " + containerField.getType());
        System.out.println("container field generic type: " + containerField.getGenericType());

        printParameterizedTypeDetails((ParameterizedType) (containerField.getGenericType()));
        System.out.println();

    }

}
