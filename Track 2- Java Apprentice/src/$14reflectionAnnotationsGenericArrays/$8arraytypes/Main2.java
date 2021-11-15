package $14reflectionAnnotationsGenericArrays.$8arraytypes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main2 {

    /**
     * Exploring Array Types and Component Types
     */

    public static void main(String[] args) throws ClassNotFoundException {

        int[] intArray = (int[]) Array.newInstance(int.class, 3);
        String[] stringArray = (String[]) Array.newInstance(String.class, 3);

        System.out.println("**** Class");
        System.out.println(intArray.getClass());
        System.out.println(stringArray.getClass());
        System.out.println();

        System.out.println("***** IsArray");
        System.out.println(intArray.getClass().isArray());
        System.out.println(stringArray.getClass().isArray());
        System.out.println();

        System.out.println("****** Component type");
        System.out.println("intArray: " + intArray.getClass().getComponentType());
        System.out.println("stringArray: " + stringArray.getClass().getComponentType());
        System.out.println();

    }

}
