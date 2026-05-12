// Problem: Pattern 22
// Last basic pattern question
// Language: Java

/*
Problem Statement:
Given an integer n, print the following concentric square pattern.

Example for n = 5:

5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5

Approach:
- Traverse through a (2*n - 1) x (2*n - 1) matrix
- For every position:
    - Find minimum distance from:
        top, bottom, left, and right boundaries
- Subtract minimum distance from n
- Print the resulting value

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern22(int n) {

        for(int i = 0; i < 2 * n - 1; i++) {

            for(int j = 0; j < 2 * n - 1; j++) {

                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int down = (2 * n - 2) - i;

                System.out.print(
                    n - Math.min(
                            Math.min(top, down),
                            Math.min(left, right)
                        )
                );
            }

            System.out.println();
        }
    }
}

public class Pattern_22 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern22(5);
    }
}
