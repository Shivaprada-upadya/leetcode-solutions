class Solution {
    public int earliestTime(int[][] tasks) {
        int min=Integer.MAX_VALUE;
        int len=tasks.length;
        for(int i=0;i<len;i++)
        {              
            int sum=tasks[i][0]+tasks[i][1] ;    
            if(sum<min)
                min=sum;         
        }
        return min;       
    }
}