package leetcode;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a function that reverses a string. The input string is given as an array of characters s.

        You must do this by modifying the input array in-place with O(1) extra memory.

5
h e l l o

*/

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[] s = new char[size];
        for(int i=0; i<size; i++)
            s[i] = sc.next().charAt(0);
        System.out.println(reverseString(s));
    }

    public static String reverseString(char[] s) {
        String result = "";
        for(int i=0, j=s.length-1; i<s.length/2; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }

        return Arrays.toString(s);
    }
}
