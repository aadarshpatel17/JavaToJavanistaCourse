package leetcode.april2020;

import java.util.*;

/*
    Given an array of strings strs, group the anagrams together. You can return the answer in any order.
        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
        typically using all the original letters exactly once.

        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

        Input: strs = [""]
        Output: [[""]]

        Input: strs = ["a"]
        Output: [["a"]]
*/

public class GroupAnagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String str = "[\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\"]";
        String str = sc.next();
        String[] s = str.replaceAll("\\[", "")
                .replaceAll("]", "")
                .split(",");
        System.out.println(groupAnagram(s));
    }

    public static List<List<String>> groupAnagram(String[] str) {
        if(str == null || str.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for(String s: str) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String keyStr = String.valueOf(ch);
            if(!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
