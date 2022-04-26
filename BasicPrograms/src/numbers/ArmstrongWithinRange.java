package numbers;

import java.util.Scanner;

public class ArmstrongWithinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to know all armstrong number between them");
        int start = sc.nextInt();
        int end = sc.nextInt();
        armstrongWithinRange(start, end);
    }

    public static void armstrongWithinRange(int start, int end) {
        for(int i=start; i<=end; i++)
            if(isArmstrong(i))
                System.out.print(i + " ");
    }

    public static boolean isArmstrong(int n) {
        int temp = n, sum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sum += (Math.pow(lastDigit, 3));
            n /= 10;
        }

        if(temp == sum)
            return true;
        else
            return false;
    }
}
