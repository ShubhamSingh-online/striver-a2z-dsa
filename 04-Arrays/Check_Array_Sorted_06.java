// Problem: Check if the Array is Sorted I
// Topic: Arrays
// File: Check_Array_Sorted_06.java
// Language: Java

/*
Problem Statement:
Given an array arr of size n, check whether
the array is sorted in ascending
(non-decreasing) order.

If the array is sorted, return true.
Otherwise, return false.

Approach:
- Traverse the array from index 0 to n - 2
- Compare each element with the next element
- If arr[i] > arr[i + 1]:
    - The array is not sorted
    - Return false
- If no such pair is found:
    - Return true

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public boolean arraySortedOrNot(int[] arr, int n) {

        for(int i = 0; i < n - 1; i++) {

            if(arr[i] > arr[i + 1]) {

                return false;
            }
        }

        return true;
    }
}

public class Check_Array_Sorted_06 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] arr = {1, 2, 2, 4, 5};

        boolean result = obj.arraySortedOrNot(arr, arr.length);

        System.out.println("Is Array Sorted: " + result);
    }
}
