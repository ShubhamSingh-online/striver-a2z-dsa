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
- Use Euclidean Algorithm
- Repeatedly replace:
    - larger number with remainder
- Continue until one number becomes 0
- The other number becomes the GCD

Time Complexity: O(log(min(n1, n2)))
Space Complexity: O(1)
*/

class Solution {

    public int GCD(int n1, int n2) {

        while(n1 != 0 && n2 != 0) {

            if(n1 > n2) {

                n1 = n1 % n2;

            } else {

                n2 = n2 % n1;
            }
        }

        if(n2 == 0) {

            return n1;

        } else {

            return n2;
        }
    }
}

public class GCD_of_Two_Numbers_09 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int result = obj.GCD(36, 24);

        System.out.println("GCD = " + result);
    }
}
