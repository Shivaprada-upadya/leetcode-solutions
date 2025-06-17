// Problem: Left and Right Sum Differences
// Link: https://leetcode.com/problems/left-and-right-sum-differences/
// Date: 2025-06-016
// Approach: Brute force 


class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;       
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] answer = new int[n];
        // Calculate left sums
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        // Calculate right sums
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        // Calculate answer as absolute difference
        for (int i = 0; i < n; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
    }
}
