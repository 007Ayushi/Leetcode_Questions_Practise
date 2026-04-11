class Solution {
    public int[] twoSum(int[] nums, int target) {

     HashMap<Integer,Integer> mp=new HashMap<>();
     int ans[]=new int[2];
     for(int i=0;i<nums.length;i++){
        int remaining=target-nums[i];

        if(!mp.containsKey( remaining)){
            mp.put(nums[i],i);
        }
        else{
            ans[0]=mp.get(remaining);
            ans[1]=i;
        }
     }

     return ans;   
    }
}