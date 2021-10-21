package $4collectionsArraylists.$5usingmultidimensionalandjaggedarrays;

import java.util.Arrays;

public class TwoDimensionArray {
    public static void main(String[] args) {

        int[][] mutlidimensionalArray = new int[3][4];

//        System.out.println("***** String representation of outer array");
//        System.out.println(Arrays.toString(mutlidimensionalArray));

//        Assigning values 2-D array
        mutlidimensionalArray[0][0] = 100;
        mutlidimensionalArray[1][1] = 200;
        mutlidimensionalArray[2][2] = 300;

        System.out.println("***** Iterating over elements in the outer array");
        for(int[] intArray: mutlidimensionalArray) {
            System.out.println(Arrays.toString(intArray));
        }


        System.out.println();
    }
}
