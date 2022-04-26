package $1serialization.$6transientfields;

import java.io.*;

public class Main {

    /**
     * Using Transient Fields
     *  -   Used to specify fields which should NOT be serialized.
     */

    public static void main(String[] args) throws IOException {

        System.out.println("*** Writing objects with a transient field");

        AccountEx accountEx1 = new AccountEx(11200001, "Bill Gates", 12000.5f);
        accountEx1.setAdditionalNotes("Fast track loan payment");

        AccountEx accountEx2 = new AccountEx(11200010, "Paul Allen", 6000.3f);
        accountEx2.setAdditionalNotes("Special repayment terms");

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
