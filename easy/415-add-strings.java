// Problem: Add Strings
// Link: https://leetcode.com/problems/add-strings/
// Date: 2025-09-12
// Approach : carry method
class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1, j=num2.length()-1;

        String res="";
        int carry=0;

        while(i>=0 || j>=0)
        {
            int a=0, b=0;
            if(i>=0)
            {
                a=num1.charAt(i)-48;
                i--;
            }

            if(j>=0)
            {
                b=num2.charAt(j)-48;
                j--;
            }

            int temp=a+b+carry;
            res=(temp%10)+res;
            carry=temp/10;

        }

        if(carry>0)
        {
            res=carry+res;
        }
        return res;
    }
}