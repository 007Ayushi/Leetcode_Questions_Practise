class Solution {
    public double myPow(double x, int n) {
        if(n==0)return 1; 
    
        //if power(n) is negative then
        if(n<0){
        x=1/x;
        n=-n;
        }

        return pow(x,n);
    }
    public double pow(double x,int n){
        if(n==0)return 1;
        double ans=pow(x,n/2);
        if(n%2==0)return ans*ans;
        else return ans*ans*x;
    }
}