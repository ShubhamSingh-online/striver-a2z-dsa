// Problem: GCD of Two Numbers
// Topic: Basic Maths
// File: GCD_of_Two_Numbers_09.java
// Language: Java

/*
Problem Statement:
Given two integers n1 and n2, find the
Greatest Common Divisor (GCD) of the numbers.

The GCD of two integers is the largest
positive integer that divides both numbers.

Approach:
- Use the Euclidean Algorithm
- Find the remainder of n1 divided by n2
- Replace n1 with n2
- Replace n2 with the remainder
- Continue until n2 becomes 0
- n1 will then contain the GCD

Time Complexity: O(log(min(n1, n2)))
Space Complexity: O(1)
*/

class Solution {

    public int GCD(int n1, int n2) {

        n1 = Math.abs(n1);
        n2 = Math.abs(n2);

        while(n2 != 0) {

            int remainder = n1 % n2;

            n1 = n2;
            n2 = remainder;
        }

        return n1;
    }
}

public class GCD_of_Two_Numbers_09 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int result = obj.GCD(36, 24);

        System.out.println("GCD = " + result);
    }
}
