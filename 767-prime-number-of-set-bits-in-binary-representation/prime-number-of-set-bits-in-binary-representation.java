class Solution {
    public int countPrimeSetBits(int left, int right) {
        
        StringBuilder sb=new StringBuilder();
        int cnt=0;
        for(int i=left;i<=right;i++){
           int ones=countBits(i);
            if(isPrime(ones)){
            cnt++;
            }
        }
        return cnt;

    }
    public int countBits(int n){
        int count=0;
        while(n>0){
            count+=n&1;
            n=n>>1;
        }
        return count;
    }
    public boolean isPrime(int n){
        return n==2 || n==3 || n==5 || n==7 || n==11 || n==13 || n==17 || n==19;
    }
        
}