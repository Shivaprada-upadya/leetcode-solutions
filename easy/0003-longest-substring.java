// Problem: Longest Substring Without Repeating Characters

// Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Date: 2025-05-01
// Approach: HashMap to find complement of each element in the array.





class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        
        int maxLength = 0;
        int left = 0;

        // Expand the window by moving the right pointer
        for (int right = 0; right < s.length(); right++) {
            // If the character is already in the set, shrink the window from the left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set and update max length
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;

        
    }
}