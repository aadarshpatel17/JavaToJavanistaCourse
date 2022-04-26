package $1serialization.$6transientfields;

import java.io.*;

public class Main1 {

    /**
     * Using Transient Fields
     *  -   Used to specify fields which should NOT be serialized.
     */

    public static void main(String[] args) throws IOException {

        System.out.println("*** Reading objects with a transient field");

        String filename = "src/$1serialization/files/microsoft_accounts.txt";

        try(ObjectInputStream objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)))) {
            AccountEx accountEx1 = (AccountEx) objIn.readObject();
            System.out.println("AccountEx 1: " + accountEx1);
            AccountEx accountEx2 = (AccountEx) objIn.readObject();
            System.out.println("AccountEx 2: " + accountEx2);
        } catch (NotSerializableException | ClassNotFoundException nse) {
            System.out.println("*** Thrown when the class read in using readObject() is not found");
        } finally {
            System.out.println("*** Completed reading object using ObjectInputStream");
        }
    }

}
