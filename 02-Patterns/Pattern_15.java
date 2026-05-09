// Problem: Pattern 15
// Language: Java

/*
Problem Statement:
Given an integer n, print the following pattern.

Example for n = 5:

ABCDE
ABCD
ABC
AB
A

Approach:
- Use nested loops
- Outer loop controls rows
- Inner loop prints characters starting from 'A'
  up to decreasing character limits
- Print a new line after every row

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern15(int n) {

        for(int i = 0; i < n; i++) {

            for(char j = 'A'; j <= 'A' + (n - i - 1); j++) {

                System.out.print(j);
            }

            System.out.println();
        }
    }
}

public class Pattern_15 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern15(5);
    }
}
