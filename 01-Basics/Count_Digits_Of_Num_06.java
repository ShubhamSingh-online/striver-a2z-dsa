// Problem: Count all Digits of a Number
// Topic: Basic Maths
// File: Count_Digits_Of_Num_06.java
// Language: Java

/*
Problem Statement:
Given an integer n, return the number of digits in the number.

The number will have no leading zeroes,
except when the number is 0 itself.

Approach:
- Initialize count as 0
- Repeatedly divide the number by 10
- Increase count after each division
- Continue until the number becomes 0
- Return the final count

Time Complexity: O(log10 n)
Space Complexity: O(1)
*/

class Solution {

    public int countDigit(int n) {

        int count = 0;

        while(n > 0) {

            count++;

            n = n / 10;
        }

        return count;
    }
}

public class Count_Digits_Of_Num_06 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int result = obj.countDigit(12345);

        System.out.println("Number of Digits = " + result);
    }
}
