package $1serialization.$6transientfields;

import java.io.Serializable;

//public class Account {
public class AccountEx implements Serializable {
   /* To make a class serializable, we can implement Serializable interface in that class */

    /* Java automatically generate serialVersionUID, but it's best practise to generate yourself and by explicitly
     *  specifying the serialVersionUID yourself you can control when this version number needs to change. */

    /* Now, the serialVersionUID changed the accounts.txt can not be converted back to objects */
    private final static long serialVersionUID = 1L;

    public static String accountType = "LOAN";

    /* Changes like changing the type of existing variable is not backward compatible
    *  private BigInteger accountNumber;
    * So, if we change any variable type then we should also change the serialVersionUID; */
    private long accountNumber;
    private String customerName;

    /* Transient Fields: Used to specify fields which should NOT be serialized
    * Thus, loanBalance will '0' when we try to deserialize this class */
    private transient double loanBalance;

    /* Backward Compatibility: Adding a new field means your class can still read serialized versions of older objects */
    private String additionalNotes;

    public AccountEx(long accountNumber, String accountName, double loanBalance) {
        this.accountNumber = accountNumber;
        this.customerName = accountName;
        this.loanBalance = loanBalance;
    }

    public static String getAccountType() {
        return accountType;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getLoanBalance() {
        return loanBalance;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    @Override
    public String toString() {
        return String.format("Account type: %s, Number: %d, Name: %s, Balance: %.1f, Notes: %s",
                accountType, accountNumber, customerName, loanBalance, additionalNotes);
    }
}
