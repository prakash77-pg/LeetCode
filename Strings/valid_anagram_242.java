// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true




class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) return false;
       Map<Character,Integer> map =new HashMap<>();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
      }
      for(int i=0;i<s.length();i++){
        char ch=t.charAt(i);
        if(map.containsKey(ch)){

        map.put(ch,map.getOrDefault(ch,0)-1);
         if(map.get(ch)==0) map.remove(ch);
        }
        else return false;
      }
    
        return true;
    }
}