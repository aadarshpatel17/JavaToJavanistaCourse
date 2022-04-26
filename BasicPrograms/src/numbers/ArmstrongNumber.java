package numbers;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether it is Armstrong or not: ");
        int n = sc.nextInt();
        if (isArmstrong(n))
            System.out.println("Armstrong!");
        else
            System.out.println("NOT Armstrong!");
    }

    public static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += (lastDigit * lastDigit * lastDigit);
            n /= 10;
        }

        if (sum == temp)
            return true;
        return false;
    }
}
