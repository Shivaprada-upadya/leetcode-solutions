// Problem: Count Pairs Whose Sum is Less than Target
// Link: https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/
// Date: 2025-09-04
// Approach: Find and return the two numbers that appear twice.

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int count[]=new int[n];
        int result[] =new int[2];
        int i=0;
        for(int num:nums)
        {
            count[num]++;

            if(count[num]==2)
            {
                result[i++]=num;
            }
        }

        return result;

    }
}
