// Problem: 2413. Smallest Even Multiple 
// Link: https://leetcode.com/problems/smallest-even-multiple/
// Date: 2025-07-01
// Approach: Using simple if and modulus operator with condition

class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0)
        {    
            return n;
        }
        else
        {
            return n*2;
        }       
    }
}