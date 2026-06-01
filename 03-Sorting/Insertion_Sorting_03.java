// Problem: Insertion Sorting
// Topic: Sorting
// File: Insertion_Sorting_03.java
// Language: Java

/*
Problem Statement:
Given an array of integers nums,
sort the array in non-decreasing order
using the Insertion Sort algorithm.

Approach:
- Start from the second element
- Treat left part as sorted
- Pick current element as key
- Shift larger elements one position ahead
- Insert key at correct position

Insertion Sort builds the sorted array
one element at a time.

Time Complexity: O(n²)
Space Complexity: O(1)

Reason:
- Nested operations may occur
- Sorting is done in-place
*/

class Solution {

    public int[] insertionSort(int[] nums) {

        int n = nums.length;

        for(int i = 1; i < n; i++) {

            int key = nums[i];
            int j = i - 1;

            // Shift elements greater than key
            while(j >= 0 && nums[j] > key) {

                nums[j + 1] = nums[j];
                j--;
            }

            // Place key at correct position
            nums[j + 1] = key;
        }

        return nums;
    }
}

public class Insertion_Sorting_03 {

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
