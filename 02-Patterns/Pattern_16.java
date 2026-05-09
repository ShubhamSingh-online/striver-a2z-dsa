// Problem: Pattern 16
// Language: Java

/*
Problem Statement:
Given an integer n, print the following pattern.

Example for n = 5:

A
BB
CCC
DDDD
EEEEE

Approach:
- Use nested loops
- Outer loop controls rows
- Inner loop prints the same character multiple times
- Character increases with each row starting from 'A'

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern16(int n) {

        for(int i = 0; i < n; i++) {

            for(char j = 0; j <= i; j++) {

                System.out.print((char)('A' + i));
            }

            System.out.println();
        }
    }
}

public class Pattern_16 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern16(5);
    }
}
