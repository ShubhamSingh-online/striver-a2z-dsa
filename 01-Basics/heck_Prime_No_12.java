// Problem: Check for Prime Number
// Topic: Basic Maths
// File: Check_Prime_No_12.java
// Language: Java

/*
Problem Statement:
Given an integer n, check whether
the number is prime or not.

A prime number has exactly two divisors:
1 and the number itself.

Approach:
- If n <= 1, return false
- Traverse from 2 to n - 1
- If any number divides n completely:
    - return false
- Otherwise return true

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public boolean isPrime(int n) {

        if(n <= 1) {

            return false;
        }

        for(int i = 2; i < n; i++) {

            if(n % i == 0) {

                return false;
            }
        }

        return true;
    }
}

public class Check_Prime_No_12 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        boolean result = obj.isPrime(13);

        System.out.println("Is Prime Number: " + result);
    }
}
