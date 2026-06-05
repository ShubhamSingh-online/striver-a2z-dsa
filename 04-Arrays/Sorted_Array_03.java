// Problem: Check if the Array is Sorted II
// Topic: Arrays
// File: Sorted_Array_03.java
// Language: Java

import java.util.ArrayList;

/*
Problem Statement:
Given an array nums of n integers,
return true if the array is sorted
in non-decreasing order,
otherwise return false.

A non-decreasing array means:
nums[i] <= nums[i + 1]

Approach:
- Traverse the array
- Compare every element with next element
- If current element is greater:
    - array is not sorted
    - return false
- If traversal completes:
    - return true

Time Complexity: O(n)
Space Complexity: O(1)

Reason:
- Array is traversed once
- No extra data structure is used
*/

class Solution {

    public boolean isSorted(ArrayList<Integer> nums) {

        for(int i = 0; i < nums.size() - 1; i++) {

            if(nums.get(i) > nums.get(i + 1)) {

                return false;
            }
        }

        return true;
    }
}

public class Sorted_Array_03 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        boolean result = obj.isSorted(nums);

        System.out.println("Is Array Sorted: " + result);
    }
}
