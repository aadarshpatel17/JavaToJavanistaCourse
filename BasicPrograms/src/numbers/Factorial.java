package numbers;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        int res = 1;
        for(int i=n; i>=1; i--)
            res *= i;
        return res;
    }

    public static int factRev(int n) {
        if(n == 1)
            return 1;
        return factRev(n-1) * n;
    }
}
