class Solution {
    public boolean isAnagram(String s, String t) {

    //base case
    if(s.length()!=t.length())return false;
     char []ch=s.toCharArray();
     char []ch1=t.toCharArray();

     Arrays.sort(ch);
     Arrays.sort(ch1);

     HashMap<Character,Integer> mp=new HashMap<>();
     for(int i=0;i<ch.length;i++){
        char ele=ch[i];
        if(mp.containsKey(ele)){
            int frq=mp.get(ele);
            mp.put(ele,frq+1);
        }
        else{
            mp.put(ele,1);
        }
     }   

     for(int i=0;i<ch1.length;i++){
        if(mp.containsKey(ch1[i])){
            int frq=mp.get(ch1[i]);
            mp.put(ch1[i],frq-1);
        }
     }

     for(char ele:mp.keySet()){
        if(mp.get(ele)!=0){
            return false;
        }
     }
     return true;





    }
}