package $3advancedExceptions.$2throwingmultipleexception;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public class ThrowExceptions {
    /**
     * throwing multiple exception
     */

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userId = input.next();
        System.out.println("Enter your GPA: ");
        float gpa = input.nextFloat();

        input.close();

        validateStudent(userId, gpa);
    }

    public static void validateStudent(String userId, float gpa) throws InvalidNameException, IllegalArgumentException {
        if (userId.startsWith("a")) {
            System.out.println("The username checks out...");
        } else {
            throw new InvalidNameException("The username is not in the correct format.");
        }

        if (gpa > 0 && gpa <= 4.33) {
            System.out.println("That is a valid GPA. Processing eligibility...");
        } else {
            throw new IllegalArgumentException("Sorry. A GPA must have a value between 0 and 4.33.");
        }
    }

}
