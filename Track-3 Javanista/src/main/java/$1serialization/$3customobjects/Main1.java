package $1serialization.$3customobjects;

import $1serialization.utility.Account;

import java.io.*;

public class Main1 {

    /**
     * Serializing and Deserializing Custom Objects
     *  -
     */

    public static void main(String[] args) throws IOException {

        /* After implementing Serializable interface in Account class, now the below code will run properly */
        System.out.println("*** Reading serializable objects using a ObjectInputStream");

        String filename = "src/$1serialization/files/accounts.txt";

        try(ObjectInputStream objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)))) {
            Account account1 = (Account) objIn.readObject();
            System.out.println("Account 1: " + account1);
            Account account2 = (Account) objIn.readObject();
            System.out.println("Account 2: " + account2);
        } catch (ClassNotFoundException cnfe) {
            System.out.println("*** Thrown when the class read in using readObject() is not found");
        } finally {
            System.out.println("*** Completed reading objects from a ObjectInputStream");
        }

    }

}
