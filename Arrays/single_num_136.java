// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

 

// Example 1:

// Input: nums = [2,2,1]

// Output: 1



class Solution {
    public int singleNumber(int[] nums) {
   /*
   // this my brute force code //
   int j=0,k=0,count=0;
      for(int i=0;i<nums.length;i++){
          k=nums[j] ;
           for(int l=0;l<nums.length;l++){
            if(k==nums[l]) count++;
              }
              if( count ==1) break;
     
     j++; count=0;
     
     
      }
         return k;
         */
        //  int k=0;
        //  for(int n: nums)
        //  {
        //     k ^=n;
        //  }
        //  return k;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0) +1);
        }
        for(int i : map.keySet()){
            if(map.get(i)==1) return i;
        }
        return -1;
    }
}