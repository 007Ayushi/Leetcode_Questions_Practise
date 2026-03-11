class Solution {
    public int bitwiseComplement(int n) {
        
        if(n==0)return 1;
        String ans="";
        while(n!=0){
            int rem=n%2;
            ans=rem+ans;
            n=n/2;
        }

        
        String complement="";
        int i=0;
        while(i<ans.length()){
            if(ans.charAt(i)=='0'){
                complement+='1';
            }
            else{
                complement+='0';
            }
            i++;
        }

         System.out.print(complement);

        int res=0;
        int power=0;
         for(int j=complement.length()-1;j>=0;j--){
            res += (complement.charAt(j)-'0')*Math.pow(2,power);
            power++;
         }
        return  res;
    }
}