// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3




class Solution {
    public int majorityElement(int[] nums) {
    //   // Boyer--Moore algorithm
    //    int canditate =0; n
    //    int count =0;
    //    for(int num : nums){
    //     if(count==0){
    //         canditate=num;
    //     }
    //    if(canditate==num){
    //         count++;
    //     }
    //     else count--;
    //    }
    //   return canditate;
    // int cand =0;
    // int cnt=0;
    // for(int i : nums){
    //     if(cnt==0){
    //         cand=i;
    //     }
    //     if(cand==i) cnt++;
    //     else cnt--;
    // }
    //     return cand;
//     int canditate=0;
//     int count=0;
//     for(int i :nums){
//         if(count==0){
//             canditate=i;
//         }
//         if(canditate==i){
//             count++;
//         }
//         else count--;
//     }
//    return canditate;
    int canditate=0;
    int cnt=0;
    for(int n:nums){
        if(cnt==0){
            canditate=n;
            cnt++;
        }
        else if(n==canditate) cnt++;
        else cnt--;
    }
    return canditate;
    }
}