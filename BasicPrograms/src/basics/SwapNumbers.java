package basics;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2-numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Before swap: " + a + " " + b);
        swapUsingTwoVars(a, b);
        swapUsingThreeVars(a, b);
    }

    public static void swapUsingTwoVars(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap (using 2 variables): " + a + " " + b);
    }

    public static void swapUsingThreeVars(int a, int b) {
        int temp = a;
        a = b;
        b = a;
        System.out.println("After swap (using 3 variables): " + a + " " + b);
    }
}
