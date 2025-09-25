class Solution {
    public String toLowerCase(String s) {
        char arr[]=s.toCharArray();
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            if(Character.isUpperCase(arr[i]))
                arr[i]=Character.toLowerCase(arr[i]);
        }
        return new String(arr);
        
    }
}