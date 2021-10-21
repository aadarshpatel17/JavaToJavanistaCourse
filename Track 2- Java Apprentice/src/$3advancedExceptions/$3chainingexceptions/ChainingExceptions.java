package $3advancedExceptions.$3chainingexceptions;

import javax.naming.InvalidNameException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ChainingExceptions {
    /**
     * Chaining Exception -
     *  -   here we are handling InvalidNameException in main method and
     *      IllegalArgumentException in intermediateFunction.
     *
     *  -   Code can also produce different exception for this two
     *      like InputMismatchException, if we give different type input
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String userId = input.next();

        float gpa = 0f;

        try {
            System.out.println("Enter your GPA: ");
            gpa = input.nextFloat();
        }
        catch(InputMismatchException e) {
            throw new IllegalArgumentException("A GPA must have a numeric value between 0 and 4.33.");
        }

        input.close();

        try {
            intermediateFunction(userId, gpa);
        } catch (InvalidNameException e) {
            System.out.println("The username is invalid. " + e.getClass());
            e.printStackTrace();
        }
    }

    public static void intermediateFunction(String userId, float gpa) throws InvalidNameException {
        try {
            validateStudent(userId, gpa);
        } catch (IllegalArgumentException e) {
            System.out.println("An exception was throw: " + e.getClass());
            e.printStackTrace();
        }
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
