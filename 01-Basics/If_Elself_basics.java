// Problem: Student Grade Calculator
// Language: Java

/*
Problem Statement:
Given marks of a student, print on the screen:

- Grade A if marks >= 90
- Grade B if marks >= 70
- Grade C if marks >= 50
- Grade D if marks >= 35
- Fail otherwise

Approach:
- Use if-else-if conditions
- Check marks range and print the corresponding grade

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Solution {

    public void studentGrade(int marks) {

        if(marks >= 90) {
            System.out.println("Grade A");

        } else if(70 <= marks && marks < 90) {
            System.out.println("Grade B");

        } else if(50 <= marks && marks < 70) {
            System.out.println("Grade C");

        } else if(35 <= marks && marks < 50) {
            System.out.println("Grade D");

        } else {
            System.out.println("Fail");
        }
    }
}

public class If_Elself_basics {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.studentGrade(78);
    }
}
