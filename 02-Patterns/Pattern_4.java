// Problem: Pattern 4
// Language: Java

/*
Problem Statement:
Given an integer n, print the following pattern.

Example for n = 5:

1
22
333
4444
55555

Approach:
- Use two nested loops
- Outer loop controls rows
- Inner loop prints the current row number
- Print a new line after every row

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern4(int n) {

        for(int i = 0; i < n; i++) {

            for(int j = 0; j <= i; j++) {

                System.out.print(i + 1);
            }

            System.out.println();
        }
    }
}

public class Pattern_4 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern4(5);
    }
}
