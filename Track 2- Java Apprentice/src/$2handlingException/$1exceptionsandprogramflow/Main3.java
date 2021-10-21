package $2handlingException.$1exceptionsandprogramflow;

public class Main3 {

    /**
     * detailed exception
     */
    public static void main(String[] args) {
        double[] prices = {4.42, 5.23, 7.54, 3.2};
        int index = 5;

        System.out.println("Start of the program!");

        try {
            System.out.format("The price at index %d is %f", index, prices[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An Exception occurred!");
            System.out.println("The Exception class: " + e.getClass());
            System.out.println("The Exception message: " + e.getMessage());
            System.out.println("The Exception Localized message class: " + e.getLocalizedMessage());
            System.out.println("The Exception cause: " + e.getCause());
        }
        System.out.println("End of the program!");
    }

}
