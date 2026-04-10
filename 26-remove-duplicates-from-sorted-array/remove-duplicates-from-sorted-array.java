class Solution {
    public int removeDuplicates(int[] nums) {
        
        // steps
        //1.Remove the duplicates 
        //2.Return the no. of unique elements k

        //TWO POINTER APPROACH
        //tc=o(n) and sc=O(1)
        int i=0,j=0,n=nums.length;
        while(j<n){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                nums[i+1]=nums[j];
                i++;
                j++;
            }
        }
        return i+1;

    }
}