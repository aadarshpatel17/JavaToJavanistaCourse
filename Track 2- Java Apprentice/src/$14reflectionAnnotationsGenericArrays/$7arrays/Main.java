package $14reflectionAnnotationsGenericArrays.$7arrays;

public class Main {

    /**
     * Working with Arrays Using Reflection
     *  -
     *
     * Focuses on how arrays can be used and instantiated and queried using reflection.
     */

    public static void main(String[] args) {

        System.out.println("************** primitive types");

        int[] intArray = new int[] {10, 20, 30};
        float[] floatArray = new float[] {10.1f, 20.2f, 30.3f};
        boolean[] booleanArray = new boolean[] {true, false, true};

        System.out.println(intArray.getClass());
        System.out.println(floatArray.getClass());
        System.out.println(booleanArray.getClass());
        System.out.println();


        System.out.println("************** primitive types");

        Integer[] integerArray = new Integer[] {10, 20, 30};
        Double[] doubleArray = new Double[] {10.1, 20.2, 30.3};
        String[] stringArray = new String[] {"Alice", "Bob", "Carlie"};

        System.out.println(integerArray.getClass());
        System.out.println(doubleArray.getClass());
        System.out.println(stringArray.getClass());
        System.out.println();

    }

}
