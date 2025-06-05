// Problem: Transform the Array by Sorting and Counting Evens/Odds  
//link: https://leetcode.com/problems/transform-array-by-parity/
// Date: 2025-06-02  
// Approach: Sort the array. Count number of even and odd numbers.  
// Then, overwrite the array with 0s for evens and 1s for odds, maintaining counts only, not original values.

class Solution {
    public int[] transformArray(int[] nums) {
        // Sorting the array
        Arrays.sort(nums);

        // Count the number of odd and even numbers
        int odd = 0;
        int even = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Fill the first 'even' elements with 0
        int i;
        for (i = 0; i < even; i++) {
            nums[i] = 0;
        }
        

        // Fill the rest with 1
        for (int j = i; j < nums.length; j++) {
            nums[j] = 1;
        }

        return nums;
    }
}
