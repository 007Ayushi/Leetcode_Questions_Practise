class Solution {
    public boolean check(int[] nums) {

     //circular Approch
     int n=nums.length;
     int cnt=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]>nums[(i+1)%n]){
            cnt++;
        }
     }

     return cnt<=1;

    }
}