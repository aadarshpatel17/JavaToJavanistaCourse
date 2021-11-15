package $13reflectionConstructorsMethodsFields.$6accessModifiers;

import java.lang.reflect.Method;

public class Main {

    /**
     * Accessing Public, Private and Protected Methods
     *  -
     */

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> objectClass = Class.forName("java.lang.Object");

        System.out.println("************* accessing public methods");
        Method[] methods = objectClass.getMethods();
        for(Method method: methods) {
            System.out.println(method);
        }
        System.out.println();
        /**
         * Output contains: public final native java.lang.Class java.lang.Object.getClass()
         *  Here, native indicates that the method is implemented in a language other than Java
         *  such as C or C++.
         * These were part of a technology known as JNI or Java Native Interface.
         */

        System.out.println("************* accessing public + protected + private methods");
        methods = objectClass.getDeclaredMethods();
        for(Method method: methods) {
            System.out.println(method);
        }
        System.out.println();

        System.out.println("************* accessing method properties");
        Method[] methodProperties = objectClass.getMethods();

        for(Method method: methodProperties) {
            System.out.println("-------------");
            System.out.println("Method name: " + method.getName());
            System.out.println("Parameter count: " + method.getParameterCount());
            System.out.println("Parameter type: " + method.getParameterTypes());
            System.out.println("Return type: " + method.getReturnType());
        }
        System.out.println();

    }

}
