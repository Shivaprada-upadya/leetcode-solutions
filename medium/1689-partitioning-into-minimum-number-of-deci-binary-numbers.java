import java.util.Arrays;

class Solution {
    public int minPartitions(String n) {

        // converting string to character array[]
        char arr[]=n.toCharArray();
        //sort the character array[]
        Arrays.sort(arr);
        //accessing the last value of an array & type-casting
        int num=(int)arr[arr.length-1]-48;
        
        return num;    
    
    }
}