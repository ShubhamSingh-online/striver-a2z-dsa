// Problem: Counting Frequencies of Array Elements
// Topic: Hashing
// File: Counting_FrequenciesOfArray_Elements_20.java
// Language: Java

import java.util.*;

/*
Problem Statement:
Given an array nums of size n,
return a list of pairs where:
- first element = unique number
- second element = frequency of that number

Each unique element should appear only once.

Approach:
- Use HashMap to store frequencies
- Traverse array:
    - Increase frequency count
- Traverse HashMap:
    - Store each number-frequency pair
      into the answer list

Time Complexity: O(n)
Space Complexity: O(n)

Reason:
- HashMap stores frequencies of elements
*/

class Solution {

    public List<List<Integer>> countFrequencies(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for(int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> ans = new ArrayList<>();

        // Store result
        for(int key : map.keySet()) {

            List<Integer> pair = new ArrayList<>();

            pair.add(key);
            pair.add(map.get(key));

            ans.add(pair);
        }

        return ans;
    }
}

public class Counting_FrequenciesOfArray_Elements_20 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 2, 2, 3, 1, 1, 4};

        List<List<Integer>> result = obj.countFrequencies(nums);

        System.out.println("Element Frequencies:");

        for(List<Integer> pair : result) {

            System.out.println(pair.get(0) + " -> " + pair.get(1));
        }
    }
}
