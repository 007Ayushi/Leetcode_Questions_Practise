class Solution {
    public boolean isTrionic(int[] nums) {    
    int n=nums.length;
    int p=-1,q=-1;
    boolean flag=true;

    if(n<3)return false;
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
   

    for(int i=1;i<n;i++){

        if(i<=p){
            if(nums[i]<=nums[i-1]){
               return false;
        }
    }
       else if( i<=q){
            if(nums[i]>=nums[i-1]){
                return false;
            }
        }

        else{
            if(nums[i]<=nums[i-1]){
                return false;
            }
        }
        }
         return true;
    }
      
 
    
}
    
