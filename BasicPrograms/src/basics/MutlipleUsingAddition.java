package basics;

import java.util.Scanner;

public class MutlipleUsingAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");

        int a = sc.nextInt(), b = sc.nextInt();
        int result = 0;

        for(int i=0; i<b; i++) {
            result += a;
        }
        System.out.println("Result: " + result);
    }
}
