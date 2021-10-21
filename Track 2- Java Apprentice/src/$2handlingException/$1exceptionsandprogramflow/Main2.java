package $2handlingException.$1exceptionsandprogramflow;

public class Main2 {

    public static void main(String[] args) {
        double[] prices = {4.42, 5.23, 7.54, 3.2};
        int index = 5;

        System.out.println("Start of the program!");

//        ArrayIndexOutOfBoundsException here
        try {
            System.out.format("The price at index %d is %f", index, prices[index]);
//            changes here
            System.out.println("This does not run if there is an Exception");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException here-");
            System.out.println(ex);
        }
        System.out.println("End of the program!");
    }

}
/**
 *  line 15 will be ignore because line 14 causes Exception and execution goes to
 *  catch block
 */

/** OUTPUT -
    * Start of the program!
    * ArrayIndexOutOfBoundsException here-
    * java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
    * End of the program!
    */
