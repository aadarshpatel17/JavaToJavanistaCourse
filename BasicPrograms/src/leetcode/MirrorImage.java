package leetcode;

import java.util.Scanner;

public class MirrorImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 0 to exit or Type exit");
        while(true) {
            System.out.println("Enter string ");
            String str = sc.nextLine();
            if(str.equals("exit") || str.equals("0") || str.equals("EXIT"))
                break;
            System.out.println(mirrorImage(str));
        }
    }

    public static String mirrorImage(String str) {
        if(str.length() <= 1)
            return str;

        if(isPalindrome(str))
            return str;

        String result = "";
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) == str.charAt(str.length() - i - 1))
                result += str.charAt(i);
            else
                break;
        }
        return result;
    }

    public static boolean isPalindrome(String str) {
        if(str.length() <= 1)
            return true;
        for(int i=0; i<=str.length()/2; i++) {
            if(str.charAt(i) == str.charAt(str.length() - i -1))
                continue;
            else
                return false;
        }
        return true;
    }
}
