class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        int len1=s.length();
        for(int i=0;i<len1;i++)
        {
            String s1=""+s.charAt(i);
            int index2=t.indexOf(s1);
            sum=sum+Math.abs(i - index2);

        }
        return sum;
    }
}