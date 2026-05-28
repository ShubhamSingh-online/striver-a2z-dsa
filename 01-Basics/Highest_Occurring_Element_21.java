// Problem: Highest Occurring Element in an Array
// Topic: Hashing
// File: Highest_Occurring_Element_21.java
// Language: Java

import java.util.*;

/*
Problem Statement:
Given an array nums of n integers,
find the element that occurs
the maximum number of times.

If multiple elements have the same
highest frequency, return the smallest one.

Approach:
- Use HashMap to count frequencies
- Traverse array and store frequency of each element
- Traverse HashMap:
    - Update answer if higher frequency found
    - If frequencies are equal:
        - choose smaller element

Time Complexity: O(n)
Space Complexity: O(n)

Reason:
- HashMap stores frequencies of elements
*/

class Solution {

    public int mostFrequentElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for(int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int ans = Integer.MAX_VALUE;

        // Find most frequent element
        for(int key : map.keySet()) {

            int freq = map.get(key);

            if(freq > maxFreq) {

                maxFreq = freq;
                ans = key;
            }

            else if(freq == maxFreq && key < ans) {

                ans = key;
            }
        }

        return ans;
    }
}

public class Highest_Occurring_Element_21 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 2, 2, 3, 1, 1, 4};

        int result = obj.mostFrequentElement(nums);

        System.out.println("Highest Occurring Element = " + result);
    }
}
