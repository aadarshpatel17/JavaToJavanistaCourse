package numbers;

import java.util.Scanner;

public class SumDBTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        for(int i=a; i<=b; i++) {
            if(i % 2 == 0)
                sum += i;
        }
        System.out.println("The sum of all integers divisible by 2 between " + a + " and " + b + " is " + sum);
    }
}
