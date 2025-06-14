class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int result[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int temp=nums[i];
            nums[i]=nums[index[i]];
            nums[index[i]]=temp;
        }


        return nums;
    }
}