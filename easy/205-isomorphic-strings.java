import java.util.Arrays;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        
        Map<Character,Character> map=new HashMap<>();
        int len=s.length();

        for(int i=0;i<len;i++)
        {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(map.containsKey(ch1))
            {
                if(map.get(ch1)!=ch2)
                    return false;
            }
            else if(map.containsValue(ch2))
                    return false;    

            map.put(ch1,ch2);
        }
        return true;
    }
}