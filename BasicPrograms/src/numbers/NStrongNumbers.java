package numbers;

import java.util.Scanner;

public class NStrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for(int i=0; i<=n; i++) {
            if(isStrong(i))
                System.out.println(i);
        }
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
