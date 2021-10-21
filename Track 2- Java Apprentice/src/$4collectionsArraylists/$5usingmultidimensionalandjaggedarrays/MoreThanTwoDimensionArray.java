package $4collectionsArraylists.$5usingmultidimensionalandjaggedarrays;

import java.util.Arrays;

public class MoreThanTwoDimensionArray {
    public static void main(String[] args) {

        int[][][] mutlidimensionalArray = new int[3][4][2];

        System.out.println("***** Iterating over elements in the outer array");
        for(int[][] int2dArray: mutlidimensionalArray) {
            System.out.print("[");
            for(int[] intArray: int2dArray) {
                System.out.print(Arrays.toString(intArray));
            }
            System.out.println("]");
        }
        System.out.println();

//        ***** Iterating over elements in the outer array
//                [[0, 0][0, 0][0, 0][0, 0]]
//                [[0, 0][0, 0][0, 0][0, 0]]
//                [[0, 0][0, 0][0, 0][0, 0]]
    }
}
