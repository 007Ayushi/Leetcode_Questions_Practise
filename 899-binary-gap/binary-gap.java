class Solution {
    public int binaryGap(int n) {
        
    StringBuilder sb=new StringBuilder();
    int maxD=0;
        while(n!=0){
            int r=n%2;
            sb.append(r);
            n=n/2;
        }
        sb.reverse();
        System.out.print(sb);

        int i=0,j=1;
        while(j<sb.length()){
           if(sb.charAt(j)=='1'){
                maxD=Math.max(maxD,j-i) ;
                 i=j;
                 j++;
            }
            else{
                j++;
            }
        }
        return maxD;
    }
}