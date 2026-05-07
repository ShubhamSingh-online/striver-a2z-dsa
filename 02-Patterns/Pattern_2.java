// Problem: Pattern 2
// Language: Java

/*
Problem Statement:
Given an integer n, print the following pattern.

Example for n = 5:

*
**
***
****
*****

Approach:
- Use two nested loops
- Outer loop controls rows
- Inner loop prints stars according to the current row number
- Print a new line after every row

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern2(int n) {

        for(int i = 0; i < n; i++) {

            for(int j = 0; j <= i; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}

public class Pattern_2 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern2(5);
    }
}
