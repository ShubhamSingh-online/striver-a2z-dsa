// Problem: Factorial of a Given Number
// Topic: Basic Maths
// File: Factorial_of_n_17.java
// Language: Java

/*
Problem Statement:
Given a non-negative integer n, return the
factorial of n.

The factorial of n is the multiplication
of all positive integers smaller than or
equal to n.

Example:
5! = 5 × 4 × 3 × 2 × 1 = 120

Approach:
- Initialize fac as 1
- Start a loop from n down to 1
- Multiply each number with fac
- Return the final factorial

Note:
- long is used because factorial values grow
  very quickly and may exceed the range of int.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public long factorial(int n) {

        long fac = 1;

        for(int i = n; i >= 1; i--) {

            fac = fac * i;
        }

        return fac;
    }
}

public class Factorial_of_n_17 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        long result = obj.factorial(5);

        System.out.println("Factorial = " + result);
    }
}
