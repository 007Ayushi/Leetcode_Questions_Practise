class Solution {
    public int countWords(String[] words1, String[] words2) {
        
        int ans=0;
        int cnt=0;
        for(int i=0;i<words1.length;i++){
            String str=words1[i];
            cnt=0;
            
            int cnt1=0;
            for(int k=0;k<words1.length;k++){
                if(words1[k].equals(str)){
                    cnt1++;
                }
            }
            if(cnt1==1){
                for(int j=0;j<words2.length;j++){
                 if(words2[j].equals(str)){
                    cnt++;
                 }
            }
            if(cnt==1){
                ans++;
            }
        }

            }

            
        return ans;

    }
}