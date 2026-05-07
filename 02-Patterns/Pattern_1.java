// Problem: Pattern 1
// Language: Java

/*
Problem Statement:
Given an integer n, print a square pattern of stars (*) 
of size n x n.

Example for n = 5:

*****
*****
*****
*****
*****

Approach:
- Use two nested loops
- Outer loop controls rows
- Inner loop prints stars in each row
- Print a new line after every row

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern1(int n) {

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}

public class Pattern_1 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern1(5);
    }
}
