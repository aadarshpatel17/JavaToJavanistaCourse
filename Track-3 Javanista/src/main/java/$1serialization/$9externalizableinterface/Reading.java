package $1serialization.$9externalizableinterface;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Reading {

    /**
     * Using the Externalizable Interface
     *  -   Custom serialization and deserialization of objects.
     */

    public static void main(String[] args) throws IOException {

        String filename = "accounts_with_tags.txt";

        try(ObjectInputStream objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)))) {

            Account account1 = (Account) objIn.readObject();
            System.out.println("Account 1: " + account1);

            Account account2 = (Account) objIn.readObject();
            System.out.println("Account 2: " + account2);

            Account account3 = (Account) objIn.readObject();
            System.out.println("Account 3: " + account3);

            Account account4 = (Account) objIn.readObject();
            System.out.println("Account 4: " + account4);

        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("*** Completed reading objects using ObjectInputStream");
        }

    }

}
