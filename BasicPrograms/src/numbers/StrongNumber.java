package numbers;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if(isStrong(n))
            System.out.println("Strong Number!");
        else
            System.out.println("Not Strong!");
    }

    public static boolean isStrong(int n) {
        int temp = n, sum = 0;
        if(n < 1)
            return false;
        while(n > 0) {
            int lastDigit = n % 10;
            sum += factorial(lastDigit);
            n /= 10;
        }
        return (sum == temp) ? true: false;
    }

    public static int factorial(int n) {
        if(n < 1)
            return 1;
        int fact = 1;
        for(int i=1; i<=n; i++)
            fact *= i;
        return fact;
    }
}
