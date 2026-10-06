// Problem: Count of Odd Numbers in Array
// Topic: Arrays
// File: Count_Odd_Numbers_05.java
// Language: Java

/*
Problem Statement:
Given an array of n elements, count and return
the number of odd numbers present in the array.

Approach:
- Initialize count as 0
- Traverse the array from index 0 to n - 1
- Check if each element is odd using:
    arr[i] % 2 != 0
- If it is odd, increment count
- Return the final count

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int countOdd(int[] arr, int n) {

        int count = 0;

        for(int i = 0; i < n; i++) {

            if(arr[i] % 2 != 0) {

                count++;
            }
        }

        return count;
    }
}

public class Count_Odd_Numbers_05 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] arr = {1, 2, 3, 4, 5, 7, 8};

        int result = obj.countOdd(arr, arr.length);

        System.out.println("Count of Odd Numbers = " + result);
    }
}
