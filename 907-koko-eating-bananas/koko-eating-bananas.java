class Solution {
    public int minEatingSpeed(int[] piles, int h) {

     //Binary Search
     int mx=Integer.MIN_VALUE;

     for(int i=0;i<piles.length;i++){
        mx=Integer.max(mx,piles[i]);
     }

     int lo=1;
     int hi=mx;

     int ans=1;
     while(lo<=hi){

        int mid=lo+(hi-lo)/2;

        int k=0;
        for(int i=0;i<piles.length;i++){
            k+=Math.ceil((double)piles[i]/mid);
        }

        if(k<=h){
            ans=mid;
            hi=mid-1;
        }
        else{
            lo=mid+1;
        }
        
     }
     return ans;

    }
}