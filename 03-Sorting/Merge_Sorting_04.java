// Problem: Merge Sorting
// Topic: Sorting
// File: Merge_Sorting_04.java
// Language: Java

/*
Problem Statement:
Given an array of integers nums,
sort the array in non-decreasing order
using the Merge Sort algorithm.

Approach:
- Divide the array into two halves
- Recursively sort both halves
- Merge the sorted halves together
- Continue until the entire array becomes sorted

Merge Sort follows:
Divide -> Conquer -> Merge

Time Complexity: O(n log n)
Space Complexity: O(n)

Reason:
- Array is divided recursively
- Extra temporary array is used during merging
*/

class Solution {

    public int[] mergeSort(int[] nums) {

        mergeSortHelper(nums, 0, nums.length - 1);

        return nums;
    }

    private void mergeSortHelper(int[] nums, int low, int high) {

        if(low >= high) {

            return;
        }

        int mid = (low + high) / 2;

        // Sort left half
        mergeSortHelper(nums, low, mid);

        // Sort right half
        mergeSortHelper(nums, mid + 1, high);

        // Merge both halves
        merge(nums, low, mid, high);
    }

    private void merge(int[] nums, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        // Merge sorted halves
        while(left <= mid && right <= high) {

            if(nums[left] <= nums[right]) {

                temp[k++] = nums[left++];

            } else {

                temp[k++] = nums[right++];
            }
        }

        // Remaining left elements
        while(left <= mid) {

            temp[k++] = nums[left++];
        }

        // Remaining right elements
        while(right <= high) {

            temp[k++] = nums[right++];
        }

        // Copy back to original array
        for(int i = 0; i < temp.length; i++) {

            nums[low + i] = temp[i];
        }
    }
}

public class Merge_Sorting_04 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {38, 27, 43, 3, 9, 82, 10};

        int[] result = obj.mergeSort(nums);

        System.out.print("Sorted Array: ");

        for(int num : result) {

            System.out.print(num + " ");
        }
    }
}
