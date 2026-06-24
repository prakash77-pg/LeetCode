// Given an integer x, return true if x is a palindrome, and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left


class Solution {
    public boolean isPalindrome(int x) {
        /*  this is my brute force
        if(x<0) return false;
        String s=Integer.toString(x);
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
    
        return true;
        */
        if(x==0) return true;
        if(x<0 || x%10==0) return false;
        int rev=0;
        while(x>rev){
            rev=rev*10+(x%10);
            x/=10;
        }
        return x==rev || x==rev/10;
    }
}