// Problem: Pattern 7
// Language: Java

/*
Problem Statement:
Given an integer n, print the following pyramid pattern.

Example for n = 5:

    *
   ***
  *****
 *******
*********

Approach:
- Use nested loops
- First loop prints leading spaces
- Second loop prints odd number of stars
- Move to the next line after each row

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern7(int n) {

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n - i - 1; j++) {

                System.out.print(" ");
            }

            for(int j = 0; j < 2 * i + 1; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}

public class Pattern_7 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern7(5);
    }
}
