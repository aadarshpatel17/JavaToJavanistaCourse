package $1serialization.$2exploring;

import java.io.*;
import java.math.BigInteger;

public class Main1 {

    /**
     * Exploring Serialization and Deserialization
     *  Serializable Interface:
     *  -   Marker interface which contains no data members or methods
     *
     *  Here, converting a byte stream back to an object format (Deserialization)
     */

    public static void main(String[] args) throws IOException {

        System.out.println("*** Reading records using a ObjectInputStream");
        String productFilename = "src/$1serialization/files/products.txt";

        try (ObjectInputStream objIn = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(productFilename)))) {
            for(int i=0; i<3; i++) {
                /* it's important to cast back to correct type */
                BigInteger productId = (BigInteger) objIn.readObject();
                String productName = objIn.readUTF();
                float productPrice = (float) objIn.readFloat();

                System.out.format("Product ID: %d, Name: %s, Price: %.1f\n", productId, productName, productPrice);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("*** Thrown when the class read in using readObject() is not found");
        } finally {
            System.out.println("*** Completed reading records from a ObjectInputStream");
        }

    }

}
