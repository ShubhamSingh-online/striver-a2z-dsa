// Problem: Check if the Number is Armstrong
// Topic: Basic Maths
// File: If_the_Number_is_Armstrong_10.java
// Language: Java

/*
Problem Statement:
Given an integer n, check whether it is
an Armstrong number or not.

An Armstrong number is a number which is equal
to the sum of its digits raised to the power
of the total number of digits.

Example:
153 = 1³ + 5³ + 3³ = 153

Approach:
- Count the total number of digits
- Extract each digit using % 10
- Raise each digit to the power of digit count
- Add the results to armNum
- Compare armNum with the original number

Time Complexity: O(log₁₀ n)
Space Complexity: O(1)
*/

class Solution {

    public boolean isArmstrong(int n) {

        int realNum = n;
        int countNum = n;
        int armNum = 0;
        int count = 0;

        // Count digits
        while(countNum > 0) {

            count++;
            countNum = countNum / 10;
        }

        // Calculate Armstrong sum
        while(n > 0) {

            int lastNum = n % 10;

            n = n / 10;

            armNum = armNum + (int)Math.pow(lastNum, count);
        }

        return armNum == realNum;
    }
}

public class If_the_Number_is_Armstrong_10 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        boolean result = obj.isArmstrong(153);

        System.out.println("Is Armstrong Number: " + result);
    }
}
