package $1serialization.$5changinclassdef;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main1 {

    /**
     * Serializing and Deserializing Custom Objects
     *  -
     */

    public static void main(String[] args) throws IOException {

        System.out.println("*** Reading objects with a serialVersionUID");

        String filename = "src/$1serialization/files/apple_accounts.txt";

        try (ObjectInputStream objIn = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(filename)))) {
            AccountEx AccountEx1 = (AccountEx) objIn.readObject();
            System.out.println("AccountEx 1: " + AccountEx1);
            AccountEx AccountEx2 = (AccountEx) objIn.readObject();
            System.out.println("AccountEx 2: " + AccountEx2);
        } catch( ClassNotFoundException cnfe) {
            System.out.println("*** Thrown when the class read in using readObject() is not found");
        } finally {
            System.out.println("*** Completed reading objects from a ObjectInputStream");
        }

    }

}
