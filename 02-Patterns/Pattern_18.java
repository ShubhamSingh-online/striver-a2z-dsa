// Problem: Pattern 18
// Language: Java

/*
Problem Statement:
Given an integer n, print the following pattern.

Example for n = 5:

E
D E
C D E
B C D E
A B C D E

Approach:
- Use nested loops
- Start printing characters from:
      'A' + n - i - 1
- Continue printing until the last character
- Move to the next line after each row

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern18(int n) {

        for(int i = 0; i < n; i++) {

            for(char j = (char)('A' + n - i - 1); j <= 'A' + n - 1; j++) {

                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

public class Pattern_18 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern18(5);
    }
}
