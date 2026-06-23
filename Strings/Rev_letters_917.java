// Given a string s, reverse the string according to the following rules:

// All the characters that are not English letters remain in the same position.
// All the English letters (lowercase or uppercase) should be reversed.
// Return s after reversing it.

 

// Example 1:

// Input: s = "ab-cd"
// Output: "dc-ba"


class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0,j=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(i<j){
            if(!Character.isLetter(sb.charAt(i))){
                 i++;
                 continue;
            }
            if(!Character.isLetter(sb.charAt(j))){
                  j--;
                 continue;
            }
            char  temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        return new String(sb);

    }
}