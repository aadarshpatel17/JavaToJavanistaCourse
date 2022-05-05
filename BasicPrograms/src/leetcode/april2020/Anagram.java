package leetcode.april2020;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();


//        System.out.println(anagram(s1, s2));
        System.out.println(anagramEfficient(s1, s2));
    }

//    Efficient: O(n)
    public static boolean anagramEfficient(char[] s1, char[] s2) {
        int NO_OF_CHARS = 256;
        int[] count = new int[NO_OF_CHARS];

        if(s1.length != s2.length)
            return false;

        for(int i=0; i<s1.length; i++) {
            count[s1[i] - 'a']++;
            count[s2[i] - 'a']--;
        }

        for(int i=0; i<NO_OF_CHARS; i++)
            if(count[i] != 0)
                return false;
        return true;
    }


//    brute-force: O(nlogn)
    public static boolean anagram(char[] s1, char[] s2) {
        if(s1.length != s2.length)
            return false;

        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i=0; i<s1.length; i++)
            if(s1[i] != s2[i])
                return false;

        return true;
    }
}
