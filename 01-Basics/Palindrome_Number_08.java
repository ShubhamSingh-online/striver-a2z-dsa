// Problem: Palindrome Number
// Topic: Basic Maths
// File: Palindrome_Number_08.java
// Language: Java

/*
Problem Statement:
Given an integer n, check whether the number
is a palindrome number or not.

A palindrome number reads the same
from left to right and right to left.

Approach:
- Store original number in a duplicate variable
- Reverse the number digit by digit
- Compare reversed number with original number
- If both are equal, return true
- Otherwise, return false

Time Complexity: O(log10 n)
Space Complexity: O(1)
*/

class Solution {

    public boolean isPalindrome(int n) {

        int revNum = 0;
        int dup = n;

        while(n > 0) {

            int ld = n % 10;

            revNum = (revNum * 10) + ld;

            n = n / 10;
        }

        if(dup == revNum) {

            return true;

        } else {

            return false;
        }
    }
}

public class Palindrome_Number {

    public static void main(String[] args) {

        Solution obj = new Solution();

        boolean result = obj.isPalindrome(121);

        System.out.println("Is Palindrome: " + result);
    }
}
