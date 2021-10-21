package $2handlingException.$2handlingjavaexceptions;

public class Main {
    /**
     * Check, what kind of object our Exception is-
     */

    public static void main(String[] args) {
        double[] prices = {4.42, 5.23, 7.54, 3.2};
        int index = 5;

        System.out.println("Start of the program!");

        try {
            System.out.format("The price at index %d is %f", index, prices[index]);
        } catch (Exception e) {
            System.out.println("Is e an Object? " + (e instanceof Object));
            System.out.println("Is e an Throwable? " + (e instanceof Throwable));
            System.out.println("Is e an Exception? " + (e instanceof Exception));
            System.out.println("Is e an RuntimeException? " + (e instanceof RuntimeException));
            System.out.println("Is e an ArrayIndexOutOfBoundsException? " + (e instanceof ArrayIndexOutOfBoundsException));
            System.out.println("Is e an ArithmeticException? " + (e instanceof ArithmeticException));
        }
        System.out.println("End of the program!");
    }

}
