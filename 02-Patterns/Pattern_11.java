// Problem: Pattern 11
// Topic: Patterns
// File: Pattern_11.java
// Language: Java

/*
Problem Statement:
Given an integer n, print the following pattern.

Example for n = 5:

1
01
101
0101
10101

Approach:
- Determine the starting number for each row:
    - Even row index -> start with 1
    - Odd row index -> start with 0
- Print alternating 1s and 0s
- Toggle value using:
      start = 1 - start

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern11(int n) {

        int start = 1;

        for(int i = 0; i < n; i++) {

            if(i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }

            for(int j = 0; j <= i; j++) {

                System.out.print(start);

                start = 1 - start;
            }

            System.out.println();
        }
    }
}

public class Pattern_11 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern11(5);
    }
}
