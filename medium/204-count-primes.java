// Problem: Count Primes
// Link: https://leetcode.com/problems/count-primes/
// Date: 2025-04-30
// Approach: Using a sieve method to count primes less than n.

class Solution {
    public int countPrimes(int n) {
        if (n <= 2)
            return 0;
        
        int count = 0;
        boolean flag = true;
        
        for (int i = 2; i < n; i++) {  // changed i <= n to i < n
            flag = true;
            
            for (int j = 2; j * j <= i; j++) {  // changed i/2 to sqrt(i)
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                count++;
            }
        }
        
        return count;
    }
}
