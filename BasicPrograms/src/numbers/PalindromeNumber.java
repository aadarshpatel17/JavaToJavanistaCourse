package numbers;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        if(isPalindrome(n))
            System.out.println("The given number " + n + " is palindrome");
        else
            System.out.println("The given number " + n + " is not palindrome");

    }

    public static boolean isPalindrome(int n) {
        return n == reverse(n) ? true: false;
    }

    public static int reverse(int n) {
        int rev = 0;
        while(n > 0) {
            int x = n % 10;
            rev = rev * 10 + x;
            n /= 10;
        }
        return rev;
    }
}
