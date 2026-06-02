// Problem: Recursive Bubble Sort
// Topic: Recursion / Sorting
// File: Recursive_Bubble_Sort_05.java
// Language: Java

/*
Problem Statement:
Given an array of integers nums,
sort the array in non-decreasing order
using Recursive Bubble Sort.

Constraints:
- Use recursion only
- Do not use built-in sorting methods

Approach:
- Perform one Bubble Sort pass:
    - compare adjacent elements
    - swap if they are in wrong order
- Largest element moves to the end
- Recursively sort remaining n - 1 elements
- Stop recursion when size becomes 1

Time Complexity: O(n²)
Space Complexity: O(n)

Reason:
- Nested comparisons occur
- Recursive calls use stack space
*/

class Solution {

    public int[] bubbleSort(int[] nums) {

        bubble(nums, nums.length);

        return nums;
    }

    private void bubble(int[] nums, int n) {

        // Base condition
        if(n == 1) {

            return;
        }

        // One bubble pass
        for(int i = 0; i < n - 1; i++) {

            if(nums[i] > nums[i + 1]) {

                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }

        // Recursive call
        bubble(nums, n - 1);
    }
}

public class Recursive_Bubble_Sort_05 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {64, 34, 25, 12, 22, 11, 90};

        int[] result = obj.bubbleSort(nums);

        System.out.print("Sorted Array: ");

        for(int num : result) {

            System.out.print(num + " ");
        }
    }
}
