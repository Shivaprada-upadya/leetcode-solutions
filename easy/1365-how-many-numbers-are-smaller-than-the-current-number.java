// Problem:  How Many Numbers Are Smaller Than the Current Number
// Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
// Date: 2025-07-10
// Approach: using Brute Force Method

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j!=i && nums[j]<nums[i])
                {                 
                    ++ans[i];
                }
            }
        }
        return ans;
    }
}