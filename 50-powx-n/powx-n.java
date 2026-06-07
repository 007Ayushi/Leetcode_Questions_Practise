class Solution {
    public double myPow(double x, int n) {
        
        if(n<0){
            x=1/x;
            n=-n;
        }
      return   Power(x,n);
    }

    public double Power(double x, int n){

        if(n==0)return 1;
        double ans=Power(x,n/2);
        if(n%2==0)return ans*ans;
        else return ans*ans*x;

    }
}