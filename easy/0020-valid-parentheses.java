// Problem: Valid Parentheses
// Link: https://leetcode.com/valid-parentheses/
// Date: 2024-12-18
// Approach: Use a stack to match opening and closing brackets; return false on mismatch or imbalance.

class Solution 
{
    public boolean isValid(String s) 
    {   Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }

                char top=stack.pop();

                if((c=='}' && top!='{') ||
                   (c==')' && top!='(') ||
                   (c==']' && top!='['))
                   {
                        return false;
                   } 
            }
                   
        }

        return stack.isEmpty();
    }
}