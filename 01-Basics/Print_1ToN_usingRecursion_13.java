// Problem: Print 1 to N using Recursion
// Topic: Recursion
// File: Print_1ToN_usingRecursion_13.java
// Language: Java

/*
Problem Statement:
Given an integer n, print all numbers
from 1 to n using recursion.

Constraints:
- Do not use loops
- Print each number on a new line

Approach:
- Base condition:
    - If n becomes 0, stop recursion
- Recursive call:
    - First call function for n - 1
- Print current number after recursive call
- This ensures numbers print in increasing order

Time Complexity: O(n)
Space Complexity: O(n)

Reason:
- Recursive function calls use stack space
*/

class Solution {

    public void printNumbers(int n) {

        // Base condition
        if(n == 0) {

            return;
        }

        // Recursive call
        printNumbers(n - 1);

        // Print number
        System.out.println(n);
    }
}

public class Print_1ToN_usingRecursion_13 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.printNumbers(5);
    }
}
