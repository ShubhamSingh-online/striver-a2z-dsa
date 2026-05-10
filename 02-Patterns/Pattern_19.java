// Problem: Pattern 19
// Language: Java

/*
Problem Statement:
Given an integer n, print the following pattern.

Example for n = 5:

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

Approach:
- Divide the pattern into two halves:
    1. Upper half
    2. Lower half
- Print stars on both sides
- Print spaces in the middle
- Increase and decrease middle spaces accordingly

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern19(int n) {

        int iniS = 0;

        // Upper Half
        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n - i; j++) {

                System.out.print("*");
            }

            for(int j = 0; j < iniS; j++) {

                System.out.print(" ");
            }

            for(int j = 0; j < n - i; j++) {

                System.out.print("*");
            }

            iniS += 2;

            System.out.println();
        }

        iniS = 2 * n - 2;

        // Lower Half
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            for(int j = 0; j < iniS; j++) {

                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            iniS -= 2;

            System.out.println();
        }
    }
}

public class Pattern_19 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern19(5);
    }
}
