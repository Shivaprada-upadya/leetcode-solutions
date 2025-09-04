class Solution {
    public int findClosest(int x, int y, int z) {
        int pos1=0;
        int pos2=0;
        if(x<z)
            pos1=z-x;
        else
            pos1=x-z;
        if(y<z)
            pos2=z-y;
        else
            pos2=y-z;
        if(pos1<pos2)
            return 1;
        else if(pos2<pos1)
        {
                return 2;
        }
        return 0;
    }
}