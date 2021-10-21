package $4collectionsArraylists.$3iteratingoverarraysusingforloop;

import java.util.Arrays;

public class MixedTypeArray {
    public static void main(String[] args) {
        /**
         *  Objects array
         */

        Object[] mixedArray = {"Amazon", 100.0f, 23, true};

        System.out.println("Array contents: " + Arrays.toString(mixedArray));

        System.out.println();

        for (Object element : mixedArray) {
            System.out.format("element class: %s", element.getClass());
            System.out.println();

            System.out.format("element: %s", element);
            System.out.println();
        }

    }
}
