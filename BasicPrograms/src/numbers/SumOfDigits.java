package numbers;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int temp = n;
        while(n > 0) {
            int t = n % 10;
            sum += t;
            n /= 10;
        }

        System.out.println("The sum of all digits in " + temp + " is " + sum);
    }
}
