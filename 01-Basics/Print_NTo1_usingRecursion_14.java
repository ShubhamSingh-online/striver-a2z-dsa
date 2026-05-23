// Problem: Print N to 1 using Recursion
// Topic: Recursion
// File: Print_NTo1_usingRecursion_14.java
// Language: Java

/*
Problem Statement:
Given an integer n, print all numbers
from n to 1 using recursion.

Constraints:
- Do not use loops
- Print each number on a new line

Approach:
- Base condition:
    - If n becomes 0, stop recursion
- Print current number first
- Then recursively call function for n - 1
- This ensures numbers print in decreasing order

Time Complexity: O(n)
Space Complexity: O(n)

Reason:
- Recursive calls use stack space
*/

class Solution {

    public void printNumbers(int n) {

        // Base condition
        if(n == 0) {

            return;
        }

        // Print first
        System.out.println(n);

        // Recursive call
        printNumbers(n - 1);
    }
}

public class Print_NTO1_usingRecursion {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.printNumbers(5);
    }
}
