class Solution {
    public int countPrimeSetBits(int left, int right) {
        
        int cnt=0;
        for(int i=left;i<=right;i++){
            String binaryNum=convertIntoBinary(i);
            int Ones=cntOnes(binaryNum);
            if(prime(Ones)){
                  cnt++;
            }
        }
        return cnt;
    }
    public String  convertIntoBinary(int num){
        StringBuilder sb=new StringBuilder();
        while(num!=0){
           int rem=num%2;
           sb.append(rem);
           num=num/2;
        }
        return sb.reverse().toString();
    }
    public int cntOnes(String binaryNum){
        int cnt=0;
        for(int i=0;i<binaryNum.length();i++){
            if(binaryNum.charAt(i)=='1'){
                cnt++;
            }
        }
        return cnt;
    }
    public boolean prime(int  n){

        return n==2 || n==3 || n==5 || n==7 || n==11 || n==13
        || n==17 || n==19; 
    }
}