package $14reflectionAnnotationsGenericArrays.$5genericclassesandmethod;

public class Main {

    /**
     * Using Reflection with Generics Classes and Methods
     *  -
     *
     * The limitations of reflection in the context of type parameters and parameterized classes.
     */

    public static void main(String[] args) {

        /* NOTE: You cannot tell what type your object has been parameterized to
        *  You can tell that this is a parameterized instance, but you cannot tell the
        *  type of parameter */

        System.out.println("****************** Parameterizable class");
        Container<String> container = new Container<>("Hello");

        Class<?> containerClass = container.getClass();

        System.out.println("Container class: " + containerClass);
        System.out.println("Container class (generic string): " + containerClass.toGenericString());
        System.out.println("Container class (superclass): " + containerClass.getSuperclass());
        System.out.println("Container class (generic superclass): " + containerClass.getGenericSuperclass());
        System.out.println();

        /* NOTE: In this derived class, we can tell what type parameter we used to
         *  define this class when we inherited from the base class. */
        Container<Integer> integerContainer = new IntegerContainer(123);

        System.out.println("***************** Non-parameterizable derived class (integer)");

        Class<?> integerContainerClass = integerContainer.getClass();

        System.out.println("IntegerContainer class: " + integerContainerClass);
        System.out.println("IntegerContainer class (generic class): " + integerContainerClass.toGenericString());
        System.out.println("IntegerContainer class (superclass): " + integerContainerClass.getSuperclass());
        System.out.println("IntegerContainer class (generic superclass): " + integerContainerClass.getGenericSuperclass());
        System.out.println();

        /* NOTE: In this derived class, we can tell what type parameter we used to
         *  define this class when we inherited from the base class. */
        Container<String> stringContainer = new StringContainer("Hello");

        System.out.println("***************** Non-parameterizable derived class (string)");

        Class<?> stringContainerClass = stringContainer.getClass();

        System.out.println("IntegerContainer class: " + stringContainerClass);
        System.out.println("IntegerContainer class (generic class): " + stringContainerClass.toGenericString());
        System.out.println("IntegerContainer class (superclass): " + stringContainerClass.getSuperclass());
        System.out.println("IntegerContainer class (generic superclass): " + stringContainerClass.getGenericSuperclass());
        System.out.println();

    }

}
