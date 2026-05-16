// Problem: Reverse a Number
// Topic: Basic Maths
// File: Reverse_a_Number_7.java
// Language: Java

/*
Problem Statement:
Given an integer n, return the integer formed
by placing the digits of n in reverse order.

Approach:
- Extract the last digit using modulo (% 10)
- Add the digit to the reversed number
- Multiply reversed number by 10 before adding next digit
- Remove last digit from n using division (/ 10)
- Repeat until n becomes 0

Time Complexity: O(log10 n)
Space Complexity: O(1)
*/

class Solution {

    public int reverseNumber(int n) {

        int revNum = 0;

        while(n > 0) {

            int lastDigit = n % 10;

            revNum = revNum * 10 + lastDigit;

            n = n / 10;
        }

        return revNum;
    }
}

public class Reverse_a_Number_7 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int result = obj.reverseNumber(12345);

        System.out.println("Reversed Number = " + result);
    }
}
