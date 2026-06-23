// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    //  boolean[] num = new boolean[1001];
    //  int size = nums1.length>nums2.length ? nums2.length:nums1.length;
    //  int index=0;
    //  int[] res=new int[size];
    //  for(int n: nums1)
    //  {
    //     num[n] =true;
    //  }
    //  for(int n : nums2)
    //  {
    //     if(num[n])
    //     {
    //          res[index++] =n;
    //     num[n]=false;
    //     }
    //  }
    //  int[] result =new int[index];
    //  //int k=0;
    //  for(int i=0;i<index;i++)
    //  {
    //     result[i] =res[i];
    //  }
    //  return result;
    int index=0;
     int size = nums1.length>nums2.length ? nums2.length:nums1.length;
    int[] arr =new int[size];

    Set<Integer> set1 =new HashSet<>();
    Set<Integer> set2 =new HashSet<>();
    for(int i: nums1) set1.add(i);
    for(int i: nums2) set2.add(i);
    for(int i: set1) {
            if( set2.contains(i))
                 arr[index++]=i;

    }
    int[] res =new int[index];
    for(int i=0;i<index;i++) {
        res[i]=arr[i];
    }

    return res;

    }
}