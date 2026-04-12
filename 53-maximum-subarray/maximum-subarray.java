class Solution {
    public int maxSubArray(int[] nums) {

       //Base Case
       if(nums.length==1)return nums[0];
       int sum=0;
       int maxsum=Integer.MIN_VALUE;

       for(int i=0;i<nums.length;i++){

        sum+=nums[i];

        maxsum=Math.max(sum,maxsum);

        if(sum<0){
            sum=0;
        } 

       }
       return maxsum;



    }
}