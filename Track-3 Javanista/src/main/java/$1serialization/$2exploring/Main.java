package $1serialization.$2exploring;

import java.io.*;
import java.math.BigInteger;

public class Main {

    /**
     * Exploring Serialization and Deserialization
     *  Serializable Interface:
     *  -   Marker interface which contains no data members or methods
     *
     *  Here, converting a Java object to its byte stream format.
     */

    public static void main(String[] args) throws IOException {

        System.out.println("*** ObjectOutputStream to write objects to disk");
        System.out.println("*** Supports primitive types as well as objects");

        BigInteger productIds[] = {
                new BigInteger("23400000023"),
                new BigInteger("32456000023"),
                new BigInteger("98700045245")
        };

        String[] productNames = new String[] {"Samsung TV", "Adidas Shoes", "iPhone 6s"};
        float[] productPrices = new float[] {1599.99f, 199.9f, 599.0f};

        System.out.println("BigInteger implements Serializable: " + productIds[0] instanceof Serializable);
        System.out.println("String implements Serializable: " + productNames[0] instanceof Serializable);
        System.out.println("Float implements Serializable: " + (Float.valueOf(productPrices[0])) instanceof Serializable);

        String productFilename = "src/$1serialization/files/products.txt";

        try (ObjectOutputStream objOut = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(productFilename)))) {
            for(int i=0; i<productIds.length; i++) {
                objOut.writeObject(productIds[i]);
                objOut.writeUTF(productNames[i]);
                objOut.writeFloat(productPrices[i]);
            }
        } finally {
            System.out.println("*** Completed writing records to a ObjectOutputStream");
        }

    }

}
