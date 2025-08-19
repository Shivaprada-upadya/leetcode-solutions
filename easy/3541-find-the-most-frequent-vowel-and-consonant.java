import java.util.HashMap;
class Solution 
{
    public int maxFreqSum(String s) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] charArray=s.toCharArray();
        for(char c:charArray)
        {
            
            if(map.containsKey(c))
            {
               map.put(c,map.get(c)+1);  
            }
            else
            {
                map.put(c,1);
            }
        }

        int countVowels=0;
        int countCons=0;
        
        for(char ch:map.keySet())
        {
            int freq=map.get(ch);
            if(isVowels(ch))
            {
                countVowels=Math.max(countVowels,freq);
            }
            else
            {
                countCons=Math.max(countCons,freq);
            }
        }
        return countVowels+countCons;
    }

    public boolean isVowels(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;
        return false;

    }
}