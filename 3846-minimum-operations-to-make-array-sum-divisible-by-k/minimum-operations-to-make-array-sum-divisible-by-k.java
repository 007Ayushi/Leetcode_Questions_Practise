class Solution {
    public int minOperations(int[] nums, int k) {

       int op=0;
       int sum=0;
       for(int i=0;i<nums.length;i++){
            sum+=nums[i];
       } 

       if(sum%k==0){
        return 0; 
       }

       while(sum!=0){
        if(sum%k==0){
            return op;
        }
        sum--;
        op++;
       }
       return op;
    }
}