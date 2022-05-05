package leetcode.april2020;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] string = str.replaceAll("\\[", "")
                .replaceAll("]", "")
                .split(",");
        int[] arr = new int[string.length];
        for (int i = 0; i < string.length; i++)
            arr[i] = Integer.valueOf(string[i]);

//        System.out.println(maximumSubArray(arr));
//        System.out.println(maximumSubArray2(arr));
        System.out.println(kadaneAlgo(arr));
    }

    //    brute-force O(n^3);
    public static int maximumSubArray(int[] arr) {
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++)
                    sum += arr[k];
                if (maxSum < sum)
                    maxSum = sum;
            }
        }
        return maxSum;
    }

    // O(n^2);
    public static int maximumSubArray2(int[] arr) {
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++)
                sum += arr[j];
            if (maxSum < sum)
                maxSum = sum;
        }
        return maxSum;
    }

    public static int kadaneAlgo(int[] arr) {
        int sum = 0;
        int max =  (int)Double.NEGATIVE_INFINITY;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(max < sum)
                max = sum;
            if(sum < 0)
                sum = 0;
        }
        return max;
    }
}
