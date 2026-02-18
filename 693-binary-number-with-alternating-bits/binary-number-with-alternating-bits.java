class Solution {
    public boolean hasAlternatingBits(int n) {
        StringBuilder sb=new StringBuilder();
        boolean flag=true;

        while(n>0){
            sb.append(n&1);
            n=n>>1;
        }
        for(int i=0;i<sb.length()-1;i++){        
            if(sb.charAt(i)==sb.charAt(i+1)){
                flag=false;
            }
        }
        return flag;

      
    }
}