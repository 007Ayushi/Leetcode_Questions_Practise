public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int i=0,j=31;
        while(i<j)
        {
            int iMask=(1<<i),jMask=(1<<j);
            boolean iOn=((iMask&n) != 0),jOn=((jMask&n) != 0);
            if(iOn!=jOn)
            {
                n^=iMask;
                n^=jMask;
            }
            i++;j--;
        }
        return n;  
    }
}