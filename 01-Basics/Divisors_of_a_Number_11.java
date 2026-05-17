// Problem: Divisors of a Number
// Topic: Basic Maths
// File: Divisors_of_a_Number_11.java
// Language: Java

import java.util.ArrayList;
import java.util.Collections;

/*
Problem Statement:
Given an integer n, find all divisors of n
and return them in sorted order.

A divisor is a number that completely divides n.

Approach:
- Traverse from 1 to √n
- If i divides n:
    - add i
    - add n / i if both are different
- Sort the list
- Convert ArrayList to array
- Return the final array

Time Complexity: O(√n log √n)
Space Complexity: O(√n)
*/

class Solution {

    public int[] divisors(int n) {

        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 1; i * i <= n; i++) {

            if(n % i == 0) {

                al.add(i);

                if(i != n / i) {

                    al.add(n / i);
                }
            }
        }

        Collections.sort(al);

        int[] result = new int[al.size()];

        for(int i = 0; i < al.size(); i++) {

            result[i] = al.get(i);
        }

        return result;
    }
}

public class Divisors_of_a_Number_11 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] result = obj.divisors(36);

        System.out.print("Divisors: ");

        for(int num : result) {

            System.out.print(num + " ");
        }
    }
}
