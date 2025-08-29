class Solution {

        public boolean calculation(String str)
        {
            int left=0;
            int right=str.length()-1;
            while(left<right)
            {
                if(str.charAt(left)==str.charAt(right))
                {
                    left++;
                    right--;
                }
                else
                {
                    return false; 
                }
            }
            return true;

        }
         

    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            if(calculation(words[i]))
            {
                return words[i];
            }
        }

        return "";
        
    }
}