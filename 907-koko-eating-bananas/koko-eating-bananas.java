class Solution {
    public int minEatingSpeed(int[] piles, int h) {

    //TC-O(N) to find the max ele+ sum/mid and
    // * log(max) (binary search)

    //tc=O(n)*log(max ele)


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
            hi=mid-1;//Wants to minimize the k 
        }
        else{
            lo=mid+1;
        }
        
     }
     return lo;

    }
}