class Solution {
    public int missingNumber(int[] nums) {

     //Method 1  - tc=O(N) and sc=O(1)
     int n=nums.length;
     int sumofnos=n*(n+1)/2;

     int array_sum=0;
     for(int i=0;i<n;i++){
        array_sum+=nums[i];
     } 

     int missing_no=sumofnos-array_sum;
     return missing_no;
    }
}