// Problem: Bubble Sort
// Topic: Sorting
// File: Bubble_Sort_02.java
// Language: Java

/*
Problem Statement:
Given an array of integers nums,
sort the array in non-decreasing order
using the Bubble Sort algorithm.

Approach:
- Repeatedly compare adjacent elements
- Swap them if they are in wrong order
- After every iteration:
    - largest element moves to the end
- Continue until array becomes sorted

Bubble Sort works by "bubbling"
larger elements toward the end.

Time Complexity: O(n²)
Space Complexity: O(1)

Reason:
- Nested loops are used
- Sorting is done in-place
*/

class Solution {

    public int[] bubbleSort(int[] nums) {

        int n = nums.length;

        for(int i = 0; i < n - 1; i++) {

            for(int j = 0; j < n - i - 1; j++) {

                // Swap if elements are in wrong order
                if(nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }
}

public class Bubble_Sort_02 {

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
