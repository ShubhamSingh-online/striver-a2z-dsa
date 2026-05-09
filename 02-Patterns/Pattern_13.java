// Problem: Pattern 13
// Language: Java

/*
Problem Statement:
Given an integer n, print the following pattern.

Example for n = 5:

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

Approach:
- Initialize a variable num = 1
- Use nested loops
- Print current value of num
- Increment num after every print
- Number of elements in each row equals the row number

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern13(int n) {

        int num = 1;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {

                System.out.print(num + " ");

                num = num + 1;
            }

            System.out.println();
        }
    }
}

public class Pattern_13 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern13(5);
    }
}
