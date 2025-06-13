// Problem: Number of 1 Bits
// Link: https://leetcode.com/problems/number-of-1-bits/
// Date: 2025-06-13
// Approach: using bitwise operator

class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n>0)
        {
            count+=n&1;
            n=n>>>1;
        }
        return count;        
    }
}