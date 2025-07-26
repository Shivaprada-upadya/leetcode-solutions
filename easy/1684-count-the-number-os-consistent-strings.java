class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        Set<Character> set=new HashSet<>();
        for(char ch: allowed.toCharArray())
        {
            set.add(ch);
        }

        for(String word:words)
        {
            boolean isConsistent=true;
            for(char cword:word.toCharArray())
            {
                if(!set.contains(cword))
                {
                    isConsistent=false;
                    break;
                }
            }
            if(isConsistent)
            {
                count++;
            }
        }
        return count;

    /*   int count=0;
       for(String word:words)
       {
        boolean isConsistent=true;

        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(allowed.indexOf(ch)==-1)
            {
                isConsistent=false;
                break;
            }
        }
        if(isConsistent)
        {
            count++;
        }
       }
        return count;
    */
    }
}