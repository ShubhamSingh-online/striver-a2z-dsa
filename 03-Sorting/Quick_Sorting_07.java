// Problem: Quick Sorting
// Topic: Sorting
// File: Quick_Sorting_07.java
// Language: Java

/*
Problem Statement:
Given an array of integers nums,
sort the array in non-decreasing order
using the Quick Sort algorithm.

Approach:
- Select a pivot element
- Place pivot at its correct sorted position
- Elements smaller than pivot go left
- Elements greater than pivot go right
- Recursively sort left and right parts

Quick Sort follows:
Divide -> Partition -> Recursively Sort

Time Complexity:
- Best/Average Case: O(n log n)
- Worst Case: O(n²)

Space Complexity: O(log n)

Reason:
- Recursive calls use stack space
*/

class Solution {

    public int[] quickSort(int[] nums) {

        quick(nums, 0, nums.length - 1);

        return nums;
    }

    private void quick(int[] nums, int low, int high) {

        if(low < high) {

            int pivotIndex = partition(nums, low, high);

            // Sort left part
            quick(nums, low, pivotIndex - 1);

            // Sort right part
            quick(nums, pivotIndex + 1, high);
        }
    }

    private int partition(int[] nums, int low, int high) {

        int pivot = nums[low];

        int i = low;
        int j = high;

        while(i < j) {

            while(i <= high - 1 && nums[i] <= pivot) {

                i++;
            }

            while(j >= low + 1 && nums[j] > pivot) {

                j--;
            }

            if(i < j) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;
    }
}

public class Quick_Sorting_07 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {10, 7, 8, 9, 1, 5};

        int[] result = obj.quickSort(nums);

        System.out.print("Sorted Array: ");

        for(int num : result) {

            System.out.print(num + " ");
        }
    }
}
