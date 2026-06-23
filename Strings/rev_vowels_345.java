// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

// Example 1:

// Input: s = "IceCreAm"

// Output: "AceCreIm"

// Explanation:

// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".




class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length - 1;

        while (left <= right) {

            if (!isVowel(c[left])) {
                left++;
                continue;
            }

            if (!isVowel(c[right])) {
                right--;
                continue;
            }

            char temp = c[right];
            c[right] = c[left];
            c[left] = temp;

            left++;
            right--;
        }

        return new String(c);
    }

    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}