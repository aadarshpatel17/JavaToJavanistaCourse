package $1serialization.$7nestedobjectref;

import java.io.*;

public class Main1 {

    /**
     * Serializing Nested Object Reference
     *  -   If you have a class that contains a nested class within it (contains a reference to another user defined class)
     *      You can only mark that class Serializable if nested classes are Serializable.
     *  -
     */

    public static void main(String[] args) throws IOException {

        System.out.println("*** Reading objects with nested object fields");

        String filename = "src/$1serialization/files/microsoft_accounts.txt";

        try(ObjectInputStream objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)))) {
            AccountEx accountEx1 = (AccountEx) objIn.readObject();
            System.out.println(accountEx1);
            AccountEx accountEx2 = (AccountEx) objIn.readObject();
            System.out.println(accountEx2);
        } catch (NotSerializableException | ClassNotFoundException nse) {
            System.out.println("*** Thrown when the class red in using readObject() is not found");
        } finally {
            System.out.println("*** Completed reading object using ObjectInputStream");
        }
    }

}
