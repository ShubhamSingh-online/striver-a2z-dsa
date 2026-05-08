// Problem: Pattern 9
// Language: Java

/*
Problem Statement:
Given an integer n, print the following diamond pattern.

Example for n = 5:

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

Approach:
- First half prints a pyramid
- Second half prints an inverted pyramid
- Use nested loops for spaces and stars
- Print odd number of stars in each row

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern9(int n) {

        // Upper Pyramid
        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n - i - 1; j++) {

                System.out.print(" ");
            }

            for(int j = 0; j < 2 * i + 1; j++) {

                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Inverted Pyramid
        for(int i = 0; i < n; i++) {

            for(int j = 0; j < i; j++) {

                System.out.print(" ");
            }

            for(int j = 0; j < 2 * n - (2 * i + 1); j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}

public class Pattern_9 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern9(5);
    }
}
