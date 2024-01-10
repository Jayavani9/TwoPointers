680. Valid Palindrome II

Given a string s, return true if the s can be palindrome after deleting at most one character from it.

 
Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false

//Solution using 2 pointers
class Solution {
    public boolean validPalindrome(String s) {
        //Tc: O(N) Sc: O(1)
        int left = 0;
        int right = s.length()-1;

        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return (checkIsPalin(s, left+1, right) || 
                checkIsPalin(s, left, right-1));
            }

            left++;
            right --;
        }
        return true;
    }

    public boolean checkIsPalin(String s, int start, int end)
    {
        while(start < end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

