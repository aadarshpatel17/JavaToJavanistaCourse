package leetcode.april2020;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] string = str.replaceAll("\\[", "")
                .replaceAll("]", "")
                .split(",");
        int[] arr = new int[string.length];
        for (int i = 0; i < string.length; i++)
            arr[i] = Integer.valueOf(string[i]);

//        moveZeroes(arr);
        moveZeroesEfficient(arr);
    }

//    efficient: O(n)
    public static void moveZeroesEfficient(int[] arr) {
        int j=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


//    brute-force O(n^2)
    public static void moveZeroes(int[] arr) {
        int i = 0, j=arr.length-1;
        while(i < j) {
            if(arr[i] == 0) {
                arr = leftShiftByK(arr, i, j);
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] leftShiftByK(int[] arr, int k, int len) {
        for(int i=k; i<len; i++)
            arr[i] = arr[i+1];
        arr[len] = 0;
        int[] result = arr.clone();
        return result;
    }
}
