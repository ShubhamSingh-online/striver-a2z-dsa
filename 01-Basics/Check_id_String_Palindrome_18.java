// Problem: Check if String is Palindrome or Not
// Topic: Strings
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
- Use two pointers:
    - left starts from beginning
    - right starts from end
- Compare characters at both positions
- If characters differ:
    - return false
- Move pointers towards center
- If all characters match:
    - return true

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public boolean palindromeCheck(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {

            if(s.charAt(left) != s.charAt(right)) {

                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

public class Check_id_String_Palindrome_18 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        boolean result = obj.palindromeCheck("madam");

        System.out.println("Is Palindrome: " + result);
    }
}
