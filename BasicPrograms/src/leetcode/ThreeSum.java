package leetcode;

/*
* Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    Notice that the solution set must not contain duplicate triplets.
    Example 1:
    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
    *
    6
    -1 0 1 2 -1 -4
* */

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++)
            nums[i] = sc.nextInt();
//        System.out.println(Arrays.asList(bruteForce(nums)));
        System.out.println(Arrays.asList(efficient(nums)));
    }

    public static List<List<Integer>> efficient(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Sort the given array
        Arrays.sort(nums);

        for (int num1idx = 0; num1idx < nums.length; num1idx++) {
            // Skip all duplicates from left
            // num1Idx>0 ensures this check is made only from 2nd element onwards
            if(num1idx > 0 && nums[num1idx] == nums[num1idx - 1])
                continue;;
            int num2idx = num1idx + 1;
            int num3idx = nums.length - 1;
            while(num2idx < num3idx) {
                int sum = nums[num1idx] + nums[num2idx] + nums[num3idx];
                if(sum > 0) {
                    // Decrement num3Idx to reduce sum value
                    num3idx--;
                } else if(sum < 0) {
                    // Increment num2Idx to increase sum value
                    num2idx++;
                } else {
                    // Add triplet to result
                    result.add(Arrays.asList(nums[num1idx], nums[num2idx], nums[num3idx]));
                    num3idx--;
                    // Skip all duplicates from right
                    while(num2idx < num3idx && nums[num3idx] == nums[num3idx + 1]) num3idx--;
                }
            }
        }
        return result;
    }

    public static List<List<Integer>> bruteForce(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> crt = new ArrayList<Integer>();
                        crt.add(nums[i]);
                        crt.add(nums[j]);
                        crt.add(nums[k]);
                        Collections.sort(crt);
                        result.add(crt);
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
    }
}
