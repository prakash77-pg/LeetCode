// Given an array nums of integers, 
// return how many of them contain an even number of digit



class Solution {
    public int findNumbers(int[] nums) {
  
    //    int  digits_2 =0;
    //     for(int i : nums)
    //     {
    //         String count =Integer.toString(i);
    //         if(count.length() %2 == 0 ) digits_2++;

    //     }
    //     return digits_2;
        int cnt=0;
        for(int n:nums){
            if(((int)Math.log10(n))%2!=0) cnt++;
        }
    return cnt;
    }
}