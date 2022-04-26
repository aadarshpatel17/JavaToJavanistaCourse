package $1serialization.$9externalizableinterface;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Writing {

    /**
     * Using the Externalizable Interface
     *  -   Custom serialization and deserialization of objects.
     */

    public static void main(String[] args) throws IOException {

        Account account1 = new Account(1010101, "Larry", 1555.5, 647, "Founder", "Hi potential");
        Account account2 = new Account(2020202, "Sergey", 3333.3, 689, "High income", "Reliable");
        Account account3 = new Account(3030303, "Mark", 13000, 644, "New");
        Account account4 = new Account(4040404, "Travis", 27550, 689, "New");

        List<Account> accountList = Arrays.asList(account1, account2, account3, account4);

        String filename = "accounts_with_tags.txt";

        try(ObjectOutputStream objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filename)))) {
            for(Account account: accountList) {
                System.out.println("Writing: " + account);
                objOut.writeObject(account);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("*** Completed writing objects using ObjectOutputStream");
        }

    }

}
