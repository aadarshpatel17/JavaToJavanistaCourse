package numbers;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not: ");
        int n = sc.nextInt();
        if(isPrime(n))
            System.out.println(n + " is Prime!");
        else
            System.out.println(n + " is not Prime!");
    }

    public static boolean isPrime(int n) {
        int count = 0;
        if(n < 1)
            return false;
        for(int i=1; i<=Math.sqrt(n); i++)
            if(n % i == 0)
                count++;
        if(count == 2)
            return true;
        return false;
    }
}
