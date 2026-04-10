class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //Tc=O(n^2) and sc=O(n)
        //Two Loop
        //Method 1 - Brute force Approch using 2 For Loop
        // int sum=0;
        // int idx=0;
        // int []ans=new int[2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             ans[0]=i;
        //             ans[1]=j;
        //              return new int[]{i,j};
        //         }
        //     }
        // }

        // return ans;

       //Second Approch - HashMap
       //Tc=o(n) and sc=O(n)
       HashMap<Integer,Integer> mp=new HashMap<>();
       int []ans=new int[2];
       for(int i=0;i<nums.length;i++){
            int ele=target-nums[i];

            if(!mp.containsKey(nums[i])){
                mp.put(ele,i);
            }
            else{
                ans[0]=mp.get(nums[i]);
                ans[1]=i;
               
            }
       }
         return ans;
    }
}