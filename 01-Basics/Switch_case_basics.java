// Problem: Week Day using Switch Case
// Language: Java

/*
Problem Statement:
Given an integer day denoting the day number, print the corresponding
day of the week.

- Week starts from Monday
- For values less than 1 or greater than 7, print "Invalid"

Approach:
- Use switch-case statements
- Match each number with its corresponding weekday

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Solution {

    public void whichWeekDay(int day) {

        switch(day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}

public class Switch_case_basics {

    public static void main(String[] args) {

        Solution obj = new Solution();

        obj.whichWeekDay(4);
    }
}
