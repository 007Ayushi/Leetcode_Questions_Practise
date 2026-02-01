class Solution {
    public int minimumCost(int[] nums) {
        
        int firstEle=Integer.MAX_VALUE;
        int secEle=Integer.MAX_VALUE;

        for(int i=1;i<nums.length;i++){

            if(firstEle>nums[i]){
                secEle=firstEle;
                firstEle=nums[i];
            }
            else if(nums[i]<secEle){
                secEle=nums[i];
            }
        }
        return firstEle+secEle+nums[0];



    }
}