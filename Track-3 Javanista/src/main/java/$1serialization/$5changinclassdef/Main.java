package $1serialization.$5changinclassdef;

import java.io.*;

public class Main {

    /**
     * Changing Serializable Class Definitions
     *  -
     */

    public static void main(String[] args) throws IOException {

        System.out.println("*** Writing objects with a serialVersionUID");

        AccountEx accountEx1 = new AccountEx(1010101, "Steve Jobs", 1555.5f);
        AccountEx accountEx2 = new AccountEx(2020202, "Steve Wozniak", 3333.3f);

        String filename = "src/$1serialization/files/apple_accounts.txt";

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
