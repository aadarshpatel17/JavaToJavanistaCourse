package $1serialization.$7nestedobjectref;

import java.io.Serializable;

public class CreditCard implements Serializable {

    private static final long serialVersionUID = 1L;

    private String creditCardType;

    public CreditCard(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    @Override
    public String toString() {
        return String.format("Credit card type: %s", creditCardType);
    }

}
