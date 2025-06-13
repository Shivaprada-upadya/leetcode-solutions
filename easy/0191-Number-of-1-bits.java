// Problem: Number of 1 Bits
// Link: https://leetcode.com/problems/number-of-1-bits/
// Date: 2024-12-18
// Approach: Use a stack to match opening and closing brackets; return false on mismatch or imbalance.


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