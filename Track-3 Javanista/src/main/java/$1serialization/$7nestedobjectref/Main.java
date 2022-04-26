package $1serialization.$7nestedobjectref;

import java.io.*;

public class Main {

    /**
     * Serializing Nested Object Reference
     *  -   If you have a class that contains a nested class within it (contains a reference to another user defined class)
     *      You can only mark that class Serializable if nested classes are Serializable.
     *  -
     */

    public static void main(String[] args) throws IOException {

        /* The code will give exception 'NotSerializableException' because CreditCard is not Serializable
        *  So, we make CreditCard implements Serializable and setting serialVersionUID */

        System.out.println("*** Saving objects with nested object fields");

        AccountEx accountEx1 = new AccountEx(11200001, "Bill Gates", 12000.5f, "Visa");

        AccountEx accountEx2 = new AccountEx(11200010, "Paul Allen", 6000.3f, "Amex");

        String filename = "src/$1serialization/files/microsoft_accounts.txt";

        try(ObjectOutputStream objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filename)))) {
            objOut.writeObject(accountEx1);
            objOut.writeObject(accountEx2);
        } catch (NotSerializableException nse) {
            nse.printStackTrace();
        } finally {
            System.out.println("*** Completed writing object using ObjectOutputStream");
        }
    }

}
