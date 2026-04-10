class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //Tc=O(n^2) and sc=O(n)
        //Two Loop
        int sum=0;
        int idx=0;
        int []ans=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                     return new int[]{i,j};
                }
            }
        }

        return ans;


        
    }
}