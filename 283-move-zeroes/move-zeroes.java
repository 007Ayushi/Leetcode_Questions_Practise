class Solution {
    public void moveZeroes(int[] nums) {
        
        //Method-1
        //TC=O(N)+O(N)=O(2N) = O(N) and sc=O(1)
        // int non_zeroes=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         nums[non_zeroes++]=nums[i];
        //     }
        // }

        // for(int i=non_zeroes;i<nums.length;i++){
        //     nums[i]=0;
        // }

        //Method-2

        //tc=O(N) and O(1)
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }


    }
}