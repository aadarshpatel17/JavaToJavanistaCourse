package leetcode;

import java.util.Arrays;
import java.util.Scanner;

/*
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

        For example, for arr = [1,2,3], the following are considered permutations of arr: [1,2,3], [1,3,2], [3,1,2], [2,3,1].
        The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

        For example, the next permutation of arr = [1,2,3] is [1,3,2].
        Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
        While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
        Given an array of integers nums, find the next permutation of nums.

        The replacement must be in place and use only constant extra memory.

3
3 2 1
1 2 3

3
1 2 3
1 3 2

3
1 1 5
1 5 1

3
1 3 2
2 1 3


*/

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<size; i++)
            nums[i] = sc.nextInt();
        System.out.println(nextPermutation(nums));
    }

    public static String nextPermutation(int[] nums) {

        int pivot = longestNonIncreasingSuffix(nums) - 1;
        if(pivot != -1) {
            int rightPrefix = rightMostSuccessor(nums, pivot);
            swap(nums, pivot, rightPrefix);
        }
        reverseSuffix(nums, pivot + 1);
        return Arrays.toString(nums);
    }

    public static void reverseSuffix(int[] nums, int start) {
        int end = nums.length - 1;
        while(start < end)
            swap(nums, start++, end--);
    }

    public static void swap(int[] nums, int pivot, int rightPrefix) {
        int temp = nums[pivot];
        nums[pivot] = nums[rightPrefix];
        nums[rightPrefix] = temp;
    }

    public static int rightMostSuccessor(int[] nums, int pivot) {
        for(int i=nums.length-1; i>=0; i--) {
            if(nums[i] > nums[pivot])
                return i;
        }
        return -1;
    }

    public static int longestNonIncreasingSuffix(int[] nums) {
       for(int i= nums.length-1; i>0; i--)
            if(nums[i-1] < nums[i])
                return i;
        return 0;
    }


//    public static String nextPermutation(int[] nums) {
//        int len = nums.length - 1;
//        for(int i=len; i>=1; i--) {
//            if(nums[i] > nums[i-1]) {
//                int temp = nums[i];
//                nums[i] = nums[i-1];
//                nums[i-1] = temp;
//                return Arrays.toString(nums);
//            }
//        }
//        Arrays.sort(nums);
//        return Arrays.toString(nums);
//    }
}
