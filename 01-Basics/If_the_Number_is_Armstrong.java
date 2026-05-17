// Problem: Check if the Number is Armstrong
// Topic: Basic Maths
// File: If_the_Number_is_Armstrong.java
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
- Count total digits in the number
- Extract each digit using modulo (% 10)
- Raise digit to the power of digit count
- Add all powered values
- Compare final sum with original number

Time Complexity: O(log10 n)
Space Complexity: O(1)
*/

class Solution {

    public boolean isArmstrong(int n) {

        int count = 0;
        int temp = n;
        int og = n;

        double sum = 0;

        // Count digits
        while(n > 0) {

            n = n / 10;

            count++;
        }

        // Calculate Armstrong sum
        while(temp > 0) {

            int x = temp % 10;

            sum = sum + Math.pow(x, count);

            temp = temp / 10;
        }

        return (og == sum);
    }
}

public class If_the_Number_is_Armstrong {

    public static void main(String[] args) {

        Solution obj = new Solution();

        boolean result = obj.isArmstrong(153);

        System.out.println("Is Armstrong Number: " + result);
    }
}
