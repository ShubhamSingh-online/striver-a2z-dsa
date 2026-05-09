// Problem: Pattern 17
// Language: Java

/*
Problem Statement:
Given an integer n, print the following pattern.

Example for n = 5:

    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

Approach:
- Use nested loops to construct the pattern row by row
- First inner loop prints leading spaces for alignment
- Second inner loop prints characters in increasing then decreasing order
- Use a midpoint (breakpoint) to decide when to increment and decrement characters
- Characters start from 'A' and grow till the middle, then shrink back

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern17(int n) {

        for (int i = 0; i < n; i++) {

            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;

            // Print characters
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);

                if (j < breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }

            System.out.println();
        }
    }
}

public class Pattern_17 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern17(5);
    }
}
