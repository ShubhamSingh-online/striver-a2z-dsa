// Problem: Reverse an Array In-Place
// Topic: Pass by Reference Basics
// Language: Java

/*
Problem Statement:
Given an array arr of n elements, reverse the array in-place.

Approach:
- Use two pointers:
    - start from beginning
    - end from last index
- Swap elements at start and end
- Move both pointers towards the center
- Continue until start becomes greater than or equal to end

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while(start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}

public class Pass_by_Ref_basics {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] arr = {1, 2, 3, 4, 5};

        obj.reverse(arr);

        System.out.print("Reversed Array: ");

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
