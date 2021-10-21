package $2handlingException.$1exceptionsandprogramflow;

public class Main1 {

    public static void main(String[] args) {
        double[] prices = {4.42, 5.23, 7.54, 3.2};
        int index = 5;

        System.out.println("Start of the program!");

//        ArrayIndexOutOfBoundsException here
        try {
            System.out.format("The price at index %d is %f", index, prices[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException here-");
//            changes here
            System.out.println(ex);
        }
        System.out.println("End of the program!");
    }

}
    /** OUTPUT -
    * Start of the program!
    * ArrayIndexOutOfBoundsException here-
    * java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
    * End of the program!
    */
