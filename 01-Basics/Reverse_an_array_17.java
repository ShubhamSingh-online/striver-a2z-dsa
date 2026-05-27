// Problem: Reverse an Array
// Topic: Recursion / Arrays
// File: Reverse_an_array_17.java
// Language: Java

/*
Problem Statement:
Given an array arr of n elements,
reverse the array in-place.

Approach:
- Use two pointers:
    - left starts from beginning
    - right starts from end
- Swap elements at left and right
- Move both pointers towards center
- Continue until left becomes greater
  than or equal to right

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public void reverse(int[] arr, int n) {

        int left = 0;
        int right = n - 1;

        while(left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}

public class Reverse_an_array_17 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] arr = {1, 2, 3, 4, 5};

        obj.reverse(arr, arr.length);

        System.out.print("Reversed Array: ");

        for(int num : arr) {

            System.out.print(num + " ");
        }
    }
}
