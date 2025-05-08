// Problem: Roman to Integer
// Link: https://leetcode.com/problems/roman-to-integer/
// Date: 2025-04-10
// Approach: Traverse the string from right to left; add the current value if it's >= previous, else subtract it.

class Solution {
    public int romanToInt(String s) {
       Map<Character,Integer> map=new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);
       int total=0;
       int prevValue=0;

       for(int i=s.length()-1;i>=0;i--)
       {
        int curr=map.get(s.charAt(i));

        if(curr<prevValue)
        {
            total-=curr;
        }

        else
        {
            total+=curr;
        }

        prevValue=curr;
       }
       
       return total;
    }
}