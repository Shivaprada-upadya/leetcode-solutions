// Problem: Score Of a String
// Link:https://leetcode.com/problems/score-of-a-string/
// Date: 2025-06-28
// Approach: Sum the difference between all the adjacent characters by just taking the absolute difference of their ASCII values.


class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int sum=0;
        for(int i=1;i<n;i++){
            sum+=Math.abs(s.charAt(i)-s.charAt(i-1));
        }
        return sum;
    }
}