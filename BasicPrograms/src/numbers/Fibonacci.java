package numbers;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit: ");
        int limit = sc.nextInt();
        fibonacci(limit);

    }

    public static void fibonacci(int n) {
        int a = 0, b = 1, c = 0;
        System.out.print(a + " " + b);
        for(int i=2; i<n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }

}