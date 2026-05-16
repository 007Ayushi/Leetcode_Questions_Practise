class Solution {
    public int countWords(String[] words1, String[] words2) {
        
        HashMap<String,Integer> mp=new HashMap<>();
        int ans=0;
        for(int i=0;i<words1.length;i++){
            String ele=words1[i];
            if(mp.containsKey(ele)){
               int frq=mp.get(ele);
                mp.put(ele,frq+1);
            }
            else{
                mp.put(ele,1);
            } 
        }

        for(String val:mp.keySet()){
            System.out.println(val+" "+mp.get(val));

        }
        for(String ele:mp.keySet()){

           int frq_ele=mp.get(ele);
            if(frq_ele==1){
            int frq2=0;
            for(int j=0;j<words2.length;j++){
                if(ele.equals(words2[j])){
                    frq2++;
                }
            }
            if(frq2==1 && frq_ele==1){
                ans++;
            }
        }

        }
      
        return ans;
    }
}