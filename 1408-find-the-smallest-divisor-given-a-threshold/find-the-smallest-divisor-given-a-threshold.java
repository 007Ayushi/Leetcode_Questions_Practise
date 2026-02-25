class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int lo=1;
        int hi=max;
        int ans=0;
        int smallest_divisor=0;
        while(lo<=hi){

            int mid=lo+(hi-lo)/2;
            smallest_divisor=0;
            for(int i=0;i<nums.length;i++){
                smallest_divisor+=Math.ceil((double)nums[i]/mid);
            }

            if(smallest_divisor<=threshold){
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