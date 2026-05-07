// Problem: Pattern 3
// Language: Java

/*
Problem Statement:
Given an integer n, print the following pattern.

Example for n = 5:

1
12
123
1234
12345

Approach:
- Use two nested loops
- Outer loop controls rows
- Inner loop prints numbers from 1 to current row
- Print a new line after every row

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern3(int n) {

        for(int i = 0; i < n; i++) {

            for(int j = 0; j <= i; j++) {

                System.out.print(j + 1);
            }

            System.out.println();
        }
    }
}

public class Pattern_3 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern3(5);
    }
}
