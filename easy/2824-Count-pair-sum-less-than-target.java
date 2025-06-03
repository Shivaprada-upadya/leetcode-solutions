// Problem: Count Pairs Whose Sum is Less than Target
// Link: https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
// Date: 2025-06-04
// Approach: Using Brute-force method


class Solution {
    public int countPairs(List<Integer> nums, int target) {

        List<Integer> list =new ArrayList<Integer>(nums);

        int n=nums.size();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((list.get(i)+list.get(j))<target)
                {
                    ans++;
                }
            }
        }



        return ans;





        
    }
}