// Problem: Largest Element
// Topic: Arrays
// File: Largest_Element_01.java
// Language: Java

/*
Problem Statement:
Given an array of integers nums,
return the largest element in the array.

Approach:
- Assume first element is the largest
- Traverse the array from index 1
- Compare each element with current largest
- Update largest if bigger element is found
- Return the final largest value

Time Complexity: O(n)
Space Complexity: O(1)

Reason:
- Array is traversed once
- No extra data structure is used
*/

class Solution {

    public int largestElement(int[] nums) {

        int largest = nums[0];

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] > largest) {

                largest = nums[i];
            }
        }

        return largest;
    }
}

public class Largest_Element_01 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {12, 45, 7, 89, 23};

        int result = obj.largestElement(nums);

        System.out.println("Largest Element = " + result);
    }
}
