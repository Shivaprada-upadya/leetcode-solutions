// approach : maths
class Solution {
    public int SumOfSquare(int num)
    {
        int sum=0;
        int temp=num;
        while(temp>0)
        {
            int ld=temp%10;
            int sq=ld*ld;
            sum=sum+sq;
            temp=temp/10;           
        }
        return sum;

    }
    
    public boolean isHappy(int n) {
        int num=n;
        while(num!=1 && num!=4)
        {
            num=SumOfSquare(num);          
        }
        if(num==1)
            return true;
        else
            return false;
    
    }
}