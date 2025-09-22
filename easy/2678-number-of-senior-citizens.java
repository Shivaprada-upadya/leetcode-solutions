class Solution {
    public int countSeniors(String[] details) {
        int len=details.length;
        int ans;
        int count=0;
        for(int i=0;i<len;i++)
        {
            String sub1=details[i].substring(11,13);
            ans=Integer.parseInt(sub1);
            if(ans>60)
                count++;
        }
        return count;
    }
}