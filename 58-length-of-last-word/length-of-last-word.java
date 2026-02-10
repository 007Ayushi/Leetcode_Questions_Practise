class Solution {
    public int lengthOfLastWord(String s) {

        s=s.trim();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.print(sb);
        int cnt=0;

        for(int i=0;i<sb.length();i++){
            int ascii=(int)sb.charAt(i);
            
            if(ascii!=32){
                cnt++;
            }
             else if(ascii==32){
                break;
             }
        }
        return cnt;    
    }
}