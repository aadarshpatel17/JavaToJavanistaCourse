package $9staticNestedInnerAndLocalClasses.$11definedininitializationblocks;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {

    private final long id;
    private final String name;
    private final String contactInfo;

    private final ContactValidator contactValidator;

    private String validPhoneNumber;
    private String validEmailAddress;

    {

        Logger logger = Logger.getLogger(Customer.class.getName());

        class USContactValidator implements ContactValidator{

            public void populatePhoneNumber() {
                Pattern pattern = Pattern.compile("^[1-9]\\d{2}-\\d{3}-\\d{4}");
                Matcher phoneMatcher = pattern.matcher(contactInfo);

                if(phoneMatcher.find()) {
                    validPhoneNumber = phoneMatcher.group();
                    logger.info("Valid phone number found: " + validPhoneNumber);
                } else {
                    logger.warning("No valid phone found for " + name);
                }

            }

            public void populateEmailAddress() {
                Pattern pattern = Pattern.compile("[A-Z0-9a-z._%+-]+@[A-Z0-9a-z.-]+\\.[A-Za-z]{2,6}");
                Matcher emailMatcher = pattern.matcher(contactInfo);

                if(emailMatcher.find()) {
                    validEmailAddress = emailMatcher.group();
                    logger.info("Valid email address found: " + validEmailAddress);
                } else {
                    logger.warning("No valid email address found for " + name);
                }

            }

        }

        contactValidator = new USContactValidator();

    }

    public Customer(long id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;

        contactValidator.populateEmailAddress();
        contactValidator.populatePhoneNumber();
    }

    @Override
    public String toString() {
        return String.format("ID: %d, name: %s, phone: %s, email: %s", id, name, validPhoneNumber, validEmailAddress);
    }

}
