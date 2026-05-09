// Problem: Pattern 12
// Language: Java

/*
Problem Statement:
Given an integer n, print the following pattern.

Example for n = 5:

1        1
12      21
123    321
1234  4321
1234554321

Approach:
- Print increasing numbers from 1 to i
- Print spaces between the number sequences
- Print decreasing numbers from i to 1
- Repeat for all rows

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern12(int n) {

        for(int i = 1; i <= n; i++) {

            // Increasing numbers
            for(int j = 1; j <= i; j++) {

                System.out.print(j);
            }

            // Spaces
            for(int j = 1; j <= 2 * n - 2 * i; j++) {

                System.out.print(" ");
            }

            // Decreasing numbers
            for(int j = i; j >= 1; j--) {

                System.out.print(j);
            }

            System.out.println();
        }
    }
}

public class Pattern_12 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern12(5);
    }
}
