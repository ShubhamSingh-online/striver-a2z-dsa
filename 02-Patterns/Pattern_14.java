// Problem: Pattern 14
// Language: Java

/*
Problem Statement:
Given an integer n, print the following pattern.

Example for n = 5:

A
AB
ABC
ABCD
ABCDE

Approach:
- Use nested loops
- Outer loop controls rows
- Inner loop prints characters starting from 'A'
  up to the current row character
- Print a new line after every row

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern14(int n) {

        for(int i = 0; i < n; i++) {

            for(char j = 'A'; j <= 'A' + i; j++) {

                System.out.print(j);
            }

            System.out.println();
        }
    }
}

public class Pattern_14 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern14(5);
    }
}
