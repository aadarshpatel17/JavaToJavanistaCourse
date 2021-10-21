package $4collectionsArraylists.$5usingmultidimensionalandjaggedarrays;

import java.util.Arrays;

public class JaggedArrays {
    public static void main(String[] args) {

        String[][] mutlidimensionalArray = new String[3][];

//        error - because the inner length is not given
//        mutlidimensionalArray[1][2] = "Harry";

//        correct way to handle this
        mutlidimensionalArray[0] = new String[2];
        mutlidimensionalArray[0] = new String[3];
        mutlidimensionalArray[0] = new String[4];

//        mutlidimensionalArray[0][0] = "Harry";
//        mutlidimensionalArray[1][2] = "Ron";
//        mutlidimensionalArray[2][3] = "Hermione";


        System.out.println("***** Iterating over mutliple dimensions");
        for(String[] stringArray: mutlidimensionalArray) {
            System.out.println(Arrays.toString(stringArray));
        }


        System.out.println();
    }
}
