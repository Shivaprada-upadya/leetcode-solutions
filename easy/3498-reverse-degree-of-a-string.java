class Solution {
    public int reverseDegree(String s) {
        
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int ch=(i+1)* (97+26 - s.charAt(i));
            sum=sum+ch;
        }
        return sum;
        
    }
}