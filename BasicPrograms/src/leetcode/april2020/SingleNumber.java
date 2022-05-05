package leetcode.april2020;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
        You must implement a solution with a linear runtime complexity and use only constant extra space.

3
2 2 1
output: 1

5
4 1 2 1 2
output: 4
*/

import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<size; i++)
            nums[i] = sc.nextInt();
        System.out.println(singleNumberUsingXOR(nums));
        System.out.println(singleNumberUsingHashMap(nums));
    }

/*
    Using HashMap;
        Complexity Analysis
        Time: O(N) : Let n be length of nums
        Space: O(N) : Let n be length of nums
*/
    public static int singleNumberUsingHashMap(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int count = 1;
        for(int i=0; i<nums.length; i++) {
            if(hashMap.containsKey(nums[i]))
                hashMap.replace(nums[i], count, count+1);
            else
                hashMap.put(nums[i], count);
        }

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() == count)
                return entry.getKey();
        }
        return -1;
    }

/*
    Using XOR;
        Complexity Analysis
        Time: O(N) : Let n be length of nums
        Space: O(1)
        The XOR of a number with itself is zero and XOR of any number with zero is that number.
                So, after encountering a number even number of times (2 in this questions) it's XOR will be 0
                and after encountering it odd number of times (1 in this question) it's XOR will be number itself.
                After taking XOR of entire array only the number which is one time, will be left.
*/
    public static int singleNumberUsingXOR(int[] nums) {
        int crt = nums[0];
        for(int i=1; i<nums.length; i++)
            crt = crt ^ nums[i];
        return crt;
    }
}