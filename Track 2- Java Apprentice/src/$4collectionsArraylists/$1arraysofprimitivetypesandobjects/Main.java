package $4collectionsArraylists.$1arraysofprimitivetypesandobjects;

import java.util.Arrays;

public class Main {
    /**
     *  Array -
     *   -  Collection of objects, where the type and number of objects
     *      are specified upfront and cannot be modified later.
     *   -  holds same type of element
     *   -  easy and fast accessible element (directly by index)
     */

    public static void main(String[] args) {

        int[] intArray = new int[4];
//        create an array of length 4 of integer with default values 0 on it.
        intArray[0] = 10;
        intArray[1] = 20;

        System.out.println("Array of integers: " + intArray);
        System.out.println("getClass() representation: " + intArray.getClass());
//        getClass() representation: class [I
        System.out.println("toString() representation: " + intArray.toString());
        System.out.println("Arrays.toString(intArray): " + Arrays.toString(intArray));

        System.out.println();

        float[] floatArray = new float[6];
//        create an array of length 6 of float with default values 0.0 on it.
        floatArray[1] = 10.5f;
        floatArray[2] = 20.5f;

        System.out.println("Array of floats: " + floatArray);
        System.out.println("getClass() representation: " + floatArray.getClass());
//        getClass() representation: class [F
        System.out.println("toString() representation: " + floatArray.toString());
        System.out.println("Arrays.toString(floatArray): " + Arrays.toString(floatArray));

        System.out.println();

        String[] stringArray = new String[7];
//        create an array of length 7 of String with default values null on it.
        stringArray[3] = "Hello";
        stringArray[5] = "World";

        System.out.println("Array of string: " + stringArray);
        System.out.println("getClass() representation: " + stringArray.getClass());
//        getClass() representation: class [Ljava.lang.String;
        System.out.println("toString() representation: " + stringArray.toString());
        System.out.println("Arrays.toString(stringArray): " + Arrays.toString(stringArray));

        System.out.println();

    }
}
