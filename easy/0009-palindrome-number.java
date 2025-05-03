// Problem: Palindrome Number
// Link: https://leetcode.com/problems/palindrome-number/
// Date: 2024-09-24
// Approach: Reverses the number and compares it to the original to check for a palindrome.
class Solution 
{
    public boolean isPalindrome(int x) 
    {
        if(x<0)
        {
            return false;
        }
       
        int num=x;
        int rem=0;
        int rev=0;
        while(x!=0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        
        return num==rev;

        
    }
    public static void main(String[] args)
    {
        int x=0;
        Solution s=new Solution();
        boolean result=s.isPalindrome(x);
        System.out.print(result);
    }
}