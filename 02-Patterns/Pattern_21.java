// Problem: Pattern 20
// Language: Java

/*
Problem Statement:
Given an integer n, print the following pattern.

Example for n = 5:

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

Approach:
- Divide the pattern into:
    1. Upper half
    2. Lower half
- Print stars on both sides
- Print spaces in the middle
- Decrease spaces in upper half
- Increase spaces in lower half

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern20(int n) {

        int spaces = 2 * n - 2;

        // Upper half
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            for(int j = 1; j <= spaces; j++) {

                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            spaces -= 2;

            System.out.println();
        }

        spaces = 2;

        // Lower half
        for(int i = n - 1; i >= 1; i--) {

            for(int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            for(int j = 1; j <= spaces; j++) {

                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            spaces += 2;

            System.out.println();
        }
    }
}

public class Pattern_20 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern20(5);
    }
}
