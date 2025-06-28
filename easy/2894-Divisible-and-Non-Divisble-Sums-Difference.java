// Problem: Divisible and Non-divisible Sums Difference
// Link: https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
// Date: 2025-06-29
// Approach: Using totalSum=(n*(n+1)/2) formula

class Solution {
    public int differenceOfSums(int n, int m) {
        int divSum=0;
        int noDivSum=0;
        int tSum=n*(n+1)/2;
        if(n<m)
        {
            return tSum;
        } 

        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                divSum+=i;
            }
            else
            {
                noDivSum+=i;
            }
        }
        
        return (noDivSum-divSum);
    }
}