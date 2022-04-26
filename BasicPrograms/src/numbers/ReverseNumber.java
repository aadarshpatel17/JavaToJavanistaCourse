package numbers;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        reverse(n);
    }

    public static void reverse(int n) {
        int temp = n, rev = 0;
        while(n > 0) {
            int x = n % 10;
            rev = rev * 10 + x;
            n /= 10;
        }

        System.out.println("The reverse of " + temp + " is " + rev);
    }
}
