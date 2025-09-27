class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int orderLen = order.length;
        ArrayList <Integer> list=new ArrayList();
        Set <Integer> set= new HashSet<Integer>();
        for(int i: friends)
            set.add(i);

        for(int i=0;i<orderLen;i++)
        {
            int ele=order[i];
            if(set.contains(ele))
            {
                list.add(ele);
            }
        }
         int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
            arr[i]=list.get(i);
        
                return arr;
    }
}