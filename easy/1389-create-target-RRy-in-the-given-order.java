// Problem:  Create Target Array in the Given Order
// Link: https://leetcode.com/problems/create-target-array-in-the-given-order/
// Date: 2025-06-14
// Approach: using bitwise operator

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int ans[]=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<list.size();i++)
        {
            ans[i]=list.get(i);
        }

        return ans;
    }
}