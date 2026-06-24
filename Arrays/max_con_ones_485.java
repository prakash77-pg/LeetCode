// Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

// Example 1:

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.




class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int i=0;
       int result=0;
       int cnt=0;
        while(i<nums.length){
            if(nums[i]==1){
                cnt++;
                int j=i+1;
                while(j<nums.length && nums[j]==1){
                    cnt++;
                    j++;
                }
                result=result>cnt? result:cnt;
                cnt=0;
                i=j;
            }
            i++;
        }
          return result;
    }
}