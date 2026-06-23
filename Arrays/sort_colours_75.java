// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]


class Solution {
    public void sortColors(int[] nums) {
       int zero_count=0;
       int one_count=0;
       int two_count=0;
       for(int i:nums){
        if(i==0) zero_count++;
        else if(i==1) one_count++;
        else two_count++;
       }
       for(int i=0;i<nums.length;i++){
        if(i+1<=zero_count) nums[i]=0;
        else if(i+1<=one_count+zero_count) nums[i]=1;
        else  nums[i]=2;
       }
    }
}