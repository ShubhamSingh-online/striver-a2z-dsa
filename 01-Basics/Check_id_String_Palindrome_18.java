// Problem: Check if String is Palindrome or Not
// Topic: Recursion
// File: Check_id_String_Palindrome_18.java
// Language: Java

/*
Problem Statement:
Given a string s, check whether
the string is palindrome or not.

A palindrome string reads the same
forward and backward.

Example:
"madam" -> true
"hello" -> false

Approach:
- Use recursion with two pointers:
    - left starts from the beginning
    - right starts from the end
- Compare characters at both positions
- If characters are different:
    - return false
- Move left forward and right backward
- Continue until the pointers meet or cross
- If all characters match:
    - return true

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public boolean palindromeCheck(String s) {

        return checkPalindrome(s, 0, s.length() - 1);
    }

    private boolean checkPalindrome(String s, int left, int right) {

        // Base case
        if(left >= right) {

            return true;
        }

        // Characters do not match
        if(s.charAt(left) != s.charAt(right)) {

            return false;
        }

        // Recursive call
        return checkPalindrome(s, left + 1, right - 1);
    }
}

public class Check_id_String_Palindrome_18 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        boolean result = obj.palindromeCheck("madam");

        System.out.println("Is Palindrome: " + result);
    }
}
