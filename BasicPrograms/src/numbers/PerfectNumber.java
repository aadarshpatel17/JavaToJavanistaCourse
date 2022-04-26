package numbers;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check whether the given number is Perfect or NOT?");
        int n = sc.nextInt();
        if (isPerfect(n))
            System.out.println("PERFECT!");
        else
            System.out.println("NOT PERFECT!");
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0)
                sum += i;
        if (sum == n)
            return true;
        return false;
    }

    public static boolean isPerfect2(int n) {
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i != n)
                    sum += i + n / i;
                else
                    sum += i;
            }
        }

        if (sum == n || n != 1)
            return true;
        return false;
    }
}
