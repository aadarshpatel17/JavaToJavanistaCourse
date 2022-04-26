package numbers;

import java.util.Scanner;

public class PrimeWithinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        primeWithinRange(start, end);
    }

    public static void primeWithinRange(int start, int end) {
        for(int i=start; i<=end; i++)
            if(isPrime(i))
                System.out.println(i);
    }

    public static boolean isPrime(int n ) {
        int count = 0;
        if (n < 1)
            return false;
        for(int i=1; i<=n; i++) {
            if(n % i == 0 )
                count++;
        }
        if(count == 2)
            return true;
        return false;
    }
}
