package $1serialization.$9externalizableinterface;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public class Account implements Externalizable {
    private final static long serialVersionUID = 1L;

    public static String accountType = "LOAN";

    private long accountNumber;
    private String customerName;
    private double loanBalance;
    private int creditScore;
    private String[] tags;

    public Account() {
    }

    public Account(long accountNumber, String accountName, double loanBalance, int creditScore, String... tags) {
        this.accountNumber = accountNumber;
        this.customerName = accountName;
        this.loanBalance = loanBalance;
        this.creditScore = creditScore;
        this.tags = tags;
    }

    @Override
    public String toString() {
        return String.format("{Type: %s, Number: %d, Name: %s, Balance: %.1f, Credit score: %d, Tags: %s}\n",
                accountType, accountNumber, customerName, loanBalance, creditScore, Arrays.toString(tags));
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeLong(accountNumber);
        out.writeUTF(customerName);
        out.writeDouble(loanBalance);
        out.writeUTF(Arrays.toString(tags));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.accountNumber = in.readLong();
        this.customerName = in.readUTF();
        this.loanBalance = in.readDouble();

        String tagString = in.readUTF();
        /* removing [] brackets */
        tagString = tagString.substring(1, tagString.length() - 1);
        /* getting individual elements */
        this.tags = tagString.split(", ");
    }
}
