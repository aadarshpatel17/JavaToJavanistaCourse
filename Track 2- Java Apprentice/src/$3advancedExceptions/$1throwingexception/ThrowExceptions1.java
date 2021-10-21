package $3advancedExceptions.$1throwingexception;

import java.util.Scanner;

public class ThrowExceptions1 {
    /**
     *  Using throw keyword -
     */

    public static void main(String[] args) throws Exception {
        System.out.println("Enter your GPA to check your eligibility for admission: ");

        Scanner input = new Scanner(System.in);
        float gpa = input.nextFloat();
        input.close();

        validateGPA(gpa);
    }

    public static void validateGPA(float gpa) throws Exception {
        if(gpa > 0 && gpa <= 4.33) {
            System.out.println("That is a valid GPA. Processing eligibility...");
        }
        else {
            /**
             *  this will work but doesn't make any sense
             *  -   It is completely our decision what kind of exception we want
             *      to throw
             *  -   We should throw meaningful exception so consumers can understand.
             *  -   We can also use generic exception like RuntimeException or Exception.
             *  -   We should try to be very precise.
             */
//            throw new NullPointerException("Sorry. A GPA must have a value between 0 and 4.33.");
//            throw new RuntimeException("Sorry. A GPA must have a value between 0 and 4.33.");
            throw new Exception("Sorry. A GPA must have a value between 0 and 4.33.");
        }
    }

}
