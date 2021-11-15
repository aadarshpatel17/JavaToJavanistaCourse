package $14reflectionAnnotationsGenericArrays.$8arraytypes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    /**
     * Exploring Array Types and Component Types
     */

    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println("Creating multi-dimensional int arrays");

        Class<?> intArrayClass = Class.forName("[I");

        System.out.println(intArrayClass);

        int[][] intArray = (int[][]) Array.newInstance(intArrayClass, 3);

        Array.set(intArray, 0, new int[] {123});
        Array.set(intArray, 1, new int[] {456});
        Array.set(intArray, 2, new int[] {789});

        for(int[] oneArray: intArray) {
            System.out.println(Arrays.toString(oneArray));
        }

        System.out.println();

        Class<?> stringArrayClass = Class.forName("[Ljava.lang.String;");

        System.out.println(stringArrayClass);

        String[][] stringArray = (String[][]) Array.newInstance(stringArrayClass, 3);

        Array.set(stringArray, 0, new String[] {"Alice"});
        Array.set(stringArray, 1, new String[] {"Bob"});
        Array.set(stringArray, 2, new String[] {"Jonas"});

        for(String[] oneArray: stringArray) {
            System.out.println(Arrays.toString(oneArray));
        }

    }

}
