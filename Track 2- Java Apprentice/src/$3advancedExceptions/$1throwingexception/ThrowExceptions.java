package $3advancedExceptions.$1throwingexception;

import java.util.Scanner;

public class ThrowExceptions {
    /**
     *  Using throw keyword -
     */

    public static void main(String[] args) {
        System.out.println("Enter your GPA to check your eligibility for admission: ");

        Scanner input = new Scanner(System.in);
        float gpa = input.nextFloat();
        input.close();

        validateGPA(gpa);
    }

    public static void validateGPA(float gpa) throws IllegalArgumentException {
        if(gpa > 0 && gpa <= 4.33) {
            System.out.println("That is a valid GPA. Processing eligibility...");
        }
        else {
            throw new IllegalArgumentException("Sorry. A GPA must have a value between 0 and 4.33.");
//            System.out.println("Sorry. A GPA must have a value between 0 and 4.33.");
        }
    }

}
