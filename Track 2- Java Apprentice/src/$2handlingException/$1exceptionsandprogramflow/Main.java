package $2handlingException.$1exceptionsandprogramflow;

public class Main {

    public static void main(String[] args) {

        /**
         *  Without exception handling, the program terminates from the line
         *  which causes exception.
         *
         *  With exception handling, the complete program runs.
         */

        double[] prices = {4.42, 5.23, 7.54, 3.2};

        int index = 5;

        System.out.println("Start of the program!");

        System.out.println();

//        ArrayIndexOutOfBoundsException here
        try {
            System.out.format("The price at index %d is %f", index, prices[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException here-");
            ex.printStackTrace();

            /** OUTPUT -
             * Start of the program!
             *
             * ArrayIndexOutOfBoundsException here-
             *
             * End of the program!
             *
             * stackTrace here...
             */
        }

        System.out.println();

        System.out.println("End of the program!");

    }

}
