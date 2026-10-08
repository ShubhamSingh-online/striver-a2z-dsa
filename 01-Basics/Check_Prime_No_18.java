// Problem: Check if a Number is Prime or Not
// Topic: Basic Maths
// File: Check_Prime_No_18.java
// Language: Java

/*
Problem Statement:
Given an integer num, return true if it is
prime, otherwise return false.

A prime number is a number that is divisible
only by 1 and itself.

Approach:
- If num is less than 2, it is not prime
- Check divisibility from 2 up to √num
- If num is divisible by any number:
    - return false
- If no divisor is found:
    - return true

The condition:
    i <= num / i

is equivalent to:
    i * i <= num

but avoids multiplication overflow.

Time Complexity: O(√n)
Space Complexity: O(1)
*/

class Solution {

    public boolean checkPrime(int num) {

        if(num < 2) {

            return false;
        }

        for(int i = 2; i <= num / i; i++) {

            if(num % i == 0) {

                return false;
            }
        }

        return true;
    }
}

public class Check_Prime_No_18 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        boolean result = obj.checkPrime(13);

        System.out.println("Is Prime Number: " + result);
    }
}
