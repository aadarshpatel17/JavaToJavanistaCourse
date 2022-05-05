package leetcode.april2020;

/*
Write an algorithm to determine if a number n is happy.

        A happy number is a number defined by the following process:

        Starting with any positive integer, replace the number by the sum of the squares of its digits.
        Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
        Those numbers for which this process ends in 1 are happy.
        Return true if n is a happy number, and false if not.

Input: n = 19
Output: true
    Explanation:
    12 + 92 = 82
    82 + 22 = 68
    62 + 82 = 100
    12 + 02 + 02 = 1

Input: n = 2
Output: false

*/


import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isHappy(n));
//        for(int i=0; i<=100; i++) {
//            if(isHappy(i)) {
//                System.out.print(i + " ");
//            }
//        }
    }

    public static boolean isHappy(int n) {
        if(n <= 1)
            return true;

        Set<Integer> visited = new HashSet<>();
        while(n != 1) {
            int crt = digitSquareSum(n);
            if(visited.contains(crt))
                return false;
            visited.add(crt);
            n = crt;
        }
        return true;
    }

    public static int digitSquareSum(int n) {
        if(n <= 1)
            return 1;
        int sum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit*lastDigit;
            n /= 10;
        }
        return sum;
    }


}
