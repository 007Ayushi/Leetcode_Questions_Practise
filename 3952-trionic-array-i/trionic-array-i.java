class Solution {
    public boolean isTrionic(int[] nums) {    
    int n=nums.length;
    int p=-1,q=-1;
    boolean flag=true;

    if(nums[n-2]>=nums[n-1])return false;
    if(nums[0]>=nums[1])return false;
    

    for(int i=1;i<n-1;i++){
        if(p==-1 && nums[i]>nums[i-1] && nums[i]>nums[i+1]){
            p=i;
        }

        if(q==-1 && nums[i]<nums[i-1] && nums[i]<nums[i+1]){
            q=i;
            break;
        }
    }
    if(p==-1 || q==-1)return false;

    // for(int i=1;i<n;i++){

    //     if(i<=p){
    //         if(nums[i-1]<nums[i]){
    //             flag=true;
    //         }
    //         else{
    //             flag=false;
    //         }
    //     }
    //     if(i>=p && i<=q){
    //         if(nums[p]>nums[i+1]){
    //             flag=true;
    //         }
    //     }

    //     if(i>=q){
    //         if(nums[n-1]>nums[q]){
    //             flag=true;
    //         }
    //     }
    // }

    // if(flag){
    //     return true;
    // }
    // return false;
     // 1️⃣ increasing till peak
        for (int i = 1; i <= p; i++) {
            if (nums[i] <= nums[i - 1]) return false;
        }

        // 2️⃣ decreasing till valley
        for (int i = p + 1; i <= q; i++) {
            if (nums[i] >= nums[i - 1]) return false;
        }

        // 3️⃣ increasing till end
        for (int i = q + 1; i < n; i++) {
            if (nums[i] <= nums[i - 1]) return false;
        }

        return true;

    }
}