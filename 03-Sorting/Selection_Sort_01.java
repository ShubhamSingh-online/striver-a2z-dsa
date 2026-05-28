// Problem: Selection Sort
// Topic: Sorting
// File: Selection_Sort_22.java
// Language: Java

/*
Problem Statement:
Given an array of integers nums,
sort the array in non-decreasing order
using the Selection Sort algorithm.

Approach:
- Divide array into sorted and unsorted parts
- Find the minimum element from unsorted part
- Swap it with current index
- Repeat for all positions

Selection Sort repeatedly selects
the smallest element and places it
at the correct position.

Time Complexity: O(n²)
Space Complexity: O(1)

Reason:
- Nested loops are used
- Sorting is done in-place
*/

class Solution {

    public int[] selectionSort(int[] nums) {

        int n = nums.length;

        for(int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find minimum element
            for(int j = i + 1; j < n; j++) {

                if(nums[j] < nums[minIndex]) {

                    minIndex = j;
                }
            }

            // Swap
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        return nums;
    }
}

public class Selection_Sort_22 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {64, 25, 12, 22, 11};

        int[] result = obj.selectionSort(nums);

        System.out.print("Sorted Array: ");

        for(int num : result) {

            System.out.print(num + " ");
        }
    }
}
