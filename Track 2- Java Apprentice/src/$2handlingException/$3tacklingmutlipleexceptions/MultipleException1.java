package $2handlingException.$3tacklingmutlipleexceptions;

public class MultipleException1 {

    public static void main(String[] args) {

        /**
         *  way to handle exception
         *   - here- the line 23 will not execute because line 22 causes
         *      exception.
         *   - Order of the catch block does not matters.
         */

        System.out.println("Start of the program!");

        int index = 10;
        String[] products = {"Power Bank", "USB Cable", "Phone Charger",
                "Laptop Charger", "HDMI Cable", null};

        try {
//        ArrayIndexOutOfBoundsException here
            System.out.format("\nThe product at index %d: %s\n", index, products[index]);
//        NullPointerException here
            System.out.println("Is the last product a mouse? " + products[products.length-1].equalsIgnoreCase("mouse"));
        }
        catch (ArrayIndexOutOfBoundsException | NullPointerException  e) {
            System.out.format("An Exception of type %s was thrown.", e.getClass());
            System.out.println();
        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("The bounds of the array have been exceeded.");
//        }
//        catch (NullPointerException e) {
//            System.out.println("All null value was being accessed.");
//        }

        System.out.println("End of the program!");

    }

}
