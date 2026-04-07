class Solution {
    public boolean check(int[] nums) {

     //circular Approch
     //TC = O(n) and sc=O(1)
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
//we are counting how many times the order breaks in the circular array
//If is less than or equal to 1 then array is sorted and rotated.