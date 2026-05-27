// Problem: Fibonacci Number
// Topic: Recursion
// File: Fibonacci_19.java
// Language: Java

/*
Problem Statement:
Given an integer n, calculate
the nth Fibonacci number.

Fibonacci Sequence:
F(0) = 0
F(1) = 1

F(n) = F(n - 1) + F(n - 2)

Example:
n = 5
Output = 5

Sequence:
0 1 1 2 3 5

Approach:
- Use recursion
- Base conditions:
    - If n == 0, return 0
    - If n == 1, return 1
- Recursive relation:
    - fib(n) = fib(n - 1) + fib(n - 2)

Time Complexity: O(2ⁿ)
Space Complexity: O(n)

Reason:
- Recursive calls create stack space
- Many overlapping recursive calls occur
*/

class Solution {

    public int fib(int n) {

        // Base conditions
        if(n == 0) {

            return 0;
        }

        if(n == 1) {

            return 1;
        }

        // Recursive relation
        return fib(n - 1) + fib(n - 2);
    }
}

public class Fibonacci_19 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int result = obj.fib(5);

        System.out.println("Fibonacci Number = " + result);
    }
}
