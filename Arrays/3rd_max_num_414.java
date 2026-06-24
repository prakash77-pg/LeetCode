// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

 

// Example 1:

// Input: nums = [3,2,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2.
// The third distinct maximum is 1.



class Solution {
    public int thirdMax(int[] nums) {
        long max1=Long.MIN_VALUE;
        long max2=Long.MIN_VALUE;
        long max3=Long.MIN_VALUE;
        for(long n : nums){
            if(n>max1){
                max3=max2;
                max2=max1;
                max1=n;
            }
            else if(n>max2 && n!=max1){
                max3=max2;
                max2=n;
            }
            else if(n>max3 && n!=max2 && n!=max1) max3=n;
        }
        return max3==Long.MIN_VALUE? (int)max1:(int)max3;
    }
    }
