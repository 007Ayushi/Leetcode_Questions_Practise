class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

       //single loop tc=O(N) and sc=O(1)
        int ones=0;
        int max_ones=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            ones++;
            max_ones=Math.max(max_ones,ones);
        }
        else if(nums[i]!=1){
            ones=0;
        }
       } 
       return max_ones;
    }
}