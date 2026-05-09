// Problem: Pattern 10
// Language: Java

/*
Problem Statement:
Given an integer n, print the following pattern.

Example for n = 5:

*
**
***
****
*****
****
***
**
*

Approach:
- Use a single loop from 1 to (2 * n - 1)
- Increase stars until n
- Decrease stars after reaching n
- Print stars in each row accordingly

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void pattern10(int n) {

        for(int i = 1; i <= 2 * n - 1; i++) {

            int stars = i;

            if(i > n) {
                stars = 2 * n - i;
            }

            for(int j = 1; j <= stars; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}

public class Pattern_10 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.pattern10(5);
    }
}
