// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.

 

// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]


class Solution {
    public void reverseString(char[] s) {
    
    StrRev(s,0,s.length-1);
    
        }
     static void StrRev(char[] s,int start,int end){
        if(start >= end){
            return;
        }
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        StrRev(s,start+1,end-1);
          
     }

    
} 
