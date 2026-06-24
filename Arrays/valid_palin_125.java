// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome



class Solution {
    public boolean isPalindrome(String s) {

       boolean result=isPalindrome(s,0,s.length()-1);
       return result;

        
    }

    static boolean isPalindrome(String s, int start, int end) {

       
        if (start >= end) {
            return true;
        }

        char left = Character.toLowerCase(s.charAt(start));
        char right = Character.toLowerCase(s.charAt(end));

       
        if (!Character.isLetterOrDigit(left)) {
            return isPalindrome(s, start + 1, end);
        }

        if (!Character.isLetterOrDigit(right)) {
            return isPalindrome(s, start, end - 1);
        }

       
        if (left != right) {
            return false;
        }

       
        return isPalindrome(s, start + 1, end - 1);
    }
}