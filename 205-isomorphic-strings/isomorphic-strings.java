class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        //Create a frequency Array
        char []frq=new char[128];//By default the character is \0

        char []sarr=s.toCharArray();
        char []tarr=t.toCharArray();

        for(int i=0;i<sarr.length;i++){
            int idx=(int)sarr[i];

            if(frq[idx]=='\0'){
                frq[idx]=tarr[i];
            }
            else{
                if(frq[idx]!=tarr[i])return false;
            }
        }


        //Again fill the frequency array with \0 elements
        for(int i=0;i<frq.length;i++){
            frq[i]='\0';
        }

        for(int i=0;i<tarr.length;i++){
            int idx=(int)tarr[i];

            if(frq[idx]=='\0'){
                frq[idx]=sarr[i];
            }
            else{
                if(frq[idx]!=sarr[i])return false;
            }
        }

        return true;
    }
}