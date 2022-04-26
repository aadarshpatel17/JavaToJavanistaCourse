package $1serialization.$7nestedobjectref;

import java.io.Serializable;

public class AccountEx implements Serializable {
    private final static long serialVersionUID = 1L;

    public static String accountType = "LOAN";

    private long accountNumber;
    private String customerName;
    private double loanBalance;

    /* This reference to an object of type creditCard is a nested object within this Account class
    *   -   AccountEx is Serializable but CreditCard is not Serializable */
    private CreditCard creditCard;

    public AccountEx(long accountNumber, String accountName, double loanBalance, String cardType) {
        this.accountNumber = accountNumber;
        this.customerName = accountName;
        this.loanBalance = loanBalance;

        this.creditCard = new CreditCard(cardType);
    }

    @Override
    public String toString() {
        return String.format("Account type: %s, Number: %d, Name: %s, Balance: %.1f, %s\n",
                accountType, accountNumber, customerName, loanBalance, creditCard);
    }
}
