// Problem: Pattern 6
// Language: Java

/*
Problem Statement:
Given an integer n, print the following pattern.

Example for n = 5:

12345
1234
123
12
1

Approach:
- Use two nested loops
- Outer loop controls rows
- Inner loop prints numbers from 1 to decreasing limit
- Print a new line after every row

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern6(int n) {

        for(int i = 0; i < n; i++) {

            for(int j = 1; j <= n - i; j++) {

                System.out.print(j);
            }

            System.out.println();
        }
    }
}

public class Pattern_6 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern6(5);
    }
}
