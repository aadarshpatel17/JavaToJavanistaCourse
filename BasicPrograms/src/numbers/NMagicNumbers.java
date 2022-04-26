package numbers;

import java.util.Scanner;

public class NMagicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++) {
            if(isMagicNumber(i))
                System.out.println(i);
        }
    }

    public static boolean isMagicNumber(int n) {
        if(n < 1)
            return false;
        int a = sumOfDigits(n);
        int b = reverse(a);
        return (a*b == n) ? true: false;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }

    public static int reverse(int n) {
        int rev = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        return rev;
    }

}
