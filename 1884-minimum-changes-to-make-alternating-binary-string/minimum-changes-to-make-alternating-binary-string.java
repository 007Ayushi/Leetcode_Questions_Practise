class Solution {
    public int minOperations(String s) {
        
        int cnt1=0;
        int cnt2=0;
        //Pattern 1 -> 01011 (even=0 and odd=1)
        for(int i=0;i<s.length();i++){
            char expectedEle=(i%2==0)?'0':'1';
            if( s.charAt(i)!=expectedEle){
                cnt1++;
            }
        }

        //Pattern 2 -> 101010 (even ==1 and odd == 0)
        for(int i=0;i<s.length();i++){
            char expectedEle=(i%2==0) ? '1' : '0';
            if(s.charAt(i)!=expectedEle){
                cnt2++;
            }
        }
        return Math.min(cnt1,cnt2);
    }
}

