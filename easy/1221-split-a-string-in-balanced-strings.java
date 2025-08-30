class Solution {
    public int balancedStringSplit(String s) {
        int balance=0;
        int answer=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if('L'==ch)
                balance++;
            else
                balance--;
            if(balance==0)
                answer++;         
            
        }
        return answer;
    }
}