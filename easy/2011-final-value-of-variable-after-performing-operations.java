class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        for(String str: operations)
        {
            if(str.contains("--X") || str.contains("X--"))
                count--;
            else
                count++;
        }
        return count;

        
    }
}