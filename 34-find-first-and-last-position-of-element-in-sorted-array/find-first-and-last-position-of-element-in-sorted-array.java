class Solution {
    public int[] searchRange(int[] nums, int target) {
        //Binary Search 

        //First will calculate the starting position of a given value
        int start_idx=-1;
        int n=nums.length;
        int lo=0,hi=n-1;
        int end_idx=-1;

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;

            if(nums[mid]==target){
                start_idx=mid;
                hi=mid-1;
            }
            else if(nums[mid]>target){
                hi=mid-1;
            }
            else {
                lo=mid+1;
            }
        }

        if(start_idx==-1){
            return new int[]{-1,-1};
        }

        //Now,Calculating the end index
        lo=0;hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;

            if(nums[mid]==target){
                end_idx=mid;
                lo=mid+1;
            }
            else if(nums[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return new int []{start_idx,end_idx};
    }
}