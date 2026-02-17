class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        //Created a frequency array of size 128
        char []frq=new char[128];//default value of char is '\0'

        for(int i=0;i<s.length();i++){
            char st=s.charAt(i);
            char tt=t.charAt(i);

            int idx=(int)st;
            if(frq[idx]=='\0'){
                frq[idx]=tt;
            }
            else{
                if(frq[idx]!=tt){
                    return false;
                }
            }
        }

        //important for test case like s=badc and t=baba
        for(int i=0;i<128;i++){
            frq[i]='\0';
        }

        for(int i=0;i<t.length();i++){
            char st=s.charAt(i);
            char tt=t.charAt(i);

            int idx=(int)tt;
            if(frq[idx]=='\0'){
                frq[idx]=st;
            }
            else{
                if(frq[idx]!=st){
                    return false;
                }
            }
        }

        return true;



    }
}