package $2handlingException.$3tacklingmutlipleexceptions;

public class MultipleException {

    public static void main(String[] args) {

        /**
         *  way to handle exception
         */

        System.out.println("Start of the program!");

        int index = 10;

        String[] products = {"Power Bank", "USB Cable", "Phone Charger",
                "Laptop Charger", "HDMI Cable", null};

//        ArrayIndexOutOfBoundsException here
        try {
            System.out.format("\nThe product at index %d: %s\n", index, products[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The bounds of the array have been exceeded.");
        }

//        NullPointerException here
        try {
            System.out.println("Is the last product a mouse? " + products[products.length-1].equalsIgnoreCase("mouse"));
        }
        catch (NullPointerException e) {
            System.out.println("All null value was being accessed.");
        }

        System.out.println("End of the program!");

    }

}
