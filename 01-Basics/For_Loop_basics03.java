// Problem: Sum of Numbers using For Loop
// Language: Java

/*
Problem Statement:
Given two integers low and high, return the sum of all
integers from low to high inclusive.

Approach:
- Initialize sum as 0
- Traverse from low to high using a for loop
- Add each number to sum
- Return the final sum

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int forLoop(int low, int high) {

        int sum = 0;

        for(int i = low; i <= high; i++) {

            sum = sum + i;
        }

        return sum;
    }
}

public class For_Loop_basics03 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int result = obj.forLoop(1, 5);

        System.out.println("Sum = " + result);
    }
}
