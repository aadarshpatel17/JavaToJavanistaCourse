package $4collectionsArraylists.$2examiningfixedlengthofarrays;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {
    /**
     *  Drawbacks -
     *   -  have fixed size
     *   -  memory will allocated for given length
     *   -  enable to extend length and add element
     *   -  cannot use negative index like python
     */

    public static void main(String[] args) {

        int[] intArray = new int[4];
        intArray[0] = 10;
        intArray[1] = 20;

        float[] floatArray = new float[6];
        floatArray[1] = 10.5f;
        floatArray[2] = 20.5f;

        String[] stringArray = new String[7];
        stringArray[3] = "Hello";
        stringArray[5] = "World";

        Date[] dateArray = new Date[10];
        dateArray[1] = Calendar.getInstance().getTime();
        dateArray[2] = Calendar.getInstance().getTime();

        System.out.println("intArray instanceOf Object: " + (intArray instanceof Object));
        System.out.println("floatArray instanceOf Object: " + (floatArray instanceof Object));
        System.out.println("stringArray instanceOf Object: " + (stringArray instanceof Object));
        System.out.println("dateArray instanceOf Object: " + (dateArray instanceof Object));

        System.out.println();

        System.out.println("\nintArray.toString(): " + Arrays.toString(intArray));
        System.out.println("intArray.length: " + intArray.length);

        System.out.println("\nfloatArray.toString(): " + Arrays.toString(floatArray));
        System.out.println("floatArray.length: " + floatArray.length);

        System.out.println("\nstringArray.toString(): " + Arrays.toString(stringArray));
        System.out.println("stringArray.length: " + stringArray.length);

        System.out.println("\ndateArray.toString(): " + Arrays.toString(dateArray));
        System.out.println("dateArray.length: " + dateArray.length);

    }
}
