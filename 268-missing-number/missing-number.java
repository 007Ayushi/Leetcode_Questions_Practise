class Solution {
    public int missingNumber(int[] nums) {

    //tc=O(N) and sc=O(1)
       int xor=0;
       for(int i=0;i<=nums.length;i++){
        xor^=i;
       } 
       for(int i=0;i<nums.length;i++){
        xor^=nums[i];
       }

       return xor;
    }
}