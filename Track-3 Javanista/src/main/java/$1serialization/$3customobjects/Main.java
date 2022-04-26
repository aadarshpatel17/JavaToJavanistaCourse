package $1serialization.$3customobjects;

import $1serialization.utility.Account;

import java.io.*;

public class Main {

    /**
     * Serializing and Deserializing Custom Objects
     *  -
     */

    public static void main(String[] args) throws IOException {

        /* After implementing Serializable interface in Account class, now the below code will run properly */
//        System.out.println("*** Trying to write a non-serializable class");
        System.out.println("*** Trying to write a serializable class");

        Account account1 = new Account(11111, "Ada Lovelace", 20000.0f);
        Account account2 = new Account(22222, "Charles Babbage", 15500.0f);

        String filename = "src/$1serialization/files/accounts.txt";

        try(ObjectOutputStream objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filename)))) {
            objOut.writeObject(account1);
            objOut.writeObject(account2);
        } catch (NotSerializableException | FileNotFoundException nse) {
            nse.printStackTrace();
        } finally {
            System.out.println("*** Completed writing non-serializable object using ObjectOutputStream");
        }

    }

}
