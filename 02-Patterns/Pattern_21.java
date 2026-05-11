// Problem: Pattern 21
// Language: Java

/*
Problem Statement:
Given an integer n, print the following hollow square pattern.

Example for n = 5:

*****
*   *
*   *
*   *
*****

Approach:
- Use nested loops to traverse rows and columns
- Print '*' on:
    - first row
    - last row
    - first column
    - last column
- Print spaces for inner positions

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern21(int n) {

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {

                if(i == 0 || i == n - 1 || j == 0 || j == n - 1) {

                    System.out.print("*");

                } else {

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

public class Pattern_21 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern21(5);
    }
}
