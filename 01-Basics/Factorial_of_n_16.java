// Problem: Factorial of a Given Number
// Topic: Recursion
// File: Factorial_of_n_16.java
// Language: Java

/*
Problem Statement:
Given an integer n, return the factorial of n.

Factorial of a number is the product
of all positive integers less than
or equal to that number.

Example:
5! = 5 × 4 × 3 × 2 × 1 = 120

Approach:
- Base condition:
    - If n is 0 or 1, return 1
- Recursive relation:
    - factorial(n) = n × factorial(n - 1)
- Continue recursion until base condition is reached

Time Complexity: O(n)
Space Complexity: O(n)

Reason:
- Recursive function calls use stack space
*/

class Solution {

    public int factorial(int n) {

        // Base condition
        if(n == 0 || n == 1) {

            return 1;
        }

        // Recursive relation
        return n * factorial(n - 1);
    }
}

public class Factorial_of_n_16 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int result = obj.factorial(5);

        System.out.println("Factorial = " + result);
    }
}
