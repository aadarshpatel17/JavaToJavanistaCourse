package $2handlingException.$2handlingjavaexceptions;

public class Main1 {

    /**
     * putting some logic -
     *      If the index is less than 0 then print first element of array.
     *      And if the index is greater then length of array then print last
     *          element of array.
     */

    public static void main(String[] args) {
        double[] prices = {69.42, 5.23, 7.54, 10.2};
//        int index = -2;
        int index = 10;

        System.out.println("Start of the program!");

        try {
            System.out.format("The price at index %d is %f", index, prices[index]);
        } catch (Exception e) {
            System.out.println("An Exception occurred: " + e.getClass());
            System.out.println("You have exceeded the array bounds.");

//            some logic here
            if(index < 0) {
                System.out.println("The first price in the array is: " + prices[0]);
            }
            else {
                System.out.println("The last price in the array is: " + prices[prices.length-1]);
            }

        }
        System.out.println("End of the program!");
    }

}
