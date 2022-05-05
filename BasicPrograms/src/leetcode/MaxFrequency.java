package leetcode;

import java.util.Scanner;

public class MaxFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String str = sc.next();
            if(str.equals("0"))
                break;
            System.out.println(maxBlock(str));
        }
    }

    public static int maxBlock(String str) {
        if(str.length() < 1)
            return 0;
        int maxCount = 1, max = 1;
        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1))
                max++;
            else
                max = 1;
            if(maxCount < max)
                maxCount = max;
        }
        return maxCount;
    }
}
