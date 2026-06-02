// Problem: Recursive Insertion Sort
// Topic: Recursion / Sorting
// File: Recursion_Insertion_Sort_06.java
// Language: Java

/*
Problem Statement:
Given an array of integers nums,
sort the array in non-decreasing order
using Recursive Insertion Sort.

Constraints:
- Use recursion only
- Do not use loops
- Do not use built-in sorting methods

Approach:
- Recursively sort first n - 1 elements
- Take the last element
- Recursively insert it into its correct position
- Continue until array becomes sorted

Recursive Insertion Sort works by:
1. Sorting smaller subarrays
2. Inserting elements at correct position

Time Complexity: O(n²)
Space Complexity: O(n)

Reason:
- Recursive calls use stack space
- Multiple recursive insert operations occur
*/

class Solution {

    public int[] insertionSort(int[] nums) {

        insertion(nums, nums.length);

        return nums;
    }

    private void insertion(int[] nums, int n) {

        // Base condition
        if(n <= 1) {

            return;
        }

        // Recursively sort first n-1 elements
        insertion(nums, n - 1);

        // Insert last element at correct position
        int last = nums[n - 1];
        int j = n - 2;

        insert(nums, j, last);
    }

    private void insert(int[] nums, int j, int last) {

        // Correct position found
        if(j < 0 || nums[j] <= last) {

            nums[j + 1] = last;

            return;
        }

        // Shift element to right
        nums[j + 1] = nums[j];

        // Recursive call
        insert(nums, j - 1, last);
    }
}

public class Recursion_Insertion_Sort_06 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {12, 11, 13, 5, 6};

        int[] result = obj.insertionSort(nums);

        System.out.print("Sorted Array: ");

        for(int num : result) {

            System.out.print(num + " ");
        }
    }
}
