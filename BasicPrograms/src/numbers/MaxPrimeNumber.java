package numbers;

import java.util.Scanner;

public class MaxPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(maxPrime(n));
    }

    public static int maxPrime(int n) {
        while(true) {
            if(isPrime(n))
                return n;
            n--;
        }
    }

    public static boolean isPrime(int n) {
        if(n < 2)
            return false;
        for(int i=2; i<n; i++)
            if(n % i == 0)
                return false;
        return true;
    }
}
