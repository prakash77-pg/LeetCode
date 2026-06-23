// Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.

// In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
// Note that 0 is neither positive nor negative.

 

// Example 1:

// Input: nums = [-2,-1,-1,1,2,3]
// Output: 3
// Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3





class Solution {
    public int maximumCount(int[] nums) {
        int a=0;
        int b=0;
        for(int n : nums){
            if(n>0) a++;
            else {
                if(n<0) b++;
            }
        }
        return a>b ? a:b;
    }
}

