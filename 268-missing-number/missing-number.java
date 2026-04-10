class Solution {
    public int missingNumber(int[] nums) {

     //Method 1  
     int n=nums.length;
     int sumofnos=n*(n+1)/2;

     int sum=0;
     for(int i=0;i<n;i++){
        sum+=nums[i];
     } 

     int missing_no=sumofnos-sum;
     return missing_no;
    }
}