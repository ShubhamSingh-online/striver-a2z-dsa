// Problem: Sum of First N Numbers
// Topic: Recursion
// File: Sum_of_first_N_numbers_15.java
// Language: Java

/*
Problem Statement:
Given an integer N, return the sum
of the first N natural numbers
using recursion.

Example:
N = 5
Sum = 1 + 2 + 3 + 4 + 5 = 15

Approach:
- Base condition:
    - If N becomes 0, return 0
- Recursive relation:
    - Sum(N) = N + Sum(N - 1)
- Continue recursion until base condition is reached

Time Complexity: O(n)
Space Complexity: O(n)

Reason:
- Recursive function calls use stack space
*/

class Solution {

    public int NnumbersSum(int N) {

        // Base condition
        if(N == 0) {

            return 0;
        }

        // Recursive relation
        return N + NnumbersSum(N - 1);
    }
}

public class Sum_of_first_N_numbers_15 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int result = obj.NnumbersSum(5);

        System.out.println("Sum = " + result);
    }
}
