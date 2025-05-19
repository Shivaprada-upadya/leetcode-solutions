// Problem: Palindrome Number
// Link: https://leetcode.com/problems/palindrome-number/
// Date: 2024-12-19
// Approach: Reverses the number and compares it to the original to check for a palindrome.

class Solution {
    public int maxArea(int[] height) {
        //Arrays.sort(height);
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right)
        {
            int area=Math.min(height[left],height[right])*(right-left);

            maxarea=Math.max(maxarea,area);
           if(height[left]<height[right])
           {
            left++;
           }
           else
           {
            right--;
           }

        }
     return maxarea;
        
    }
}