class Solution {
    public void sortColors(int[] nums) {
        
        int zero = 0;
        int ones = 0;
        int twos = 0;

        // Count
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) zero++;
            else if(nums[i] == 1) ones++;
            else twos++;
        }

        // Fill
        for(int i = 0; i < nums.length; i++){
            if(i < zero){
                nums[i] = 0;
            }
            else if(i < zero + ones){
                nums[i] = 1;
            }
            else{
                nums[i] = 2;
            }
        }
    }
}