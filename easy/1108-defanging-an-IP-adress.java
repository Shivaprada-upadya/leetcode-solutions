// Problem:  Defanging an IP Address
// Link: https://leetcode.com/problems/defanging-an-ip-address/
// Date: 2025-07-11
// Approach: Using StringBuilder append method

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            {
                sb.append("[.]");
            }
            else
            {
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();        
    }
}