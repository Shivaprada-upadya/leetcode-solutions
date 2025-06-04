// Problem: Reverse Prefix of Word
// Link: https://leetcode.com/problems/reverse-prefix-of-word/
// Date: 2025-06-04
// Approach: Convert string to char array and reverse prefix using two pointers


class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word; // ch not found, return original word
        }

        char[] chars = word.toCharArray();
        int left = 0, right = index;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
}
