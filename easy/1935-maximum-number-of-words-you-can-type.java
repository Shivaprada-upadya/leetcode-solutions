class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arrStr[]=text.split(" ");
        int len=arrStr.length;
        int ans=len;
        int left;
        int right=brokenLetters.length();
        for(int i=0;i<len;i++)
        {
            left=0;
            while(left<right)
            {
                //if(arrStr[i].contains(String.valueOf(brokenLetters.charAt(left))))
                if(arrStr[i].indexOf(brokenLetters.charAt(left))!= -1)
                {
                    ans--;
                    break;
                }
                left++;
            }
        }
        return ans;
    }
}