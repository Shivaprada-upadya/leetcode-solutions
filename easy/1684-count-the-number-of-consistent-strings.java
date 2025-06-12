class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans=0;
        for(int i=0;i<words.length();i++)
        {
            while(int j=0;j<words[i].length;j++)
            {
                if(words.charAt(i)==allowed.charAt(i))
                {
                    ans++;
                }            
            }
        }            
        return ans;       
    }
}