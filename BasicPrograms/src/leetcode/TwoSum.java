package leetcode;

/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
* */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<size; i++)
            nums[i] = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(Arrays.toString(twoSumBruteForce(nums, target)));
        System.out.println(Arrays.toString(twoSumEfficient(nums, target)));
    }

    public static int[] twoSumEfficient(int[] nums, int target) {
        HashMap<Integer, Integer> stored = new HashMap<>();
        for(int i=0; i< nums.length; i++) {
            int reqnum = target - nums[i];
            if(stored.containsKey(reqnum)) {
                int toReturn[] = {stored.get(reqnum), i};
                return toReturn;
            }
            stored.put(nums[i], i);
        }
        return null;
    }

    //        brute-force
    public static int[] twoSumBruteForce(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    int toReturn[] = {i, j};
                    return toReturn;
                }
            }
        }
        return null;
    }
}
