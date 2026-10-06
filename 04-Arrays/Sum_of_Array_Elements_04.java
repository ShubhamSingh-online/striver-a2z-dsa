// Problem: Sum of Array Elements
// Topic: Arrays
// File: Sum_of_Array_Elements_04.java
// Language: Java

/*
Problem Statement:
Given an array arr of size n, find the
sum of all the elements in the array.

Approach:
- Initialize sum as 0
- Traverse the array from index 0 to n - 1
- Add each element to sum
- Return the final sum

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int sum(int arr[], int n) {

        int sum = 0;

        for(int i = 0; i < n; i++) {

            sum = sum + arr[i];
        }

        return sum;
    }
}

public class Sum_of_Array_Elements_04 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] arr = {1, 2, 3, 4, 5};

        int result = obj.sum(arr, arr.length);

        System.out.println("Sum of Array Elements = " + result);
    }
}
