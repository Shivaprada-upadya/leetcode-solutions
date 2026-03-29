class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
            int diff = arr[1] - arr[0];
        
        int len = arr.length;
        for(int i=2;i<len;i++)
        {
            if(arr[i] - arr[i-1] != diff)
                return false;
        }
        return true;
        
    }
}