// Problem: Two Sum
// Link: https://leetcode.com/problems/two-sum/
// Date: 2025-04-30
// Approach: HashMap to find complement of each element in the array.
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
           // Store the current number and its index in the map
            map.put(nums[i], i);
        }
        
        return new int[] {};  // If no solution found, return empty array
    }
}
