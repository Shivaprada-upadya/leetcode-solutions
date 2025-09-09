class Solution {
    public String interpret(String command) {
        int len=command.length();
        String ans="";
        for(int i=0;i<len;)
        {
            if(command.charAt(i)=='G')
            {
                ans=ans+"G";
                i++;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')')
            {
                ans=ans+'o';
                i=i+2;
            }
            else
            {
                ans=ans+"al";
                i=i+4;
            }
            
        }
        return ans;
    }
}