// Problem: Second Largest Element
// Topic: Arrays
// File: Second_Largest_Element_02.java
// Language: Java

/*
Problem Statement:
Given an array of integers nums,
return the second-largest element
in the array.

If the second-largest element
does not exist, return -1.

Approach:
- Maintain two variables:
    - largest
    - secondLargest
- Traverse the array once
- Update largest and secondLargest
  accordingly
- Ignore duplicate largest values
- Return secondLargest

Time Complexity: O(n)
Space Complexity: O(1)

Reason:
- Array is traversed once
- No extra data structure is used
*/

class Solution {

    public int secondLargestElement(int[] nums) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {

            // Update largest
            if(nums[i] > largest) {

                secondLargest = largest;
                largest = nums[i];
            }

            // Update second largest
            else if(nums[i] > secondLargest && nums[i] != largest) {

                secondLargest = nums[i];
            }
        }

        // If second largest doesn't exist
        if(secondLargest == Integer.MIN_VALUE) {

            return -1;
        }

        return secondLargest;
    }
}

public class Second_Largest_Element_02 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {8, 8, 7, 6, 5};

        int result = obj.secondLargestElement(nums);

        System.out.println("Second Largest Element = " + result);
    }
}
