class Solution {
    public String frequencySort(String s) {
        
    char []ch=s.toCharArray();
    StringBuilder sb=new StringBuilder();
    HashMap<Character,Integer> mp=new HashMap<>();
      for(int i=0;i<ch.length;i++){
        
        if(mp.containsKey(ch[i])){
            int freq=mp.get(ch[i]);
            mp.put(ch[i],freq+1);
        }
        else{
            mp.put(ch[i],1);
        }
      }


    while(mp.size()!=0){
        char mxchar=' ';
        int maxFreq=Integer.MIN_VALUE;

        for(char ele:mp.keySet()){
            if(mp.get(ele)>maxFreq){
                maxFreq=mp.get(ele);
                mxchar=ele;
            }
        }
        for(int i=0;i<maxFreq;i++){
            sb.append(mxchar);
        }
        mp.remove(mxchar);
    }
    return sb.toString();


    }
}