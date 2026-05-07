// Problem: Sum of First 50 Numbers Ending with Digit d
// Language: Java

/*
Problem Statement:
Given a digit d (0 to 9), find the sum of the first
50 positive integers that end with digit d.

A number ends with digit d if its last digit is d.

Approach:
- Start from number 1
- Use a while loop until 50 valid numbers are found
- Check last digit using modulo operator (%)
- Add matching numbers to sum
- Return the final sum

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int whileLoop(int d) {

        int count = 0;
        int sum = 0;
        int num = 1;

        while(count < 50) {

            if(num % 10 == d) {

                sum = sum + num;
                count++;
            }

            num++;
        }

        return sum;
    }
}

public class While_Loop_basics {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int result = obj.whileLoop(5);

        System.out.println("Sum = " + result);
    }
}
