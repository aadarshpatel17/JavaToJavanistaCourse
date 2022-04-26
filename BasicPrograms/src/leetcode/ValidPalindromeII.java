package leetcode;

import java.util.Scanner;

/*
Given a string s, return true if the s can be palindrome after deleting at most one character from it.

aba
abca
deeee
abc
eedede
cbbcc
tcaac
0

*/

public class ValidPalindromeII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str + " " + validPalindrome(str));
    }

    public static boolean isPalindrome(String s, int left, int right) {
        while(left <= right) {
            if(s.charAt(left) != s.charAt(right))
                return false;
            left += 1;
            right -= 1;
        }
        return true;
    }

    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left <= right) {
            if(s.charAt(left) != s.charAt(right))
                return isPalindrome(s, left+1, right) || isPalindrome(s, left, right-1);
            left += 1;
            right -= 1;
        }
        return true;
    }

//    public static boolean validPalindrome(String str) {
//        boolean ignored = false, result = false;
//        int i = 0, j = str.length() - 1;
//        while(i < j) {
//            if(str.charAt(i) == str.charAt(j))
//                result = true;
//            else if(!ignored && str.charAt(i) != str.charAt(j)) {
//                ignored = !ignored;
//                j--;
//                continue;
//            }
//            else
//                result = false;
//            i++;
//            j--;
//        }
//        return result;
//    }
}
